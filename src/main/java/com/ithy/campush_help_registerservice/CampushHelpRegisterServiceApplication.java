package com.ithy.campush_help_registerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CampushHelpRegisterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampushHelpRegisterServiceApplication.class, args);
    }

}
