package com.authine.privoder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class PrivoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrivoderApplication.class, args);
    }

}
