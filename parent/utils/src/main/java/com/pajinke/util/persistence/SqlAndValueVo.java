package com.pajinke.util.persistence;

public class SqlAndValueVo {
	private String sql;
	private Object[] values;
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public Object[] getValues() {
		return values;
	}
	public void setValues(Object[] values) {
		this.values = values;
	}
	/**
	 * 
	 */
	public SqlAndValueVo(String sql, Object[] values) {
		this.sql = sql;
		this.values = values;
	}
	
}
