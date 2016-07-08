package com.the.harbor.base.enumeration.hyuserassets;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum AssetsStatus implements Behaviour {

	NORMAL("10", "正常"),

	FROZEN("20", "冻结");

	private String value;

	private String desc;

	private AssetsStatus(String value, String desc) {
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
