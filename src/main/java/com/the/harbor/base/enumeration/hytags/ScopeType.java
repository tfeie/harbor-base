package com.the.harbor.base.enumeration.hytags;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum ScopeType implements Behaviour {

	USER("10", "适用用户"),

	GROUP("11", "适用GROUP活动"),
	
	ONO("13", "适用ono活动"),

	BE("12", "适用BE");

	private String value;

	private String desc;

	private ScopeType(String value, String desc) {
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
