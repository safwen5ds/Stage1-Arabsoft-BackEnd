package com.StageArabSoft.OCR.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Component
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  
                        .allowedOrigins("http://localhost:4321")  
                        .allowedMethods("GET", "POST", "PUT", "DELETE")  
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}
