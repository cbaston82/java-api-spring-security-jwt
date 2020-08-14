package com.imaginedesigndevelop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final Contact DEFAULT_CONTACT = new Contact(
        "William Newing", "https://www.pineappleapp.net/", "william" +
        ".newing@pineapple.net");

    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
        "PineApple API",
        "PineApple AP1 for IOS",
        "0.1.0",
        "TODO: update terms of service",
        DEFAULT_CONTACT.getName(),
        "TODO: Update License...",
        "TODO: Update license url...");

    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES =
        new HashSet<String>(Collections.singletonList("application/json"));

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .paths(PathSelectors.ant("/api/**"))
            .apis(RequestHandlerSelectors.basePackage("net.pineapple"))
            .build()
            .apiInfo(DEFAULT_API_INFO)
            .produces(DEFAULT_PRODUCES_AND_CONSUMES)
            .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
    }
}