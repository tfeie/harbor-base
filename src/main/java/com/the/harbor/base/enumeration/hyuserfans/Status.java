package com.the.harbor.base.enumeration.hyuserfans;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum Status implements Behaviour {

	FANS("20", "关注成为粉丝"),

	CANCEL("21", "取消关注");

	private String value;

	private String desc;

	private Status(String value, String desc) {
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
