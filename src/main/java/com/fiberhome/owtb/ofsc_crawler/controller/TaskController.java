package com.fiberhome.owtb.ofsc_crawler.controller;

import com.alibaba.fastjson.JSONObject;
import com.fiberhome.owtb.ofsc_crawler.entity.HomeData1;
import com.fiberhome.owtb.ofsc_crawler.service.HomeData1Service;
import com.fiberhome.owtb.ofsc_crawler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TaskController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @Autowired
    private HomeData1Service homeData1Service;

    @RequestMapping(value ="/taskSearch", method = RequestMethod.POST)
    @ResponseBody
    public Object homeDataSearch(@RequestBody HomeData1 data1){
        ModelAndView v = new ModelAndView();
        List<HomeData1> list =  homeData1Service.getAllData(data1.getPageIndex(),data1.getPageSize());
        int total = homeData1Service.getTotal();
//        v.setViewName("data_list");
//        v.addObject("dataList",list);
//        v.addObject("total",total);
        return JSONObject.toJSON(list);
    }
    @RequestMapping(value ="/taskSearchGET", method = RequestMethod.GET)
    public ModelAndView homeDataSearchGET(){
        ModelAndView v = new ModelAndView();
        List<HomeData1> list =  homeData1Service.getAllData(1,10);
        int total = homeData1Service.getTotal();
        v.setViewName("data_list");
        v.addObject("dataList",list);
        v.addObject("total",total);
        return v;
    }

    @GetMapping("/tasks")
    public String list(Model model) {
//        Collection<HomeData1> employees	= homeData1Service.getAllData(1,10);
//        model.addAttribute("emps", employees);
        return "task/list";
    }



  /*  @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String username,String password){
        UserBean userBean = userService.loginIn(username,password);
        if(userBean!=null){
            return "book_index";
        }else {
            return "error";
        }
    }*/



}
