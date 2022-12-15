package com.fiberhome.owtb.ofsc_crawler.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiberhome.owtb.ofsc_crawler.entity.SyncTask;

import java.util.List;

/**
* @author Administrator
* @description 针对表【ofsc_sync_task】的数据库操作Service
* @createDate 2022-12-10 03:01:31
*/
public interface SyncTaskService extends IService<SyncTask> {

    List<SyncTask> getAllData(Integer pageIndex, Integer pageSize);

    int getTotal();
}
