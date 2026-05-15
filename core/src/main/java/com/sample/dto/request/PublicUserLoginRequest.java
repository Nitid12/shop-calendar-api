package com.sample.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PublicUserLoginRequest {
    @Schema(description = "디바이스 id",defaultValue = "1")
    private Long deviceId;
}
