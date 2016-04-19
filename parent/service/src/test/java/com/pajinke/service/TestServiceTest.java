package com.pajinke.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "/applicationContext.xml" })
@ActiveProfiles("test")
public class TestServiceTest extends AbstractJUnit4SpringContextTests {
	@Autowired
	TestService testService;
	
//	@Test
	public void getUsers() {
		List list = testService.getUsers();
		System.out.println(list.size());
	}

	@Test
	public void quickQuery() {
		Map<String, Object> searchParams = new HashMap<String, Object>();
		List list = null;
		
//		searchParams.put("EQ_roles", "user");
//		list = testService.quickQuery(searchParams);
//		System.out.println(list.size());
		
//		searchParams = new HashMap<String, Object>();
//		searchParams.put("GTE_id", 1);
//		searchParams.put("LTE_id", 2);
//		list = testService.quickQuery(searchParams);
//		System.out.println(list.size());
//		
//		searchParams = new HashMap<String, Object>();
//		searchParams.put("GT_id", 1);
//		searchParams.put("LT_id", 2);
//		list = testService.quickQuery(searchParams);
//		System.out.println(list.size());
		
//		searchParams = new HashMap<String, Object>();
//		searchParams.put("IN_id", new Object[]{1, 3});
//		list = testService.quickQuery(searchParams);
//		System.out.println(list.size());
		
		searchParams = new HashMap<String, Object>();
		searchParams.put("LIKE_login_name", "se");
		list = testService.quickQuery(searchParams);
		System.out.println(list.size());
	}
}
