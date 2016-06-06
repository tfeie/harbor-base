package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum UserStatus implements Behaviour {

	AUTHORIZED_SUCCESS("20", "已认证"),

	UNAUTHORIZED("10", "未认证"),

	AUTHORIZED_FAILURE("11", "认证不通过");

	private String value;

	private String desc;

	private UserStatus(String value, String desc) {
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
