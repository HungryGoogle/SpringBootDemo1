package com.example.mysqldemo1.controller;

import com.example.mysqldemo1.model.UserDomain;
import com.example.mysqldemo1.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/add")
    public int addUser(UserDomain user) {
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping("/update")
    public int updateUser(UserDomain user) {
        return userService.updateUser(user);
    }

    @ResponseBody
    @RequestMapping("/delete")
    public Object deleteUserById(int userId) {
        return userService.deleteUser(userId);
    }

    @ResponseBody
    @RequestMapping("/find")
    public Object updateUser(int userId) {
        return userService.findUserByUserId(userId);
    }

    @ResponseBody
    @RequestMapping("/all")
//    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) {
        return userService.findAllUser(pageNum, pageSize);
    }
}
