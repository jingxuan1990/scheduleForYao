package com.jingxuan.is.yao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ChiYaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChiYaoApplication.class, args);
    }
}
