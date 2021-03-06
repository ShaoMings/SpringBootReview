package com.study.springboot.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description 实体配置类
 *
 * @author shaoming
 * @date 2021/7/19 15:18
 * @since 1.0
 **/
@Component
@ConfigurationProperties(prefix = "shaoming")
@ApiModel("配置文件映射类")
public class PropertiesClass {
    private String username;
    private String age;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PropertiesClass{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
