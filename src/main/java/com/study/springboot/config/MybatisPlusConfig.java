package com.study.springboot.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Description MP配置类
 * @EnableTransactionManagement 开启事务管理
 * @MapperScan("com.study.springboot.mapper") 开启mapper扫描  也可以放在主启动类上
 *
 * @author shaoming
 * @date 2021/7/21 15:35
 * @since 1.0
 **/
@Configuration
@EnableTransactionManagement
@MapperScan("com.study.springboot.mapper")
public class MybatisPlusConfig {

    /**
     *  注册乐观锁插件
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor(){
        return new OptimisticLockerInterceptor();
    }
}
