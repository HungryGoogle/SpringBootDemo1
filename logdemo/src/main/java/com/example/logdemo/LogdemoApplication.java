package com.example.logdemo;

import com.example.logdemo.log.LogUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class LogdemoApplication {

    @RequestMapping("*")
    @ResponseBody
    public String hello(){
        System.out.println("hello 1 ..................");
        LogUtil.info("hello 2 .................. ");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(LogdemoApplication.class, args);

//        LogUtil.info("LogdemoApplication ... ");
    }
}
