package com.deepin.demo.web.login.controller;


import com.deepin.demo.util.log.LogUtil;
import com.deepin.demo.web.login.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/5/12.
 */

@Controller
@RequestMapping("weblogin")
public class WebLoginController {
//
//    @Autowired
//    private UserDao userDao;

    //index页面
    @RequestMapping("index")
    public String index() {
        LogUtil.info("weblogin index");
        return "weblogin/index";
    }

    //注册页面
    @RequestMapping("register")
    public String register() {
        LogUtil.info("weblogin register");
        return "weblogin/register";
    }

    // http://localhost:8080/weblogin/login
    // 登录页面
    @RequestMapping("/login")
    public String login() {
        LogUtil.info("weblogin login");
        return "weblogin/login";
    }

    //注册方法
    @RequestMapping("/addregister")
    public String register(HttpServletRequest request) {
        LogUtil.info("weblogin addregister");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        if (password.equals(password2)) {
            UserEntity userEntity = new UserEntity();
            userEntity.setUsername(username);
            userEntity.setPassword(password);
//            userDao.save(userEntity);
            return "weblogin/login";
        } else {
            return "weblogin/register";
        }
    }

    // http://localhost:8080/weblogin/register
    // 登录方法
    @RequestMapping("/addlogin")
    public String login(HttpServletRequest request) {
        LogUtil.info("weblogin addlogin");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

//        UserEntity userEntity = userDao.findByUsernameAndPassword(username,password);

        String str = "";
        if (username != null) {
            str = "weblogin/index";
        } else {
            str = "weblogin/login";
        }
        return str;
    }

}
