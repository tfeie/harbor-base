package com.the.harbor.base.enumeration.dict;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum ParamCode implements Behaviour {

	USER_TYPE("USER_TYPE", "用户类型"),

	AUTH_STS("AUTH_STS", "用户认证状态"),

	SEX("SEX", "性别"),

	ABROAD_COUNTRY("ABROAD_COUNTRY", "留学国家"),

	ABROAD_UNIVERSITY("ABROAD_UNIVERSITY", "留学大学"),

	AT_COUNTRY("AT_COUNTRY", "当前所在国家"),

	AT_PROVINCE("AT_PROVINCE", "当前所在省份"),

	AT_CITY("AT_CITY", "当前所在城市"),

	MARITAL_STATUS("MARITAL_STATUS", "婚姻状态"),

	CONSTELLATION("CONSTELLATION", "星座"),

	INDUSTRY("INDUSTRY", "行业"),

	USER_STATUS("USER_STATUS", "用户状态"),

	MEMBER_LEVEL("MEMBER_LEVEL", "会员等级"),

	GO_TYPE("GO_TYPE", "GO类型"),

	PAY_MODE("PAY_MODE", "GO付费方式"),

	ORG_MODE("ORG_MODE", "GO活动组织形式"),

	ORDER_STATUS("ORDER_STATUS", "GO预约订单状态"),

	HAIBEI_PRICES("HAIBEI_PRICES", "海贝可售卖价格"),

	MEMBER_PRICES("MEMBER_PRICES", "会员可售卖价格"),

	INDEX_SILDER("INDEX_SILDER", "首页轮播图片地址");

	private String value;

	private String desc;

	private ParamCode(String value, String desc) {
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
