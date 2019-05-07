package com.loan.exception;

public enum XbaseError {

	// X-xx(01 info 02 error)-xx(unit)-xxx(number)

	LOGIN_ERROR("000001", "帐号密码错误."),
	LOGIN_EMPTY("000002","帐号密码不能为空"),


	LOGIN_STATE_VERIFY("000006","权限不足"),

	
	ABNORMAL_ROLLBACK("H100002","异常回滚"),

	SYS_PARAM_ERROR("X0110003", "Parameter invalid."),
	SYS_OPERATION_ERROR("X0110006", "System operation error."),
	;

	private String errorCode;
	private String errorDesc;

	XbaseError(String errorCode, String errorDesc) {
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}

	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}

	public String getError() {
		return errorCode + ":" + errorDesc;
	}

	public String getError(String msg) {
		return errorCode + ":" + errorDesc + "," + msg;
	}
}