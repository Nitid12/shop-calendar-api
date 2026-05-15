package com.sample.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL") })
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
