package com.the.harbor.base.enumeration.hyuserassets;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum AssetsUnit implements Behaviour {

	FEN("10", "人民币分"),

	GE("20", "个");

	private String value;

	private String desc;

	private AssetsUnit(String value, String desc) {
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
