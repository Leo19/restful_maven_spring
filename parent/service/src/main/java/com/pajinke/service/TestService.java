package com.pajinke.service;

import com.pajinke.bo.UserBo;
import com.pajinke.dao.impl.TestDaoImpl;

import java.util.List;

/**
 * Created by liushun on 16/3/31.
 */
public class TestService {
    public static List<UserBo> getTestDatas(){
        TestDaoImpl dao = new TestDaoImpl();
        return dao.getPostgresqlDatas();
    }
}
