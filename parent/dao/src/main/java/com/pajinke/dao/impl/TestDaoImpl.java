package com.pajinke.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.pajinke.bo.UserBo;
import com.pajinke.dao.TestDao;

/**
 * Created by liushun on 16/4/7.
 */
@Component
public class TestDaoImpl implements TestDao {
	@Autowired
	DataSource dataSource;

	public List<UserBo> getPostgresqlDatas() {
		String sql = "select id,name,age,address,salary from table_test where age < 15";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.query(sql, new UserBoMapper());
	}
	
	public List<Map> getUsers(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		String sql = "select * from ss_user";
		jdbcTemplate.queryForList(sql);
		
		return null;
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
