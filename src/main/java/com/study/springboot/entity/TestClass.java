package com.study.springboot.entity;


import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/19 11:12
 * @since 1.0
 **/
@Component("test")
@ApiModel("测试类")
public class TestClass {
    private String name;

    public String getName() {
        return name;
    }
    @Value("shaoming")
    public void setName(String name) {
        this.name = name;
    }
}
