package com.the.harbor.base.enumeration.hynotify;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum Status implements Behaviour {

	UNREAD("unread", "未读"),

	READ("read", "已读"),

	DELETE("delete", "已经删除");

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
