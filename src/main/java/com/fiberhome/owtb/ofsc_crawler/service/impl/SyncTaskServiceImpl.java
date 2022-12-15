package com.fiberhome.owtb.ofsc_crawler.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fiberhome.owtb.ofsc_crawler.entity.SyncTask;
import com.fiberhome.owtb.ofsc_crawler.mapper.SyncTaskMapper;
import com.fiberhome.owtb.ofsc_crawler.service.SyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【ofsc_sync_task】的数据库操作Service实现
* @createDate 2022-12-10 03:01:31
*/
@Service
public class SyncTaskServiceImpl extends ServiceImpl<SyncTaskMapper, SyncTask>
    implements SyncTaskService{

    @Autowired
    private SyncTaskMapper taskMapper;

    @Override
    public List<SyncTask> getAllData(Integer pageIndex, Integer pageSize) {
        return taskMapper.getAllData(pageIndex,pageSize);
    }

    @Override
    public int getTotal() {
        return taskMapper.getTotal();
    }
}




