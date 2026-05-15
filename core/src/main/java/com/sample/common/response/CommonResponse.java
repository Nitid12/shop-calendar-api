package com.sample.common.response;

import com.sample.domain.common.enums.UsageStatusType;
import lombok.Data;

@Data
public class CommonResponse<T> {

    private T data;

    private String message;

    private String code;

    private UsageStatusType updateStatus;

    public CommonResponse(T data, ResponseCode code) {
        this.data = data;
        this.message = code.getMessage();
        this.code = code.getCode();
        this.updateStatus = null;
    }

    public CommonResponse(ResponseCode code) {
        this.data = null;
        this.message = code.getMessage();
        this.code = code.getCode();
        this.updateStatus = null;
    }

    public static CommonResponse of(final ResponseCode code) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
