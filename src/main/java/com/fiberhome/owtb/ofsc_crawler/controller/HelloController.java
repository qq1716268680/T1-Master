package com.fiberhome.owtb.ofsc_crawler.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String sayHello(){
        return bookLogin();
    }

    @RequestMapping("/bookLogin")
    public String bookLogin(){
        return "book_login";
    }
}
