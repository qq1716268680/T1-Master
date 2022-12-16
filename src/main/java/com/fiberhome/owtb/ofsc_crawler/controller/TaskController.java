package com.fiberhome.owtb.ofsc_crawler.controller;

import com.alibaba.fastjson.JSONObject;
import com.fiberhome.owtb.ofsc_crawler.entity.HomeData1;
import com.fiberhome.owtb.ofsc_crawler.entity.SyncTask;
import com.fiberhome.owtb.ofsc_crawler.service.HomeData1Service;
import com.fiberhome.owtb.ofsc_crawler.service.SyncTaskService;
import com.fiberhome.owtb.ofsc_crawler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Controller
public class TaskController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @Autowired
    private SyncTaskService taskService;

    @RequestMapping(value ="/taskSearch", method = RequestMethod.POST)
    @ResponseBody
    public Object taskSearch(@RequestBody SyncTask data1){
        ModelAndView v = new ModelAndView();
        List<SyncTask> list =  taskService.getAllData(data1.getPageIndex(),data1.getPageSize());
        int total = taskService.getTotal();
//        v.setViewName("data_list");
//        v.addObject("dataList",list);
//        v.addObject("total",total);
        return JSONObject.toJSON(list);
    }
    /*@RequestMapping(value ="/taskSearchGET", method = RequestMethod.GET)
    public ModelAndView homeDataSearchGET(){
        ModelAndView v = new ModelAndView();
        List<HomeData1> list =  homeData1Service.getAllData(1,10);
        int total = homeData1Service.getTotal();
        v.setViewName("data_list");
        v.addObject("dataList",list);
        v.addObject("total",total);
        return v;
    }*/

    @GetMapping("/tasks")
    public String list(Model model) {
//        Collection<HomeData1> employees	= homeData1Service.getAllData(1,10);
//        model.addAttribute("emps", employees);
        return "task/list";
    }

    @GetMapping("/tasksRedAdd")
    public String tasksRedAdd(Model model, HttpServletRequest request) {
        SyncTask task = new SyncTask();
        task.setUserName(request.getSession().getAttribute("loginUser").toString());
        task.setSyncDate(new Date().toString());
        model.addAttribute("emp", task);
        return "task/add";
    }


    @PostMapping("/taskAdd")
    public String taskAdd( SyncTask task) {
        Boolean flag ;
        if(task.getId() == null){
            flag = taskService.save(task);
        }else{
            flag = taskService.updateById(task);
        }

        return "task/list";
    }
    @GetMapping("/task/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model) {
        SyncTask employee =  taskService.getById(id);
        model.addAttribute("emp", employee);
        return "task/add";
    }

    /*@GetMapping("/taskDelete/{id}")
    public String taskDelete(@PathVariable("id") Integer id,Model model) {
        boolean b = taskService.removeById(id);
        return "task/list";
    }*/

    @DeleteMapping("/taskDelete/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {

        boolean b = taskService.removeById(id);
        return "redirect:/tasks";
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
