package com.samesh.localconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LocalConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalConfigServerApplication.class, args);
    }

}
