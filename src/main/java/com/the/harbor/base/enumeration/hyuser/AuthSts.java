package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum AuthSts implements Behaviour {

	NOT_APPLY("10", "未提交材料"),

	AUTH_PASS("12", "认证成功"),

	AUTH_FAILURE("11", "认证失败");

	private String value;

	private String desc;

	private AuthSts(String value, String desc) {
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
