package com.study.springboot.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/19 14:48
 * @since 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel("学生信息类")
public class Student {
    private String name;
    private Integer age;
    private Character gender;
}
