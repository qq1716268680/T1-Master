package com.fiberhome.owtb.ofsc_crawler.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fiberhome.owtb.ofsc_crawler.entity.HomeData1;
import com.fiberhome.owtb.ofsc_crawler.entity.User;
import com.fiberhome.owtb.ofsc_crawler.mapper.UserMapper;
import com.fiberhome.owtb.ofsc_crawler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【ofsc_user】的数据库操作Service实现
* @createDate 2022-12-10 03:01:31
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public User loginIn(String username, String password) {
        return userMapper.getInfo(username,password);
    }

    @Override
    public User queryUserById(String id) {
        return null;
    }

    @Override
    public int addUser(User userBean) {
        return 0;
    }

    @Override
    public int dropUser(String id) {
        return 0;
    }

    @Override
    public int modifyUser(User userBean) {
        return 0;
    }

    @Override
    public List<User> queryAllUser() {
        return null;
    }

    @Override
    public List getHomeData() {
        return null;
    }

    @Override
    public List<HomeData1> getAllData() {
        return userMapper.getAllData();
    }
}




