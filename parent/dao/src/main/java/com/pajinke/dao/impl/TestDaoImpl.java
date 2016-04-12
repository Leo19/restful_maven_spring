package com.pajinke.dao.impl;

import com.pajinke.bo.UserBo;
import com.pajinke.dao.TestDao;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by liushun on 16/4/7.
 */

public class TestDaoImpl implements TestDao{
    private JdbcTemplate jdbcTemplate;

    public List<UserBo> getPostgresqlDatas(){
        String sql = "select id,name,age,address,salary from table_test where age < 15";
        return  jdbcTemplate.query(sql,new UserBoMapper());
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
