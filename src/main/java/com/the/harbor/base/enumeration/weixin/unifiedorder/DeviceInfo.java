package com.the.harbor.base.enumeration.weixin.unifiedorder;

import com.the.harbor.base.enumeration.base.Behaviour;

/**
 * 设备号
 * @author zhangchao
 *
 */
public enum DeviceInfo implements Behaviour {

	WEB("WEB", "PC网页或公众号内支付");

	private String value;

	private String desc;

	private DeviceInfo(String value, String desc) {
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
