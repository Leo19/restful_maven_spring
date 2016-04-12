package com.pajinke.dao;

import com.pajinke.bo.UserBo;

import java.util.List;

/**
 * Created by liushun on 16/3/31.
 */
public interface TestDao {
    public interface TestDaoImpl {
        public List<UserBo> getPostgresqlDatas();
    }
}
