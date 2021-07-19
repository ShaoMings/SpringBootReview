package com.study.springboot.config;

import com.study.springboot.entity.TestClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/19 11:14
 * @since 1.0
 **/
@Configuration
public class TestConfiguration {
    @Bean
    public TestClass getTestClass(){
        return new TestClass();
    }
}
