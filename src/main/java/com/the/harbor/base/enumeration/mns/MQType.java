package com.the.harbor.base.enumeration.mns;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum MQType implements Behaviour {

	MQ_HY_BE_INDEX_BUILD("MQ_HY_BE_INDEX_BUILD", "BE索引自动构建"),

	MQ_HY_BE_INDEX_COUNT_BUILD("MQ_HY_BE_INDEX_COUNT_BUILD", "BE索引统计类信息更新"),

	MQ_HY_GO_INDEX_BUILD("MQ_HY_GO_INDEX_BUILD", "GO索引自动构建"),

	MQ_HY_GO_INDEX_COUNT_BUILD("MQ_HY_GO_INDEX_COUNT_BUILD", "GO索引统计类信息更新"),

	MQ_HY_NOTIFY("MQ_HY_NOTIFY", "消息中心消息"),

	MQ_HY_SMS_RECORD("MQ_HY_SMS_RECORD", "短信发送消息记录"),

	MQ_HY_USER_ASSETS_TRADE("MQ_HY_USER_ASSETS_TRADE", "用户资产交易"),

	MQ_HY_GO_JOIN_CONFIRM("MQ_HY_GO_JOIN_CONFIRM", "群组活动用户报名审核"),

	MQ_HY_USER_FANS("MQ_HY_USER_FANS", "用户互粉"),

	MQ_HY_USER_FRIEND("MQ_HY_USER_FRIEND", "用户加好友"),

	MQ_HY_BE_LIKES("MQ_HY_BE_LIKES", "B&E点赞消息"),

	MQ_HY_GO_FAVORITE("MQ_HY_GO_FAVORITE", "G&O活动收藏消息"),

	MQ_HY_GO_VIEWS("MQ_HY_GO_VIEWS", "G&O活动浏览消息"),

	MQ_HY_BE_FAVORITE("MQ_HY_BE_FAVORITE", "BE收藏消息"),

	MQ_HY_BE_VIEWS("MQ_HY_BE_VIEWS", "BE浏览消息"),

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
