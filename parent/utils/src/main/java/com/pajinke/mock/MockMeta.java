package com.pajinke.mock;

public @interface MockMeta {
	public static final String TYPE_STRING = "string";
	public static final String TYPE_EMUN = "emun";
	public static final String TYPE_INT = "int";
	
	String type();
	
	int length();
}
