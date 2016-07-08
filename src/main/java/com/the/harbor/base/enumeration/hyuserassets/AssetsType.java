package com.the.harbor.base.enumeration.hyuserassets;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum AssetsType implements Behaviour {

	CASH("cash", "现金"),

	HAIBEI("haibei", "海贝");

	private String value;

	private String desc;

	private AssetsType(String value, String desc) {
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
