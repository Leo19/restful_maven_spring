package com.pajinke.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pajinke.dao.LabelDataDao;
import com.pajinke.dao.TestDao;
import com.pajinke.entity.LabelData;
import com.pajinke.util.persistence.DynamicSpecifications;
import com.pajinke.util.persistence.Page;
import com.pajinke.util.persistence.PageUtil;
import com.pajinke.util.persistence.SearchFilter;
import com.pajinke.util.persistence.SqlAndValueVo;

/**
 * dw_label_data_tab的service类
 * Author Leo)pajinke.com
 * Date:2016年4月20日 下午2:08:33
 * Copyright (c) 2016, pajinke.com All Rights Reserved
 */
@Component
public class LabelDataService {
	@Autowired
	private LabelDataDao labelDataDao;
	
	@Autowired
	private TestDao testDao;
	
	private static Logger logger = LoggerFactory.getLogger(LabelDataService.class);

	public int countLabelData(Map<String,Object> searchParams) {
		Map<String,SearchFilter> searchFilterMap = SearchFilter.parse(searchParams);
		SqlAndValueVo sqlAndValueVo = DynamicSpecifications.bySearchFilter(searchFilterMap.values(),LabelData.class);
		
		return (Integer)labelDataDao.countLabelData(sqlAndValueVo.getSql(), sqlAndValueVo.getValues());
	}
	
	/**
	 * @param searchParams
	 * @param strColumn
	 * @return
	 * Author: Leo
	 * Date:2016年4月21日 下午3:04:40
	 */
	public Page<Map<String,Object>> getUserProfileLabels(Map<String,Object> searchParams, Page<Map<String,Object>> page, String strColumn) {
		Map<String,SearchFilter> searchFilterMap = SearchFilter.parse(searchParams);
		
		SqlAndValueVo sqlAndValueVo = DynamicSpecifications.bySearchFilter(searchFilterMap.values(), LabelData.class);
		SqlAndValueVo sqlAndValueVoPage = PageUtil.parse(sqlAndValueVo, page);
		
		// 根据列名拼select columns 的SQL语句
		String selSql = DynamicSpecifications.parseSelFromColumn(strColumn);
		if(StringUtils.isBlank(selSql)) {
			logger.error("e列名拼写错误!");
			return null;
		}
		
		int rowCounts = 0;
		final String countSql = sqlAndValueVo.getSql();
		final Object[] countSqlValues = sqlAndValueVo.getValues();
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
		try {
			rowCounts = fixedThreadPool.submit(new Callable<Integer>() {
				public Integer call() {
					int rows = labelDataDao.countLabelData(countSql, countSqlValues);
					return rows;
				}  
			}).get();
		} catch (InterruptedException e) {
			logger.error("固定线程池中计算圈定用户的值出错了");
			e.printStackTrace();
		} catch (ExecutionException e) {
			logger.error("固定线程池中计算圈定用户的值出错了",e);
			e.printStackTrace();
		}
		
		List<Map<String,Object>> lbs = null;
		final String selColSql = selSql;
		final String pageWhereSql = sqlAndValueVoPage.getSql();
		final Object[] pageSqlValues = sqlAndValueVoPage.getValues();
		try {
			lbs = fixedThreadPool.submit(new Callable<List<Map<String,Object>>>() {
				public List<Map<String,Object>> call() {
					List<Map<String,Object>> results = labelDataDao.getUserProfileLabels(selColSql,pageWhereSql, pageSqlValues);
					return results;
				}  
			}).get();
		} catch (InterruptedException e) {
			logger.error("固定线程池中计算圈定用户的值出错了",e);
			e.printStackTrace();
		} catch (ExecutionException e) {
			logger.error("固定线程池中计算圈定用户的值出错了",e);
			e.printStackTrace();
		}		
		
		System.out.println("================================rowCounts:"+rowCounts);
		System.out.println("================================lbs.size():"+lbs.size());
		
		// 总数和查询结果明细
		//int rowCount = labelDataDao.countLabelData(sqlAndValueVo.getSql(), sqlAndValueVo.getValues());
		//List<Map<String,Object>> labels = labelDataDao.getUserProfileLabels(selSql,sqlAndValueVoPage.getSql(), sqlAndValueVoPage.getValues());
		
		// 返回结果
		Page<Map<String,Object>> pageResult = new Page<Map<String,Object>>();
		pageResult.setPageNo(page.getPageNo());
		pageResult.setPageSize(page.getPageSize());
		pageResult.setTotalCount(rowCounts);
		pageResult.setResult(lbs);
		return pageResult;
	}
}
