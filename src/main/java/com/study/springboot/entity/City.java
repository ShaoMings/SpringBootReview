package com.study.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/21 9:46
 * @since 1.0
 **/

@TableName("city")
@Data
public class City {
    private Integer id;
    @TableField("Name")
    private String name;
    @TableField("CountryCode")
    private String countryCode;
    @TableField("District")
    private String district;
    @TableField("Population")
    private Integer population;
}
