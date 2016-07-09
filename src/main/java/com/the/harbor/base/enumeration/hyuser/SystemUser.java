package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum SystemUser implements Behaviour {

	SYSTEM("hy00000000", "系统用户");

	private String value;

	private String desc;

	private SystemUser(String value, String desc) {
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
