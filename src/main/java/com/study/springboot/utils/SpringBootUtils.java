package com.study.springboot.utils;

import com.study.springboot.entity.TestClass;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/19 11:20
 * @since 1.0
 **/
@Component
public class SpringBootUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringBootUtils.applicationContext == null){
            SpringBootUtils.applicationContext = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static Object getBeanByName(String name, Class<TestClass> testClassClass){
        return getApplicationContext().getBean(name);
    }

    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }

    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name,clazz);
    }



}
