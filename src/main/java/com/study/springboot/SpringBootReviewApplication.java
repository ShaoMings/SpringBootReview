package com.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author shaoming
 */
@EnableOpenApi
@SpringBootApplication
public class SpringBootReviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReviewApplication.class, args);
    }

}
