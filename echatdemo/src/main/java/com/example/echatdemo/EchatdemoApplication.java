package com.example.echatdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class EchatdemoApplication {

        @RequestMapping("*")
        public String hello(){
            System.out.println("hello echat ..................");
            return "index";
        }

    public static void main(String[] args) {
        SpringApplication.run(EchatdemoApplication.class, args);
    }
}
