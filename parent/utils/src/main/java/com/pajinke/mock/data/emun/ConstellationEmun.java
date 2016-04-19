package com.pajinke.mock.data.emun;

/**
 * 所有星座枚举
 * @author lichengzhou333
 * 2016年4月19日
 */
public enum ConstellationEmun {
	白羊座("白羊座"),
	金牛座("金牛座"),
	双子座("双子座"),
	巨蟹座("巨蟹座"),
	狮子座("狮子座"),
	处女座("处女座"),
	天秤座("天秤座"),
	天蝎座("天蝎座"),
	射手座("射手座"),
	摩羯座("摩羯座"),
	水瓶座("水瓶座"),
	双鱼座("双鱼座");
	
	ConstellationEmun(String value) {
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
