/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.pajinke.util.persistence;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Maps;

public class SearchFilter {

	public enum Operator {
		EQ, NEQ, LIKE, GT, LT, GTE, LTE, IN, NIN
	}

	public String fieldName;
	public Object value;
	public Operator operator;

	public SearchFilter(String fieldName, Operator operator, Object value) {
		this.fieldName = fieldName;
		this.value = value;
		this.operator = operator;
	}

	/**
	 * searchParams中key的格式为OPERATOR_FIELDNAME
	 */
	public static Map<String, SearchFilter> parse(Map<String, Object> searchParams) {
		Map<String, SearchFilter> filters = Maps.newHashMap();

		for (Entry<String, Object> entry : searchParams.entrySet()) {
			// 过滤掉空值
			String key = entry.getKey();
			Object value = entry.getValue();
//			if (StringUtils.isBlank((String) value)) {
//				continue;
//			}
			if (null == value) {
				continue;
			}
			if (value instanceof String && StringUtils.isBlank((String) value)) {
				continue;
			}
			// 拆分operator与filedAttribute
			String[] names = StringUtils.split(key, "_");
			if (names.length < 2) {
				throw new IllegalArgumentException(key + " is not a valid search filter name");
			}
			
			int indexMid = key.indexOf('_');
			String[] names2 = new String[2];
			names2[0] = key.substring(0, indexMid);
			names2[1] = key.substring(indexMid + 1);
			
			String filedName = names2[1];
			Operator operator = Operator.valueOf(names2[0]);

			// 创建searchFilter
			SearchFilter filter = new SearchFilter(filedName, operator, value);
			filters.put(key, filter);
		}

		return filters;
	}
}
