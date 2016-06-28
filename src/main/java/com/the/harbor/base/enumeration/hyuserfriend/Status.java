package com.the.harbor.base.enumeration.hyuserfriend;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum Status implements Behaviour {

	APPLY("10", "申请成为好友"),

	REJECT("11", "拒绝或忽略申请"),

	AGREE("12", "同意申请成为好友"),

	CANCEL("13", "取消好友");

	private String value;

	private String desc;

	private Status(String value, String desc) {
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
