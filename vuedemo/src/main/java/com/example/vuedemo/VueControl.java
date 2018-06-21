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

}
