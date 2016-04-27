package com.pajinke.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pajinke.bo.UserBo;

/**
 * Created by liushun on 16/4/7.
 */
@Component
public class LabelDataDao {
	// 日志工厂类
	private static Logger logger = LoggerFactory.getLogger(LabelDataDao.class);
	
	@Autowired
	DataSource dataSource;
	@SuppressWarnings("unchecked")
	public List<UserBo> getPostgresqlDatas() {
		String sql = "select id,name,age,address,salary from table_test where age < 15";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.query(sql, new UserBoMapper());
	}
	
	public List<Map<String, Object>> getUsers(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		String sql = "select * from t_user";
		return jdbcTemplate.queryForList(sql);
	}
	
	public List<Map<String, Object>> quickQuery(String whereSql, Object... params){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			dataSource.getConnection().setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql = "select * from t_user " + whereSql;
		logger.info(sql);
		return jdbcTemplate.queryForList(sql, params);
	}
	
	
	/**
	 * @param whereSQL
	 * @param params
	 * @return 根据条件计算用户数量
	 * Author Leo
	 * Date:2016年4月20日 上午11:32:12
	 */
	public int countLabelData(String whereSQL, Object... params) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			dataSource.getConnection().setAutoCommit(false);
		} catch (SQLException e) {
			logger.error("根据条件计算用户数量出错", e);
			e.printStackTrace();
		}
		
		String sql = "select count(dw_id) from dw_label_data_tab" + whereSQL;
		logger.info(sql);
		System.out.println("sql started =========================");
		System.out.println(sql);
		int rows = jdbcTemplate.queryForObject(sql, params,Integer.class);
		return rows;
	}
	
	/**
	 * @param whereSQL
	 * @param params
	 * @return 根据条件分页查询结果
	 * Author Leo
	 * Date:2016年4月20日 上午11:32:12
	 */
	public List<Map<String,Object>> getUserProfileLabels(String selSQL,String whereSQL, Object... params) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			dataSource.getConnection().setAutoCommit(false);
		} catch (SQLException e) {
			logger.error("根据条件计算用户数量出错", e);
			e.printStackTrace();
		}
		
		String sql = selSQL + whereSQL;
		logger.info(sql);
		System.out.println("sql started =========================");
		System.out.println(sql);
		List<Map<String,Object>> labels = jdbcTemplate.queryForList(sql, params);
		return labels;
	}
}