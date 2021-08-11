package com.study.springboot.aop.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class MyServiceTest {

    private final MyService myService;

    private final AroundLogService aroundLogService;

    @Test
    void fun1() {
        myService.fun1();
    }

    @Test
    void fun2() {
        myService.fun2(3,4);
    }

    @Test
    void fun3() {
        myService.fun3();
    }

    @Test
    void fun4(){
        // 测试异常
        myService.fun4(3,0);
    }

    @Test
    void test(){
        // @Around 测试
        System.out.println(aroundLogService.testAroundAnnotation());
    }
}