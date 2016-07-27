package com.the.harbor.base.enumeration.hyarea;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum AreaLevel implements Behaviour {

	PROVICE("10", "省级"),

	CITY("20", "地市级");

	private String value;

	private String desc;

	private AreaLevel(String value, String desc) {
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
