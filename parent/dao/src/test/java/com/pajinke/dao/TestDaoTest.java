package com.pajinke.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "/applicationContext.xml" })
@ActiveProfiles("test")
public class TestDaoTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	TestDao testDaoImpl;
	
//	@Test
	public void TestUnitTest() {
		List list = testDaoImpl.getUsers();
		System.out.println(list.size());
	}
	
	@Test
	public void testTestDao() {
		List list = testDaoImpl.quickQuery("where id in (?, ?)", new Object[]{1, 2});
		System.out.println(list.size());
	}

}
