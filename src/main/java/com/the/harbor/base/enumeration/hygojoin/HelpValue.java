package com.the.harbor.base.enumeration.hygojoin;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum HelpValue implements Behaviour {

	YIYOU("10", "是益友"),

	UNKNOW("20", "不知道");

	private String value;

	private String desc;

	private HelpValue(String value, String desc) {
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
