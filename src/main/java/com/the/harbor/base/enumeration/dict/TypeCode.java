package com.the.harbor.base.enumeration.dict;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum TypeCode implements Behaviour {

	HY_USER("HY_USER", "HY_USER"),

	HY_GO("HY_GO", "HY_GO"),
	
	HY_GO_JOIN("HY_GO_JOIN", "HY_GO_JOIN"),

	HY_BE("HY_BE", "HY_BE"),
	
	HY_COMMON("HY_COMMON", "HY_COMMON"),

	HY_GO_ORDER("HY_GO_ORDER", "HY_GO_ORDER");

	private String value;

	private String desc;

	private TypeCode(String value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	@Override
	public String toString() {
		return this.value + " is " + this.desc;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	@Override
	public String getDesc() {
		return this.desc;
	}

}
