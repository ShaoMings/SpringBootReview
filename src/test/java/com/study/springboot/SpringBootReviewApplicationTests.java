package com.study.springboot;


import com.study.springboot.mapper.CityMapper;
import com.study.springboot.service.CityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringBootReviewApplicationTests {

    @Autowired
    CityService service;

    @Autowired
    CityMapper cityMapper;

    @Test
    void contextLoads() {
        service.list().forEach(System.out::println);
//        cityMapper.selectList(null).forEach(System.out::println);
    }

}
