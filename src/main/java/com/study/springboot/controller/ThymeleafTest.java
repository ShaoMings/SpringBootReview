package com.study.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description
 *
 * @author shaoming
 * @date 2021/7/19 14:30
 * @since 1.0
 **/
@Api(tags = "Thymeleaf测试")
@Controller
public class ThymeleafTest {

    @ApiOperation("测试Model")
    @GetMapping("/hello")
    public String myTestHello(@ApiParam(value = "姓名") @RequestParam("name") String name,
                              @ApiParam(value ="模型") Model model){
        model.addAttribute("name",name);
        return "Hello";
    }
}
