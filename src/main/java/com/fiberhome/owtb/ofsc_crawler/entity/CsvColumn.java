package com.fiberhome.owtb.ofsc_crawler.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName ofsc_csv_column
 */
@TableName(value ="ofsc_csv_column")
@Data
public class CsvColumn implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private String csvType;

    /**
     * 
     */
    private Integer colId;

    /**
     * 
     */
    private String colName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}