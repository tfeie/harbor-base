package com.the.harbor.base.enumeration.common;

import com.the.harbor.base.enumeration.base.Behaviour;

public enum BusiErrorCode implements Behaviour {

	WECHAT_UNAUTHORIZED("weixin_unauthoried", "微信未授权"),

	USER_UNREGISTER("user_unregister", "用户未注册"),

	USER_UNAUTHORIZED("user_unauthoried", "用户未通过认证"),

	USER_NOT_MEMBER("user_not_member", "用户不是会员"),

	HAIBEI_NOT_ENOUGH("haibei_not_enough", "海贝余额不足");

	private String value;

	private String desc;

	private BusiErrorCode(String value, String desc) {
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
