package com.deepin.demo.redis.redis_web;

import com.deepin.demo.json.jsondata.User;
import com.deepin.demo.redis.redisdemo2.BookService;
import com.deepin.demo.redis.redisdemo2.support.Book;
import com.deepin.demo.util.log.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("redis")
public class redisCtrl {

    @Autowired
    private BookService bookService;

    //    http://localhost:8080/redis/test
    @RequestMapping("test")
    @ResponseBody
    public User test() {
        User user = new User();

        user.setId(1);
        user.setUsername("明天是否更好");
        user.setPassword("jack123");
        user.setBirthday(new Date());

        return user;
    }

    // http://localhost:8080/redis/querybook
    @RequestMapping("querybook")
    @ResponseBody
    public Book queryBookCacheable(){
        if(bookService != null) {
            Book book = bookService.queryBookCacheable("1");
            LogUtil.info("leeTest------> querybook : " + book);
            return book;
        }
        return null;
    }

    // http://localhost:8080/redis/updatebook
    @RequestMapping("updatebook")
    @ResponseBody
    public Book updateBook(){
        if(bookService == null){
            return null;
        }

        String id = "1";
        String name = "name_lee";

        Book book = bookService.queryBookCacheable("1");
        LogUtil.info("leeTest------> after update book : " + book);
        return book;
    }

    // http://localhost:8080/redis/updatebook
    @RequestMapping("clear/all")
    @ResponseBody
    public String clearAll(){
        if(bookService == null){
            return null;
        }

        bookService.clearBook1All();
        return "clear all succeed";
    }
}
