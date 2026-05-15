package com.sample.controller;

import com.sample.common.response.CommonResponse;
import com.sample.common.response.ResponseCode;
import com.sample.dto.request.EmailRequest;
import com.sample.dto.request.PartnerAuthRequest;
import com.sample.dto.request.TokenRequest;
import com.sample.dto.request.web.WebLoginRequest;
import com.sample.dto.request.web.WebPwdRequest;
import com.sample.service.WebAuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "web/auth")
@RequiredArgsConstructor
@Tag(name = "Auth API", description = "인증 API")
public class AuthManageController {

    private final WebAuthService authService;

    @Operation(summary = "회원 가입 - 완료", description = "회원 가입을 합니다.", responses = {
            @ApiResponse(responseCode = "200", description = "등록 성공", content = @Content(schema = @Schema(implementation = PartnerAuthRequest.class))) })
    @PostMapping(value = "sign-up")
    public ResponseEntity<CommonResponse<Object>> signUp(@RequestBody PartnerAuthRequest partnerAuthRequest) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Operation(summary = "회원 로그인(jwt 토큰 발급) - 완료", description = "회원용 jwt 토큰을 발급합니다.", responses = {
            @ApiResponse(responseCode = "200", description = "로그인 성공", content = @Content(schema = @Schema(implementation = WebLoginRequest.class))) })
    @PostMapping(value = "sign-in")
    public ResponseEntity<CommonResponse<Object>> signIn(@RequestBody WebLoginRequest loginRequest) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
