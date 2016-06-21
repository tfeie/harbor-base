package com.the.harbor.base.exception;

public class BusinessException extends GenericException {

	private static final long serialVersionUID = 1L;

	private boolean needjump;

	private String url;
	
	public BusinessException(String errorCode,String errorMessage) {
		super(errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.needjump = false;
	}

	public BusinessException(String errorMessage) {
		super(errorMessage);
		this.errorCode = "BUSI_CODE_0000";
		this.errorMessage = errorMessage;
		this.needjump = false;
	}

	public BusinessException(String errorMessage, boolean needjump, String url) {
		super(errorMessage);
		this.errorCode = "BUSI_CODE_0000";
		this.errorMessage = errorMessage;
		this.needjump = needjump;
		this.url = url;
	}

	public boolean isNeedjump() {
		return needjump;
	}

	public void setNeedjump(boolean needjump) {
		this.needjump = needjump;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
