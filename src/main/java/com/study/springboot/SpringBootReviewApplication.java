package com.study.springboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author shaoming
 */

@EnableOpenApi
@SpringBootApplication
@MapperScan("com.study.springboot.mapper")
public class SpringBootReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReviewApplication.class, args);
    }

}
