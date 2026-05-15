package com.sample.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CoreConfig {

    @Bean
    public ModelMapper modelMapper() {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
