package com.example.angulardemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Angulardemo1Application {

    @RequestMapping("/*")
    public String hello(){
        System.out.println("hello Angulardemo1Application ..................");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(Angulardemo1Application.class, args);
    }
}
