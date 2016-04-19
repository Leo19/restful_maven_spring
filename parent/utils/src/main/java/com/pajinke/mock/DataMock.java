package com.pajinke.mock;

import java.lang.reflect.Method;

import com.pajinke.entity.LabelData2;
import com.pajinke.mock.data.annotation.MockList;
import com.pajinke.mock.data.annotation.MockNumber;

public class DataMock {
	
	@MockList("1,2,3")
	public void foo() {
		
	}
	
	public static void main2(String[] args) throws NoSuchMethodException, SecurityException {
//		Method m = DataMock.class.getMethod("foo");
//		System.out.println(m.getAnnotations().length);
//		System.out.println(m.getDeclaredAnnotations().length);
//		System.out.println(m.isAnnotationPresent(MockList.class));
		
//		Method m = LabelData2.class.getDeclaredMethod("getAttr_gender");
//		System.out.println(m.getDeclaredAnnotations().length);
//		System.out.println(m.isAnnotationPresent(MockList.class));
		
	}
	public static void main(String args[]) {
		Method[] methods = LabelData2.class.getDeclaredMethods();
		System.out.println(methods.length);
		
		StringBuffer insertPart = new StringBuffer();
		
		for (int i = 0; i < methods.length; i++) {
			if (!methods[i].getName().startsWith("get")) {
				continue;
			}
			if (methods[i].isAnnotationPresent(MockList.class)) {
				System.out.println(i + "@\t" + methods[i].getName());
				MockList mockList = methods[i].getAnnotation(MockList.class);
				System.out.println(mockList.value());
			} else if (methods[i].isAnnotationPresent(MockNumber.class)) {
				MockNumber mockNumber = methods[i].getAnnotation(MockNumber.class);
				System.out.println(i + "#\t" + methods[i].getName());
			}
		}
	}
}
