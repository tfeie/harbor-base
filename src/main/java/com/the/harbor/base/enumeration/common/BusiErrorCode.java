package com.the.harbor.base.enumeration.common;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum BusiErrorCode implements Behaviour {

	HAIBEI_NOT_ENOUGH("haibei_not_enough", "海贝余额不足");

	private String value;

	private String desc;

	private BusiErrorCode(String value, String desc) {
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
