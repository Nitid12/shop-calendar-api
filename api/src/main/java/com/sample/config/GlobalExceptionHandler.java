package com.sample.config;

import com.sample.common.exception.BusinessException;
import com.sample.common.response.CommonResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice
@AllArgsConstructor
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

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

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
