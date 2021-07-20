package com.study.springboot.entity;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/20 14:03
 * @since 1.0
 **/
@lombok.Data
@AllArgsConstructor
public class Data {
    private List<Items> items;
}
