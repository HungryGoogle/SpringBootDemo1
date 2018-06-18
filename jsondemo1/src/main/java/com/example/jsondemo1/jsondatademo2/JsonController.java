package com.example.jsondemo1.jsondatademo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

// 调用方法
// http://localhost:8080/getJson

@RestController
public class JsonController {

    @RequestMapping("/getJson")
    public User getJson() {
        User demo = new User();
        demo.setId(1);

        demo.setName("张三");
        demo.setCreateTime(new Date());
        return demo;
    }

    @RequestMapping("/getJsonList")
    public List<User> getJsonList() {
        List list = new ArrayList();

        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setCreateTime(new Date());
        list.add(user);

        user = new User();
        user.setId(2);
        user.setName("李四");
        user.setCreateTime(new Date());
        list.add(user);

        user = new User();
        user.setId(3);
        user.setName("王五");
        user.setCreateTime(new Date());
        list.add(user);

        return list;
    }
}