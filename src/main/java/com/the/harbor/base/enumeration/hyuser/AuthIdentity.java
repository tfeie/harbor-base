package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum AuthIdentity implements Behaviour {

	ENTREPRENEUR("1000", "创业者"),
	
	INVESTOR("2000", "投资人"),

	MENTOR("3000", "导师"),

	CYSERVICE("4000", "创业服务");

	private String value;

	private String desc;

	private AuthIdentity(String value, String desc) {
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
