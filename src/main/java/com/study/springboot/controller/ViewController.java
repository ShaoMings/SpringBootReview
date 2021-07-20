package com.study.springboot.controller;

import com.study.springboot.entity.TestClass;
import com.study.springboot.utils.SpringBootUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/19 11:04
 * @since 1.0
 **/
@Controller
@ResponseBody
@Api(tags = "首页视图接口映射")
public class ViewController {

    @ApiOperation("首页映射测试")
    @GetMapping({"", "/", "/index"})
    public String helloWorld() {
        TestClass test = (TestClass) SpringBootUtils.getBeanByName("test", TestClass.class);
        return test.getName()+"   Hello,SpringBoot!";
    }
}
