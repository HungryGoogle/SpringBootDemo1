package com.deepin.demo.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("freemarker")
public class FreemarkerController {

    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {

        map.put("msg", "Hello Freemarker");
        map.put("msg1", "msg1");
        map.put("msg2", "msg2");
        map.put("msg3", "msg3");
        map.put("msg4", "msg4");
        return "hello";
    }
}