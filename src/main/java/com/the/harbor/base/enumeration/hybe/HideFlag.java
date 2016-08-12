package com.the.harbor.base.enumeration.hybe;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum HideFlag implements Behaviour {

	YES("1", "隐藏"),

	NO("0", "显示");

	private String value;

	private String desc;

	private HideFlag(String value, String desc) {
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
