package com.the.harbor.base.enumeration.hygojoin;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum OrderStatus implements Behaviour {

	APPLIED("10", "已报名申请"),

	WAIT_CONFIRM("11", "支付完成待确认"),

	AGREE("20", "同意"),

	REJECT("21", "拒绝"),

	FINISH("40", "活动结束");

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
