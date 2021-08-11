package com.study.springboot.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/8/10 15:57
 * @since 1.0
 */
@ConfigurationProperties(prefix = "temp")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MysqlProperties {

    private String username;
    private String password;
    private String url;
    private String driver;
}
