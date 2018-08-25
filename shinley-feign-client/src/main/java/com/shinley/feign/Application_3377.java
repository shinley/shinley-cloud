package com.shinley.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//@EnableFeignClients(basePackages = {"com.shinley.feign"})
//@ComponentScan("com.shinley.feign")
@EnableFeignClients
@SpringBootApplication
public class Application_3377 {
    public static void main(String[] args) {
        SpringApplication.run(Application_3377.class, args);
    }
}
