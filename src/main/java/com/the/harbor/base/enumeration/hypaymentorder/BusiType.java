package com.the.harbor.base.enumeration.hypaymentorder;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum BusiType implements Behaviour {

	PAY_FOR_MEMBER("100000", "购买会员"),

	PAY_FOR_HAIBI("100001", "购买海币"),

	PAY_FOR_GROUP("100002", "支付GROUP活动费用"),

	REWARD_HB_FOR_BE("100003", "BE打赏海贝"),

	REWARD_HB_FOR_ONO("100004", "ONO打赏海贝"),

	REWARD_HB_FOR_GROUP("100005", "GROUP打赏海贝"),

	PAY_FOR_ONO("100006", "支付ONO活动费用");

	private String value;

	private String desc;

	private BusiType(String value, String desc) {
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
