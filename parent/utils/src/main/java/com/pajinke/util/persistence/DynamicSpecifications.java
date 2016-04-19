/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.pajinke.util.persistence;

import java.lang.reflect.Field;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.pajinke.util.Collections3;
import com.pajinke.util.Reflections;

public class DynamicSpecifications {

	// public static String bySearchFilter(final Collection<SearchFilter>
	// filters, final Class<T> entityClazz) {
	public static SqlAndValueVo bySearchFilter(final Collection<SearchFilter> filters, final Class entityClazz) {
		if (Collections3.isNotEmpty(filters)) {
			StringBuffer sqlBuf = new StringBuffer();
			List<Object> valueList = new ArrayList<Object>(filters.size());
			sqlBuf.append(" where 1 = 1 ");
			for (SearchFilter filter : filters) {
				// nested path translate, 如Task的名为"user.name"的filedName,
				// 转换为Task.user.name属性
				// String[] names = StringUtils.split(filter.fieldName, ".");
				// Path expression = root.get(names[0]);
				// for (int i = 1; i < names.length; i++) {
				// expression = expression.get(names[i]);
				// }
				sqlBuf.append(" and ").append(filter.fieldName);

				// logic operator
				switch (filter.operator) {
				case EQ:
					sqlBuf.append(" = ? ");
					valueList.add(valueTypeCast(entityClazz, filter.fieldName, filter.value.toString()));
					break;
				case LIKE:
//					sqlBuf.append(" like ").append("'%" + filter.value + "%'");
					sqlBuf.append(" like ?");
//					valueList.add(filter.value);
					valueList.add("%" + filter.value + "%");
					break;
				case GT:
					sqlBuf.append(" > ? ");
					valueList.add(valueTypeCast(entityClazz, filter.fieldName, filter.value.toString()));
					break;
				case LT:
					sqlBuf.append(" < ? ");
					valueList.add(valueTypeCast(entityClazz, filter.fieldName, filter.value.toString()));
					break;
				case GTE:
					sqlBuf.append(" >= ? ");
					valueList.add(valueTypeCast(entityClazz, filter.fieldName, filter.value.toString()));
					break;
				case LTE:
					sqlBuf.append(" <= ? ");
					valueList.add(valueTypeCast(entityClazz, filter.fieldName, filter.value.toString()));
					break;
				case IN:
					Object[] values = null;
					if (filter.value instanceof Object[]) {
						values = (Object[])filter.value;
					} else if (filter.value instanceof Collection) {
						values = ((Collection)filter.value).toArray();
					}
					
					if (values == null || values.length == 0) {
						continue;
					}

					sqlBuf.append(" in (");
					for (int i = 0; i < values.length; i ++) {
						sqlBuf.append("?");
						if (i < values.length - 1) {
							sqlBuf.append(",");
						}
						
						valueList.add(valueTypeCast(entityClazz, filter.fieldName, values[i].toString()));
					}
					sqlBuf.append(" )");
					break;
				}
			}
			return new SqlAndValueVo(sqlBuf.toString(), valueList.toArray());
		}
		
		return new SqlAndValueVo("", null);
	}
	
	private static Object valueTypeCast(Class clz, String fieldName, String value) {
		Class fieldType = null;
		for (Class<?> superClass = clz; superClass != Object.class; superClass = superClass.getSuperclass()) {
			try {
				Field field = superClass.getDeclaredField(fieldName);
				Reflections.makeAccessible(field);
				fieldType = field.getType();
			    break;
			} catch (NoSuchFieldException e) {// NOSONAR
				// Field不在当前类定义,继续向上转型
			}
		}
		
		if (fieldType == Integer.class) {
			return Integer.parseInt(value);
		} else if (fieldType == Long.class) {
			return Long.parseLong(value);
		} else if (fieldType == Date.class) {
			return new Date(Long.parseLong(value));
		} else {
			return value;
		}
	}
}
