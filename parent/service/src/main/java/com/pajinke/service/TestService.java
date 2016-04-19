package com.pajinke.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pajinke.bo.UserBo;
import com.pajinke.dao.TestDao;
import com.pajinke.entity.User;
import com.pajinke.util.persistence.DynamicSpecifications;
import com.pajinke.util.persistence.SearchFilter;
import com.pajinke.util.persistence.SqlAndValueVo;

/**
 * Created by liushun on 16/3/31.
 */
@Component
public class TestService {
	
	@Autowired
	private TestDao testDao;
	
    public List<UserBo> getTestDatas(){
        return testDao.getPostgresqlDatas();
    }
    
    public List<Map<String, Object>> getUsers(){
    	return testDao.getUsers();
	}
    
    public List<Map<String, Object>> quickQuery(Map<String, Object> searchParams){
    	Map<String, SearchFilter> searchFilterMap = SearchFilter.parse(searchParams);
    	
    	SqlAndValueVo sqlAndValueVo = DynamicSpecifications.bySearchFilter(searchFilterMap.values(), User.class);
		return testDao.quickQuery(sqlAndValueVo.getSql(), sqlAndValueVo.getValues());
	}
}
