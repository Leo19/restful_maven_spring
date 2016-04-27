package com.pajinke.util.persistence;

import java.util.ArrayList;
import java.util.List;

public class PageUtil {
	private static SqlAndValueVo parse(Page page) {
		StringBuffer sqlBuf = new StringBuffer();
		sqlBuf.append(" limit ?")
//			.append(page.getPageSize())
			.append(" offset ?");
//			.append((page.getPageNo() - 1) * page.getPageSize());

		SqlAndValueVo sqlAndValueVo = new SqlAndValueVo(sqlBuf.toString(), new Object[]{page.getPageSize(), (page.getPageNo() - 1) * page.getPageSize()});
		
		return sqlAndValueVo;
	}
	
	public static SqlAndValueVo parse(SqlAndValueVo sqlAndValueVo, Page page) {
		String sql = null;
		Object[] values = null;
		
		SqlAndValueVo sqlAndValueVoPage = PageUtil.parse(page);
		sql = sqlAndValueVo.getSql() + sqlAndValueVoPage.getSql();
		
		if (sqlAndValueVo.getValues() == null) {
			values = sqlAndValueVoPage.getValues();
		} else {
			List list = new ArrayList(sqlAndValueVo.getValues().length + 2);
			for (int i = 0; i < sqlAndValueVo.getValues().length; i ++) {
				list.add(sqlAndValueVo.getValues()[i]);
			}
			for (int i = 0; i < sqlAndValueVoPage.getValues().length; i ++) {
				list.add(sqlAndValueVoPage.getValues()[i]);
			}
			values = list.toArray();
		}
		
		return new SqlAndValueVo(sql, values);
	}
}
