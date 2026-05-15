package com.sample.config;

import com.sample.interceptor.ActionLogInterceptor;
import com.sample.interceptor.ClickInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }


    @Bean
    public ActionLogInterceptor actionLogInterceptor() {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Bean
    public ClickInterceptor clickInterceptor() {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
