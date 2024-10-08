package com.example.servicediscoveryoct24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryOct24Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryOct24Application.class, args);
    }

}
