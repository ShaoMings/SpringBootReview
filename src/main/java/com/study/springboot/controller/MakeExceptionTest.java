package com.study.springboot.controller;

import com.study.springboot.exception.ResponseException;
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

    @GetMapping("/responseException")
    public void responseException(){
        throw new ResponseException("自定义异常!");
    }

    @GetMapping("/runtimeException")
    public void runtimeException(){
        throw new RuntimeException("运行时异常!");
    }

    @GetMapping("/exception")
    public void exception() throws Exception {
        throw new Exception("编译时异常!");
    }
}
