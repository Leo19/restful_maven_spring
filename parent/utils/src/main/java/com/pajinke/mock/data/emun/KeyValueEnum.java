package com.pajinke.mock.data.emun;

/**
 * @author lichengzhou333
 *
 */
public enum KeyValueEnum {

	EQ("="), LIKE("%"), GT(">"), LT("<"), GTE(">="), LTE("<="), IN("in");

	public String operator;

	private KeyValueEnum(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
}
