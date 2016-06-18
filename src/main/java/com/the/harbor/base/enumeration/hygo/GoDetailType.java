package com.the.harbor.base.enumeration.hygo;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum GoDetailType implements Behaviour {

	TEXT("text", "文本"),

	IMAGE("image", "图片");

	private String value;

	private String desc;

	private GoDetailType(String value, String desc) {
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
