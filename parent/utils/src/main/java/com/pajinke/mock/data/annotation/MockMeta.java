package com.pajinke.mock.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MockMeta {
	public static final String TYPE_STRING = "string";
	public static final String TYPE_EMUN = "emun";
	public static final String TYPE_INT = "int";
	
	String type();
	
	int length();
}
