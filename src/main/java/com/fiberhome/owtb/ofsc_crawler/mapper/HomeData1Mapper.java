package com.fiberhome.owtb.ofsc_crawler.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fiberhome.owtb.ofsc_crawler.entity.HomeData1;

import java.util.List;

/**
* @author Administrator
* @description 针对表【ofsc_home_data1】的数据库操作Mapper
* @createDate 2022-12-09 00:36:19
* @Entity com.fiberhome.owtb.ofsc_crawler.entity.HomeData1
*/
public interface HomeData1Mapper  {
    List<HomeData1> getAllData(int pageNumber,int pageSize);

    int getTotal();
}




