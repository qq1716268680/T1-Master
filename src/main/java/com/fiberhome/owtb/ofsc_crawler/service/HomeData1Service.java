package com.fiberhome.owtb.ofsc_crawler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiberhome.owtb.ofsc_crawler.entity.HomeData1;
import com.fiberhome.owtb.ofsc_crawler.mapper.HomeData1Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
* @author Administrator
* @description 针对表【ofsc_home_data1】的数据库操作Service
* @createDate 2022-12-09 00:36:19
*/
public interface HomeData1Service  {

    List<HomeData1> getAllData(int pageNumber,int pageSize);

    int getTotal();
}
