package com.deepin.demo.ajax.web;

import com.deepin.demo.ajax.entity.User;
import com.deepin.demo.util.log.LogUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("msg", "SpringBoot Ajax 示例");
        LogUtil.info("ajax index");
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        LogUtil.info("ajax home");
        return "home";
    }

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    @ResponseBody
    public List<User> data() {
        LogUtil.info("ajax data");
        List<User> list = new ArrayList<User>();

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i + 1);
            user.setName("springboot" + i);
            user.setSex("male");
            user.setAge(i + 1);
            user.setRole("developer");

            list.add(user);
        }

        return list;
    }
}
