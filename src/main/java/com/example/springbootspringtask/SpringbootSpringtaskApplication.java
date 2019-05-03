package com.example.springbootspringtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;


@EnableScheduling
@ComponentScan(basePackages="cn.itcast.wk")
@SpringBootApplication
public class SpringbootSpringtaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSpringtaskApplication.class, args);
    }

}
