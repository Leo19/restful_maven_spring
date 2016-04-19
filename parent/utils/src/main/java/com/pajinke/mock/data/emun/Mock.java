package com.pajinke.mock.data.emun;

public enum Mock {
	
	test("##");
	
	Mock(String value) {
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
