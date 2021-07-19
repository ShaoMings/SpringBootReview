package com.study.springboot.controller;

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
@Controller
public class ThymeleafTest {

    @GetMapping("/hello")
    public String myTestHello(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "Hello";
    }
}
