package com.example.vuedemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class VueControl {
    @GetMapping("/vuedemo")
    public String user(){
        System.out.println("vue demo");
        return "index";
    }

    @GetMapping("/vuedemo2")
    public String vuedemo2(){
        System.out.println("vue demo 2");
        return "vue_demo_2";
    }

//    vue分离
//    https://www.cnblogs.com/nele/p/7858581.html

//    分离2
//    https://my.oschina.net/u/3491123/blog/1593600
//    0 -> https://blog.csdn.net/h295928126/article/details/73839012

    // 分离成功
//    https://my.oschina.net/u/3491123/blog/1593600
}
