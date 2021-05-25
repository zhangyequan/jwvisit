package com.jw.jwvisit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jw.jwvisit.dao")
public class JwvisitApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwvisitApplication.class, args);
    }

}
