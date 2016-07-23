package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum UserInviteStatus implements Behaviour {

	NOT_USE("0", "可使用"),

	USED("1", "已使用");

	private String value;

	private String desc;

	private UserInviteStatus(String value, String desc) {
		this.value = value;
		this.desc = desc;
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
