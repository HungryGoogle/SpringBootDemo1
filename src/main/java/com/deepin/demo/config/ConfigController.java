package com.deepin.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    // 获取application.yml文件中名为ip的value值
    @Value("${ip}")
    private String ip;

    // 获取application.yml文件中名为port的value值,并且自动完成数据类型转换
    @Value("${port}")
    private Integer port;

    // 获取application.yml文件中名为port的value值,并且自动完成数据类型转换
    @Value("${name}")
    private String lee;

    @RequestMapping("/config")
    public String config() {
        return "ip:" + ip + ", port:" + port + ", name:" + lee;
    }
}