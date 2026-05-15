package com.sample.dto.request.web;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class IdRequest {

    @Schema(defaultValue = "2")
    @NotNull
    private Long id;
}
