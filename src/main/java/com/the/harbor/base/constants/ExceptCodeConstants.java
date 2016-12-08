package com.the.harbor.base.constants;

public final class ExceptCodeConstants {
	private ExceptCodeConstants() {
	}

	// 处理成功[业务处理成功]
	public static final String SUCCESS = "000000";

	// 系统级异常[其它系统级异常，未知异常]
	public static final String SYSTEM_ERROR = "999999";

	public static final String PARAM_IS_NULL = "888888";

	// 参数校验失败
	public static final String VALID_ERROR = "66666";

}
