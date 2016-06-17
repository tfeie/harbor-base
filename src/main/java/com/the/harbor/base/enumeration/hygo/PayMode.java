package com.the.harbor.base.enumeration.hygo;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum PayMode implements Behaviour {

	FIXED_FEE("10", "固定费用，比如100元/人"),

	AA("20", "AA制，多退少补"),

	MY_TREAT("30", "我请客");

	private String value;

	private String desc;

	private PayMode(String value, String desc) {
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
