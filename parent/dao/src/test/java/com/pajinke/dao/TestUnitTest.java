package com.pajinke.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import com.pajinke.dao.impl.TestDaoImpl;

@ContextConfiguration(locations = { "/applicationContext.xml" })
@ActiveProfiles("production")
public class TestUnitTest extends SpringTransactionalTestCase {

	@Autowired
	TestDaoImpl testDaoImpl;
	
	@Test
	public void TestUnitTest() {
		// TODO Auto-generated constructor stub
		testDaoImpl.getUsers();
		
	}

}
