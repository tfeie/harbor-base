package com.the.harbor.base.enumeration.hynotify;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum NotifyType implements Behaviour {

	SYSTEM_NOTIFY("system.notify", "系统通知"),

	ADD_BE_COMMENT("add.be.comment", "BE添加了评论"),

	ADD_GO_COMMENT("add.go.comment", "GO添加了评论"),

	ADD_FRIEND("add.friend", "添加好友"),

	ADD_FANS("add.fans", "用户关注了谁");

	private String value;

	private String desc;

	private NotifyType(String value, String desc) {
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
