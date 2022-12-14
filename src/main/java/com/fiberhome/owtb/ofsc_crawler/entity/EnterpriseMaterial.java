package com.fiberhome.owtb.ofsc_crawler.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName ofsc_enterprise_material
 */
@TableName(value ="ofsc_enterprise_material")
@Data
public class EnterpriseMaterial implements Serializable {
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
    private String inventoryType;

    /**
     * 
     */
    private String materialDescription;

    /**
     * 
     */
    private String serialNumber;

    /**
     * 
     */
    private String quantity;

    /**
     * 
     */
    private String c665;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}