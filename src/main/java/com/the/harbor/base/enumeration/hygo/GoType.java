package com.the.harbor.base.enumeration.hygo;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum GoType implements Behaviour {

	GROUP("group", "一群人的活动"),

	ONE_ON_ONE("oneonone", "一对一的活动");

	private String value;

	private String desc;

	private GoType(String value, String desc) {
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
