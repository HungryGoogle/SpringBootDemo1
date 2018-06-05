package com.deepin.demo.jsondata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

// 调用方法
// http://localhost:8080/fastjson/test


@Controller
@RequestMapping("fastjson")
public class FastJsonController {

    @RequestMapping("/test")
    @ResponseBody
    public User test() {
        User user = new User();

        user.setId(1);
        user.setUsername("李文庆");
        user.setPassword("jack123");
        user.setBirthday(new Date());

        return user;
    }
}