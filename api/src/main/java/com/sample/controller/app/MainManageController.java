package com.sample.controller.app;

import com.sample.common.response.CommonResponse;
import com.sample.dto.response.MainCalendarResponse;
import com.sample.service.CustomUserDetails;
import com.sample.service.MainService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = { "/app", "/loca" })
@RequiredArgsConstructor
@Tag(name = "MAIN API", description = "메인 API")
public class MainManageController {

    @Operation(summary = "메인페이지 이벤트 전체 정보 조회", description = "일자별로 이벤트 전체 정보를 조회합니다.", responses = {
            @ApiResponse(responseCode = "200", description = "조회 성공", content = @Content(schema = @Schema(implementation = MainCalendarResponse.class))) })
    @GetMapping(value = "/events")
    public ResponseEntity<CommonResponse<Object>> getCalendarInfov1(
            @AuthenticationPrincipal CustomUserDetails userDetails) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
