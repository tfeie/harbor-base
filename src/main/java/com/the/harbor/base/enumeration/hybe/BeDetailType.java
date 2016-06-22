package com.the.harbor.base.enumeration.hybe;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum BeDetailType implements Behaviour {

	TEXT("text", "文本"),

	IMAGE("image", "图片");

	private String value;

	private String desc;

	private BeDetailType(String value, String desc) {
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
