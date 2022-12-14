package com.fiberhome.owtb.ofsc_crawler.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName ofsc_home_material
 */
@TableName(value ="ofsc_home_material")
@Data
public class HomeMaterial implements Serializable {
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
    private String c2443;

    /**
     * 
     */
    private String c2380;

    /**
     * 
     */
    private String c2534;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}