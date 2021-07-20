package com.study.springboot.utils;

import com.study.springboot.entity.TestClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.regex.Pattern;


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


    public static String generateRandomName(int length){
        Random random = new Random();
        String s = RandomStringUtils.randomAlphanumeric(random.nextInt(length) + 1);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.insert(random.nextInt(s.length()),random.nextInt(9));
        return sb.toString();
    }

    public static Boolean isAllNumber(String s){
        String str = "[0-9]*";
        Pattern pattern = Pattern.compile(str);
        return pattern.matcher(s).matches();
    }


}
