package com.study.springboot.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;

import java.util.List;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/20 14:03
 * @since 1.0
 **/
@ApiModel("数据")
@lombok.Data
@AllArgsConstructor
public class Data {
    private List<Items> items;
}
