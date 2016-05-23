package com.the.harbor.base.exception;

public class SystemException extends GenericException {

    private static final long serialVersionUID = 1L;

    public SystemException(String message) {
        super(message);
        this.errorMessage = message;
    }

    public SystemException(String errcode, String message) {
        super(message);
        this.errorCode = errcode;
        this.errorMessage = message;
    }

    public SystemException(Exception oriEx) {
        super(oriEx);
    }

    public SystemException(String message, Exception oriEx) {
        super(message, oriEx);
        this.errorMessage = message;
    }

}
