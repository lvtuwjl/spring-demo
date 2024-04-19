package com.example.demo.common.response;

import com.example.demo.common.errors.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Slf4j
public class ExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public ExceptionResponse handleException(Exception ex) {
        if (ex instanceof BizException) {
            log.warn(ex.getMessage(), ex);
            BizException bizException = (BizException) ex;
            return ExceptionResponse.create(bizException.getErrorCode(), bizException.getErrorMsg());
        } else {
            log.error(ex.getMessage(), ex);
            return ExceptionResponse.create(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
        }
    }
}