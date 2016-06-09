package com.the.harbor.base.enumeration.hytags;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum TagCat implements Behaviour {

	SYSTEM("10", "系统内置标签"),

	CUSTOMIZED("11", "自定义标签");

	private String value;

	private String desc;

	private TagCat(String value, String desc) {
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
