package com.the.harbor.base.enumeration.hypaymentorder;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum BusiType implements Behaviour {

	PAY_FOR_MEMBER("100000", "购买会员"),

	PAY_FOR_HAIBI("100001", "购买海币"),
	
	PAY_FOR_GO("100002", "支付GO活动费用");

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
