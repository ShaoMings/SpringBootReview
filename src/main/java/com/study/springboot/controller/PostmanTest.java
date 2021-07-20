package com.study.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/19 13:43
 * @since 1.0
 **/
@Api(tags = "PostMan测试RestFul")
@RestController
public class PostmanTest {

    @ApiOperation("Get测试")
    @GetMapping("/user")
    public String getTest(@ApiParam(value = "用户名") @RequestParam("username") String name,
                          @ApiParam(value = "密码") @RequestParam("password") String password){
        return "GET->{username:"+name+",password:"+password+"}";
    }

    @ApiOperation("Post测试")
    @PostMapping("/user")
    public String postTest(@ApiParam(value = "用户名") @RequestParam("username") String name,
                           @ApiParam(value = "密码") @RequestParam("password") String password){
        return "POST->{username:"+name+",password:"+password+"}";
    }

    @ApiOperation("Put测试")
    @PutMapping("/user")
    public String putTest(@ApiParam(value = "用户名") @RequestParam("username") String name,
                          @ApiParam(value = "密码") @RequestParam("password") String password){
        System.out.println(name);
        System.out.println(password);
        return "PUT OK!";
    }

    @ApiOperation("Delete测试")
    @DeleteMapping("/user")
    public String deleteTest(@ApiParam(value = "用户名") @RequestParam("username") String name,
                             @ApiParam(value = "密码") @RequestParam("password") String password){
        System.out.println(name);
        System.out.println(password);
        return "DELETE OK!";
    }


}
