package com.study.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author shaoming
 * @since 2021-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="City对象", description="")
public class City implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @TableField("Name")
    private String name;

    @TableField("CountryCode")
    private String countrycode;

    @TableField("District")
    private String district;

    @TableField("Population")
    private Integer population;


}
