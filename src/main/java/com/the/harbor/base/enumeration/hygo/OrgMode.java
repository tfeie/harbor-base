package com.the.harbor.base.enumeration.hygo;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum OrgMode implements Behaviour {

	OFFLINE("offline", "线下活动"),

	ONLINE("online", "线上活动");

	private String value;

	private String desc;

	private OrgMode(String value, String desc) {
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
