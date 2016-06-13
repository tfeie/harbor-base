package com.the.harbor.base.enumeration.hypaymentorder;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum PayType implements Behaviour {

	WEIXIN("10", "微信支付");

	private String value;

	private String desc;

	private PayType(String value, String desc) {
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
