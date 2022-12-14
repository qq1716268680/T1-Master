package com.fiberhome.owtb.ofsc_crawler.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fiberhome.owtb.ofsc_crawler.entity.HomeData1;
import com.fiberhome.owtb.ofsc_crawler.service.HomeData1Service;
import com.fiberhome.owtb.ofsc_crawler.mapper.HomeData1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【ofsc_home_data1】的数据库操作Service实现
* @createDate 2022-12-09 00:36:19
*/
@Service
public class HomeData1ServiceImpl implements HomeData1Service{
    @Autowired
    private HomeData1Mapper homeData1Mapper;


    @Override
    public List<HomeData1> getAllData(int pageNumber,int pageSize) {
        return homeData1Mapper.getAllData(pageNumber,pageSize);
    }

    @Override
    public int getTotal() {
        return homeData1Mapper.getTotal();
    }
}




