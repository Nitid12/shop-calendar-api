package com.sample.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
