package com.the.harbor.base.vo;

import java.io.Serializable;

/**
 * 消息体，业务消息继承此类
 * 
 * @author zhangchao
 *
 */
public class MNSBody implements Serializable {

	private static final long serialVersionUID = 1L;

	// 消息标识
	private String mqId;

	// 消息类型
	private String mqType;

	public String getMqId() {
		return mqId;
	}

	public void setMqId(String mqId) {
		this.mqId = mqId;
	}

	public String getMqType() {
		return mqType;
	}

	public void setMqType(String mqType) {
		this.mqType = mqType;
	}

}
