package com.the.harbor.base.enumeration.hyuserassets;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum TradeType implements Behaviour {

	DEPOSIT("10", "存入"),

	DEDUCTION("20", "扣除");

	private String value;

	private String desc;

	private TradeType(String value, String desc) {
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
