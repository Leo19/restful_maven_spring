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

import org.apache.commons.lang3.StringUtils;

import com.pajinke.util.Collections3;
import com.pajinke.util.Reflections;
import com.pajinke.util.UserProfileAttributes;

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
					System.out.println("====================="+filter.value.toString());
					break;
				case NEQ:
					sqlBuf.append(" != ? ");
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
					System.out.println(filter.value.getClass());
					if (filter.value instanceof Object[]) {
						values = (Object[])filter.value;
					} else if (filter.value instanceof Collection) {
						values = ((Collection)filter.value).toArray();
					} else {
						values = new Object[]{filter.value};
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
				case NIN:
					Object[] valuesNotIn = null;
					if (filter.value instanceof Object[]) {
						valuesNotIn = (Object[])filter.value;
					} else if (filter.value instanceof Collection) {
						valuesNotIn = ((Collection)filter.value).toArray();
					} else {
						valuesNotIn = new Object[]{filter.value};
					}
					
					if (valuesNotIn == null || valuesNotIn.length == 0) {
						continue;
					}

					sqlBuf.append(" not in (");
					for (int i = 0; i < valuesNotIn.length; i ++) {
						sqlBuf.append("?");
						if (i < valuesNotIn.length - 1) {
							sqlBuf.append(",");
						}
						
						valueList.add(valueTypeCast(entityClazz, filter.fieldName, valuesNotIn[i].toString()));
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
		} else if (fieldType == Double.class) {
			return Double.parseDouble(value);
		} else if (fieldType == Float.class) {
			return Float.parseFloat(value);
		} else if (fieldType == Date.class) {
			return new Date(Long.parseLong(value));
		} else {
			return value;
		}
	}
	
	public static String parseSelFromColumn(String strColumn) {
		if(StringUtils.isBlank(strColumn)){
			return " select * from dw_label_data_tab";
		} else {
			String[] columnNames = strColumn.split(",");
			
			if(columnNames == null || columnNames.length <= 0) {
				return " select * from dw_label_data_tab";
			} else {
				// 由于列名由接口调用方指定，检测列名，有错误的抛异常
				if(checkColumnName(columnNames)) {
					return null;
				}
				StringBuffer sqlBuffer = new StringBuffer("select ");
				for(int i = 0 ; i < columnNames.length ; ++i) {
					sqlBuffer.append(columnNames[i]);
					if(i != columnNames.length - 1) {
						sqlBuffer.append(",");
					}
				}
				sqlBuffer.append(" from dw_label_data_tab");
				System.out.println(" select SQL:"+sqlBuffer.toString());
				return sqlBuffer.toString();
			}
		}
	}
	
	/**
	 * 对接口调用方指定的字段名称check
	 * @return 返回true则证明有列名错误
	 * Author: Leo
	 * Date:2016年4月21日 下午6:49:09
	 */
	private static boolean checkColumnName(String[] speColNames) {
		// 数据库字段对应的javaBean，属性和column名字是一一对应的
		String[] realColNames = UserProfileAttributes.attrs;
		
		// 返回结果
		boolean hasWrongColumnName = false;
		
		// 双重循环确定所有的列名都没写错
		for(int i = 0 ; i < speColNames.length ; ++i) {
			boolean isAColumn = false;
			// 属性名字没写错，确实存在，则结束内循环
			String speColName = speColNames[i];
			for(int j = 0 ; j < realColNames.length ; ++j) {
				if(speColName.equals(realColNames[j])){
					isAColumn = true;
					break;
				}
			}
			
			// 有写错的列名
			if(!isAColumn) {
				hasWrongColumnName = true;
				break;
			} else {
				continue;
			}
		}
		
		return hasWrongColumnName;
	}
}
