package com.study.springboot.aop.service;

import org.springframework.stereotype.Service;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/8/10 10:17
 * @since 1.0
 */
@Service
public class AroundLogService {

    public String testAroundAnnotation(){
        System.out.println("Around测试业务执行....");
        return "哈喽沃德!";
    }
}
