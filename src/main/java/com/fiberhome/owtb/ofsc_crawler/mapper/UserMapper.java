package com.fiberhome.owtb.ofsc_crawler.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fiberhome.owtb.ofsc_crawler.entity.HomeData1;
import com.fiberhome.owtb.ofsc_crawler.entity.User;

import java.util.List;

/**
* @author Administrator
* @description 针对表【ofsc_user】的数据库操作Mapper
* @createDate 2022-12-10 03:01:31
* @Entity com.fiberhome.owtb.ofsc_crawler.entity.User
*/
public interface UserMapper extends BaseMapper<User> {

    User getInfo(String username, String password);

    List<HomeData1> getAllData();
}




