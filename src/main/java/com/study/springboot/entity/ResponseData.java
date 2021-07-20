package com.study.springboot.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/20 13:17
 * @since 1.0
 **/
@Data
public class ResponseData {
    private Boolean success;
    private String code;
    private String message;
    private com.study.springboot.entity.Data data;

}
