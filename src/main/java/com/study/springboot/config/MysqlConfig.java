package com.study.springboot.config;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/8/10 16:00
 * @since 1.0
 */

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({MysqlProperties.class})
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MysqlConfig {

    private final MysqlProperties mysqlProperties;

    public void test(){
        System.out.println(mysqlProperties);
    }

}
