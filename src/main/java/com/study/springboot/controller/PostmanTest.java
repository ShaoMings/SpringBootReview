package com.study.springboot.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/19 13:43
 * @since 1.0
 **/
@RestController
public class PostmanTest {
    @GetMapping("/user")
    public String getTest(@RequestParam("username") String name,@RequestParam("password") String password){
        return "GET->{username:"+name+",password:"+password+"}";
    }

    @PostMapping("/user")
    public String postTest(@RequestParam("username") String name,@RequestParam("password") String password){
        return "POST->{username:"+name+",password:"+password+"}";
    }

    @PutMapping("/user")
    public String putTest(@RequestParam("username") String name,@RequestParam("password") String password){
        System.out.println(name);
        System.out.println(password);
        return "PUT OK!";
    }

    @DeleteMapping("/user")
    public String deleteTest(@RequestParam("username") String name,@RequestParam("password") String password){
        System.out.println(name);
        System.out.println(password);
        return "DELETE OK!";
    }


}
