package com.the.harbor.base.enumeration.hypaymentorder;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum PayStatus implements Behaviour {

	NO_PAY("10", "未支付"),

	SUCCESS_PAY("20", "支付成功"),

	FAILURE_PAY("21", "支付失败");

	private String value;

	private String desc;

	private PayStatus(String value, String desc) {
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
