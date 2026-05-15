package com.sample.exception;

import com.sample.common.exception.BusinessException;
import com.sample.common.response.CommonResponse;
import com.sample.common.response.ResponseCode;
import com.sample.domain.primary.store.model.dto.web.EventInfo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@AllArgsConstructor
public class GlobalExceptionHandler {

    @ExceptionHandler(BindException.class)
    public ResponseEntity<CommonResponse<Object>> handleBindingException(BindException exception) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommonResponse<Object>> handleException(Exception ex) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<CommonResponse<Object>> handleBusinessException(final BusinessException ex) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
