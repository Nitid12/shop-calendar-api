package com.sample.config;

import com.sample.security.JwtAccessDeniedHandler;
import com.sample.security.JwtAuthenticationEntryPoint;
import com.sample.security.TokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@RequiredArgsConstructor
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String[] PERMIT_URL_ARRAY = { "/app/docs", "/swagger-resources", "/swagger-resources/**",
            "/configuration/ui", "/configuration/security", "/swagger-ui.html", "/app/auth/ptoken", "/app/auth/device",
            "/**/swagger-*/**", "/**/v2/**", "/**/system/health-check", "/error" };

    private final JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    private final JwtAccessDeniedHandler jwtAccessDeniedHandler;

    private final TokenProvider tokenProvider;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
