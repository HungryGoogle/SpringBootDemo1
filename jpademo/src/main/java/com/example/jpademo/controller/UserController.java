package com.example.jpademo.controller;

import com.example.jpademo.bean.User;
import com.example.jpademo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

//    http://localhost:8080/user/add?name=%22lee%22&address=%22address1%22
//      http://localhost:8080/user/delete?id=1001
//
//


    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @RequestMapping("/add")
    public int addUser(User user) {
        userService.saveUser(user);
        return 0;
    }


    @ResponseBody
    @RequestMapping("/delete")
    public Object deleteUserById(int id) {
        userService.delete(id);
        return null;
    }


    @ResponseBody
    @RequestMapping(value = "/update")
    public int updateUser(User user) {
        return userService.update(user);
    }

    @ResponseBody
    @RequestMapping("/find")
    public Object updateUser(int id) {
        return userService.findOne(id);
    }

    @ResponseBody
    @RequestMapping("/all")
//    @GetMapping("/all")
    public Object findAllUser() {
        return userService.findAll();
    }
}
