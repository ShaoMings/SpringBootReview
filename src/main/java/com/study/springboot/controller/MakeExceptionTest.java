package com.study.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/19 15:59
 * @since 1.0
 **/
@RestController
public class MakeExceptionTest {

    @GetMapping("/error")
    public void error(){
        int a = 5/0;
    }
}
