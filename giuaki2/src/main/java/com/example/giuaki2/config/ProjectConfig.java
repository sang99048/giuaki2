package com.example.giuaki2.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ProjectConfig {
    @Bean
    OpenAPI openAPI() {
        return new OpenAPI().info(new Info()
                .title(" my name is Sang")
                .version("4.0")
        );
    }
}
