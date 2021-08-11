package com.study.springboot.aop.service;

import com.study.springboot.aop.LogAnnotation;
import org.springframework.stereotype.Service;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/8/10 09:29
 * @since 1.0
 */
@Service
public class MyService {

    public void fun1(){
        System.out.println("业务方法1执行.........");
    }

    public void fun2(int a,int b){
        System.out.println("业务方法2执行........");
        System.out.println("业务计算结果a+b="+(a+b));
    }

    @LogAnnotation(value = "fun3",description = "方法3",flag = false)
    public String fun3(){
        System.out.println("业务方法3执行........");
        return "fun3返回值";
    }


    public void fun4(int a, int b){
        System.out.println("业务方法4执行........");
        System.out.println("a/b="+(a/b));
    }
}
