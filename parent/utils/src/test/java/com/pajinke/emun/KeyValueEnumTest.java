package com.pajinke.emun;

import org.junit.Test;

import com.pajinke.mock.data.emun.KeyValueEnum;

public class KeyValueEnumTest {
	@Test
	public void foo() {
		System.out.println(KeyValueEnum.EQ.name());
		System.out.println(KeyValueEnum.EQ.getOperator());
		System.out.println(KeyValueEnum.EQ.operator);
		
	}
}
