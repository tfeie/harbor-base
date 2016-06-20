package com.the.harbor.base.enumeration.hygoorder;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum OrderStatus implements Behaviour {

	WAIT_PAY("10", "待支付"),

	PAY_FAILURE("11", "支付失败"),

	WAIT_CONFIRM("20", "待海牛确认"),

	REJECT("21", "海牛拒绝"),

	WAIT_MEET("30", "待约见"),

	FINISH("40", "活动结束"),

	CANCEL("50", "取消");

	private String value;

	private String desc;

	private OrderStatus(String value, String desc) {
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
