package com.lin.tx.common;

import com.lin.tx.common.config.LtxRuler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name=  "lintxProder8001", configuration = LtxRuler.class)
public class CommonMain80 {

    public static void main(String[] args) {
        SpringApplication.run(CommonMain80.class, args);
    }

}
