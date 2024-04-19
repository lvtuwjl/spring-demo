package com.example.demo.common.errors;


import org.springframework.web.bind.annotation.ControllerAdvice;

public class BizException extends RuntimeException {
    /**
     * 错误码
     */
    protected int errorCode;
    /**
     * 错误信息
     */
    protected String errorMsg;

    public BizException() {
        super();
    }

    public BizException(int errorCode) {
        super(String.valueOf(errorCode));
        this.errorCode = errorCode;
    }


    public BizException(int errorCode, String extraErrorInfo) {
        super(String.valueOf(errorCode));
        this.errorCode = errorCode;
        this.errorMsg = extraErrorInfo;
    }



    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String getMessage() {
        return errorMsg;
    }
}
