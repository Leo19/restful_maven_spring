package com.pajinke.mock.data.emun;

/**
 * 所有标识类型
 * 
 * @author lichengzhou333
 * 2016年4月19日
 */
public enum IndEmun {
	是("1"), 否("0");
	
	IndEmun(String value) {
		this.value = value;
	}
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
