package com.the.harbor.base.enumeration.hytags;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum TagType implements Behaviour {

	INTEREST("10", "适用用户兴趣标签"),

	SKILL("20", "适用用户技能标签"),

	BE("30", "适用于B&E的标签不细分类"),

	GO("40", "适用G&O的标签不细分类");

	private String value;

	private String desc;

	private TagType(String value, String desc) {
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
