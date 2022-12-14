package com.fiberhome.owtb.ofsc_crawler.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName ofsc_home_contact
 */
@TableName(value ="ofsc_home_contact")
@Data
public class HomeContact implements Serializable {
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
    private String contactType;

    /**
     * 
     */
    private String contactInfo;

    /**
     * 
     */
    private String contactName;

    /**
     * 
     */
    private String relationship;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}