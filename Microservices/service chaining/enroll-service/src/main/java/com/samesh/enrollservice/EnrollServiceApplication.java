package com.samesh.enrollservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan(basePackages = "enroll")
public class EnrollServiceApplication {

    @Bean
    public RestTemplate getRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(EnrollServiceApplication.class, args);
    }

}
