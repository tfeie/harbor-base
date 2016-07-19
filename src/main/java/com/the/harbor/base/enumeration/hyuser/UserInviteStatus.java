package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum UserInviteStatus implements Behaviour {

	INVITE_VALID("0", "生效"),
	
	INVITE_USING("1", "正在使用"),

	INVITE_INVALID("2", "失效");
	
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
