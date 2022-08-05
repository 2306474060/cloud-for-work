package com.lin.tx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ConsumerMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain7001.class, args);
    }
}
