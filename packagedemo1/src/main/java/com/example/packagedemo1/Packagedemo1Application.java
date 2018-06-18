package com.example.packagedemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Packagedemo1Application {
    @RequestMapping("*")
    @ResponseBody
    public String hello(){
        System.out.println("RequestMapping");
        return "hello world！spring boot...";
    }

    /**
     *  打包说明：
     *     1、在左侧的“Maven Project”命令菜单里面，打开lifecycle-》install，双击“install”命令
     *     2、执行后，在本项目的target目录里面，会有一个jar包出来，jar包的命名来自于pom.xml里面定义的，比如本项目
     *              <artifactId>packagedemo1</artifactId>
     *              <version>0.0.1-SNAPSHOT</version>
     *              <packaging>jar</packaging>
     *     3、打开命令行工具，转到本项目目录，执行“java -jar ****.jar”，其中***jar就是刚刚install命令打出来的jar包
     *       （如果linux运行，类似 ）
     *
     */

    public static void main(String[] args) {
        SpringApplication.run(Packagedemo1Application.class, args);
    }
}
