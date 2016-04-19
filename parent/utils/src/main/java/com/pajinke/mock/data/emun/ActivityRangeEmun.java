package com.pajinke.mock.data.emun;

/**
 * 活跃程度
 * 15日内登陆2-5次("一般活跃"),
	15日内登陆一次("登陆一次"),
	15日内未登录30日内登陆("轻度睡眠"),
	30日内未登录60日内登陆("中度睡眠");
 * 
 * @author lichengzhou333
 * 2016年4月19日
 */
public enum ActivityRangeEmun {
	a15日内登陆5次以上("高频活跃"),
	a15日内登陆2至5次("一般活跃"),
	a15日内登陆一次("登陆一次"),
	a15日内未登录30日内登陆("轻度睡眠"),
	a30日内未登录60日内登陆("中度睡眠");
	
	ActivityRangeEmun(String value) {
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
