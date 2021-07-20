package com.study.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/20 13:20
 * @since 1.0
 **/
@AllArgsConstructor
@Data
public class Items {
    private String id;
    private String name;
    private String intro;
}
