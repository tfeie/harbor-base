package com.the.harbor.base.enumeration.hybe;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum TopFlag implements Behaviour {

	YES("1", "置顶"),

	NO("0", "不是置顶");

	private String value;

	private String desc;

	private TopFlag(String value, String desc) {
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
