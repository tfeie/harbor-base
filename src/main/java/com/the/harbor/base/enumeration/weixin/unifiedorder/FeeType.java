package com.the.harbor.base.enumeration.weixin.unifiedorder;

import com.the.harbor.base.enumeration.base.Behaviour;

/**
 * 支付币种
 * 
 * @author zhangchao
 *
 */
public enum FeeType implements Behaviour {

	CNY("CNY", "人民币");

	private String value;

	private String desc;

	private FeeType(String value, String desc) {
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
