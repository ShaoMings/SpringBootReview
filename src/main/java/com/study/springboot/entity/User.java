package com.study.springboot.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/21 13:29
 * @since 1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;
    /**
     * 乐观锁注解  @Version
     */
    @Version
    private Integer version;
}
