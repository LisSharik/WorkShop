package com.riwi.workshop.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "API for managing educational platform and its entities", version = "1.0", description = "Educational administration api documentation"))
public class OpenApiConfig {

}
