package com.kriukov.microservice.demo.othereurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OtherEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OtherEurekaClientApplication.class, args);
    }

}
