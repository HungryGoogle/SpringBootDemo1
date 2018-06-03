package com.deepin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 端口修改可使用
// server.port=8086


@Controller
@SpringBootApplication
@Configuration
public class DemoApplication {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world！lee...";
    }

    @RequestMapping("helloworld")
    @ResponseBody
    public String helloworld(){
        return "{code:0,data:{prefix:leeTest}}";
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}


