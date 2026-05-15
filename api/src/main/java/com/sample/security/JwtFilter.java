package com.sample.security;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;

@RequiredArgsConstructor
public class JwtFilter extends GenericFilterBean {

    public static final String AUTHORIZATION_HEADER = "Authorization";

    public static final String BEARER_PREFIX = "Bearer ";

    private final TokenProvider tokenProvider;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    /**
     * [보안 비공개 로직]
     * 인증/인가 프로세스
     * 1. 입력된 자격 증명(Credential) 유효성 검증
     * 2. 세션/캐시(Redis) 기반 토큰 검증 및 발급 처리
     * 3. 권한에 따른 접근 제어 상태 갱신
     */
    private String resolveToken(HttpServletRequest request) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
