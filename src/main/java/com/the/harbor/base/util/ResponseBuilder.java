package com.the.harbor.base.util;

import com.the.harbor.base.constants.ExceptCodeConstants;
import com.the.harbor.base.vo.Response;
import com.the.harbor.base.vo.ResponseHeader;

public final class ResponseBuilder {

	private ResponseBuilder() {

	}

	public static Response buildSuccessResponse(String message) {
		ResponseHeader responseHeader = buildSuccessResponseHeader(message);
		Response r = new Response();
		r.setResponseHeader(responseHeader);
		return r;
	}

	public static ResponseHeader buildSuccessResponseHeader(String message) {
		ResponseHeader responseHeader = new ResponseHeader(ExceptCodeConstants.SUCCESS, message);
		return responseHeader;
	}

}
