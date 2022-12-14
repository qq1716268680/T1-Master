package com.fiberhome.owtb.ofsc_crawler.controller;

import com.fiberhome.owtb.ofsc_crawler.bean.UserBean;
import com.fiberhome.owtb.ofsc_crawler.entity.User;
import com.fiberhome.owtb.ofsc_crawler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String username,String password){
        User user = userService.loginIn(username,password);
        if(user!=null){
            return "book_index";
        }else {
            return "error";
        }
    }

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password, Map<String,Object> map, HttpSession session) {
        User user = userService.loginIn(username,password);
        if(user!=null){
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else {
            map.put("msg", "用户名或密码错误");
            return "index";
        }

    }

}
