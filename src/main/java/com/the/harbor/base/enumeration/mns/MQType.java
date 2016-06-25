package com.the.harbor.base.enumeration.mns;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum MQType implements Behaviour {

	MQ_HY_BE_LIKES("MQ_HY_BE_LIKES", "B&E点赞消息"),

	MQ_HY_GO_FAVORITE("MQ_HY_GO_FAVORITE", "G&O活动搜藏消息"),

	MQ_HY_GO_VIEWS("MQ_HY_GO_VIEWS", "G&O活动浏览消息"),

	MQ_HY_BE_COMMENT("MQ_HY_BE_COMMENT", "B&E评论消息"),

	MQ_HY_GO_COMMENT("MQ_HY_GO_COMMENT", "G&O评论消息");

	private String value;

	private String desc;

	private MQType(String value, String desc) {
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
