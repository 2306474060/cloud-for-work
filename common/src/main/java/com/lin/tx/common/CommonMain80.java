package com.lin.tx.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommonMain80 {

    public static void main(String[] args) {
        SpringApplication.run(CommonMain80.class, args);
    }

}
