package com.the.harbor.base.enumeration.weixin.unifiedorder;

import com.the.harbor.base.enumeration.base.Behaviour;

/**
 * 交易类型
 * 
 * @author zhangchao
 *
 */
public enum TradeType implements Behaviour {

	JSAPI("JSAPI", "公众号支付"),

	NATIVE("NATIVE", "原生扫码支付"),

	APP("APP", "app支付");

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
