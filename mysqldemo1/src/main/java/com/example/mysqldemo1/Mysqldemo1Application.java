package com.example.mysqldemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mysqldemo1.dao")
public class Mysqldemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mysqldemo1Application.class, args);
    }
}
