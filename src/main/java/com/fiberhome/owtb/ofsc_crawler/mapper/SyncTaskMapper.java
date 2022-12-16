package com.fiberhome.owtb.ofsc_crawler.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fiberhome.owtb.ofsc_crawler.entity.SyncTask;

import java.io.Serializable;
import java.util.List;

/**
* @author Administrator
* @description 针对表【ofsc_sync_task】的数据库操作Mapper
* @createDate 2022-12-10 03:01:31
* @Entity com.fiberhome.owtb.ofsc_crawler.entity.SyncTask
*/
public interface SyncTaskMapper extends BaseMapper<SyncTask> {

    List<SyncTask> getAllData(Integer pageNumber, Integer pageSize);

    int getTotal();


    @Override
    int insert(SyncTask entity);

    @Override
    int updateById(SyncTask entity);

    @Override
    SyncTask selectById(Serializable id);
}




