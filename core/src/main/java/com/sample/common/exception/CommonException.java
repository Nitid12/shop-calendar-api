package com.sample.common.exception;

import com.sample.common.response.CommonResponse;
import lombok.Getter;

import java.io.IOException;

@Getter
public class CommonException extends IOException {

    private final CommonResponse responseCode;

    public CommonException(CommonResponse responseCode) {
        super(responseCode.getMessage());
        this.responseCode = responseCode;
    }
}
