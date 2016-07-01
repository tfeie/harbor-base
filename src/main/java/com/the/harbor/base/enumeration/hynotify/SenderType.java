package com.the.harbor.base.enumeration.hynotify;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum SenderType implements Behaviour {

	SYSTEM("system", "系统发送"),

	USER("user", "具体的用户");

	private String value;

	private String desc;

	private SenderType(String value, String desc) {
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
