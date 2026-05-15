package com.sample.config;

import com.sample.controller.interceptor.PartnerStatusInterceptor;
import com.sample.security.TokenProvider;
import com.sample.service.web.WebPartnerUserManageService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

    private final TokenProvider tokenProvider;

    private final WebPartnerUserManageService webPartnerUserManageService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
