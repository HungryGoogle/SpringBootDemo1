package com.deepin.demo.json.jsondatademo2;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 调用方法
// http://localhost:8080/getJson

@RestController
public class HelloController {

    @RequestMapping("/getJson")
    public User getJson() {
        User demo = new User();
        demo.setId(1);

        demo.setName("张三");
        demo.setCreateTime(new Date());
        return demo;
    }
}