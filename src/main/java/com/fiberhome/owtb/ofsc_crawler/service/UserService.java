package com.fiberhome.owtb.ofsc_crawler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiberhome.owtb.ofsc_crawler.entity.HomeData1;
import com.fiberhome.owtb.ofsc_crawler.entity.User;

import java.util.List;

/**
* @author Administrator
* @description 针对表【ofsc_user】的数据库操作Service
* @createDate 2022-12-10 03:01:31
*/
public interface UserService extends IService<User> {
    //登录时信息核对
    User loginIn(String username,String password);

    //根据ID查询用户信息
    User queryUserById(String id);

    //插入新的用户
    int addUser(User userBean);

    //删除用户
    int dropUser(String id);

    //修改用户
    int modifyUser(User userBean);

    //查询所有用户
    List<User> queryAllUser();

    List getHomeData();

    List<HomeData1> getAllData();
}
