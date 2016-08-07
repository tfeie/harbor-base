package com.the.harbor.base.enumeration.hygo;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum Status implements Behaviour {

	ING("ing", "进行中"),
	
	CANCEL("cancel", "撤销"),

	END("end", "结束");

	private String value;

	private String desc;

	private Status(String value, String desc) {
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
