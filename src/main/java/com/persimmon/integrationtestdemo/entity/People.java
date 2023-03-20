package com.persimmon.integrationtestdemo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 集成测试表
 * @TableName people
 */
@Data
public class People implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer sex;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}