package com.persimmon.integrationtestdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.persimmon.integrationtestdemo.mapper")
public class IntegrationTestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationTestDemoApplication.class, args);
    }

}
