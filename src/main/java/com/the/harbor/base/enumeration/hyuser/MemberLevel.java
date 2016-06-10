package com.the.harbor.base.enumeration.hyuser;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum MemberLevel implements Behaviour {

	NOT("10", "非会员"),

	COMMON("11", "普通会员"),

	VIP("12", "VIP会员"),

	LIFE_VIP("13", "终身VIP会员");

	private String value;

	private String desc;

	private MemberLevel(String value, String desc) {
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
