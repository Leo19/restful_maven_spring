package com.pajinke.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "/applicationContext.xml" })
@ActiveProfiles("test")
public class LabelDataDaoTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	LabelDataDao labelDataDao;
	
	@Test
	public void testRowCount() {
		StringBuilder sqlBuilder = new StringBuilder(" where 1=1 ");
//		sqlBuilder.append(" attr_zodiac= ? ");
//		sqlBuilder.append(" and attr_age > ? ");
//		sqlBuilder.append(" and attr_age_range = ? ");
		sqlBuilder.append(" and activity_logins_cnt  < ? ");
		//sqlBuilder.append(" and attr_reg_ios_ind=? ");
		sqlBuilder.append(" and bind_annuity_ind = ? ");
		sqlBuilder.append(" and model_cash_correlation < ? ");
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
		Date date = null;
		try {
			date = sdf.parse("2016-04-26");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Object[] values = {50,"0",50.0};
		long startTime = System.currentTimeMillis();
		int rows = labelDataDao.countLabelData(sqlBuilder.toString(), values);
		long endTime = System.currentTimeMillis();
		System.out.printf("the SQL return %d rows take %d miliseconds total .\n", rows, (endTime - startTime));
		System.out.println(new Date().getTime());
	}

//	@Test
	public void testLabelDataDao() {
	}
	
}
