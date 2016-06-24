package com.the.harbor.base.vo;

import java.io.Serializable;

public class MNSMQ implements Serializable {

	private static final long serialVersionUID = 1L;

	// 消息标识
	private String mqId;

	// 消息类型
	private String mqType;

	// 消息体
	private MNSBody body;

	public MNSMQ() {

	}

	public MNSMQ(String mqId, String mqType, MNSBody body) {
		this.mqId = mqId;
		this.mqType = mqType;
		this.body = body;
	}

	public String getMqType() {
		return mqType;
	}

	public void setMqType(String mqType) {
		this.mqType = mqType;
	}

	public MNSBody getBody() {
		return body;
	}

	public void setBody(MNSBody body) {
		this.body = body;
	}

	public String getMqId() {
		return mqId;
	}

	public void setMqId(String mqId) {
		this.mqId = mqId;
	}

}
