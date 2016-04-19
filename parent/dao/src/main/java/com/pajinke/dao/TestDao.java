package com.pajinke.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.pajinke.bo.UserBo;

/**
 * Created by liushun on 16/4/7.
 */
@Component
public class TestDao {
	

	private static Logger logger = LoggerFactory.getLogger(TestDao.class);
	
	@Autowired
	DataSource dataSource;

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
//		String sql = "select * from table_test " + whereSql;
		logger.info(sql);
		return jdbcTemplate.queryForList(sql, params);
	}
}

class UserBoMapper implements RowMapper {
	public Object mapRow(ResultSet resultSet, int index) throws SQLException {
		UserBo user = new UserBo();

		// 设定属性
		user.setId(resultSet.getInt("id"));
		user.setName(resultSet.getString("name"));
		user.setAge(resultSet.getInt("age"));
		user.setAddress(resultSet.getString("address"));
		user.setSalary(resultSet.getFloat("salary"));

		return user;
	}
}
