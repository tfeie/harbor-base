package com.the.harbor.base.enumeration.hybecomments;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum Status implements Behaviour {

	NORMAL("normal", "正常"),
	
	HIDE("hide", "隐藏"),

	DELETED("deleted", "删除");

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
