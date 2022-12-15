package com.fiberhome.owtb.ofsc_crawler.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fiberhome.owtb.ofsc_crawler.bean.PageVo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName ofsc_sync_task
 */
@TableName(value ="ofsc_sync_task")
@Data
public class SyncTask extends PageVo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 同步数据账号，参考User.username
     */
    private String userName;

    /**
     *  根据日期同步数据
     */
    private String syncDate;

    /**
     * 计划运行时间
     */
    private Date triggerTime;
    /**
     * 启动时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 允许状态 WAIT 等待 RUN允许 FAIL失败 OK完成
     */
    private String runStatus;

    /**
     * Y 有效 N无效
     */
    private String status;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createBy;

    /**
     * 运行结果
     */
    private String comment;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}