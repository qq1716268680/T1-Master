package com.fiberhome.owtb.ofsc_crawler.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName ofsc_enterprise_extra
 */
@TableName(value ="ofsc_enterprise_extra")
@Data
public class EnterpriseExtra implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private Long activityId;

    /**
     * 
     */
    private String col1;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}