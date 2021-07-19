package com.study.springboot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.study.springboot.entity.PropertiesClass;
import com.study.springboot.entity.Student;
import com.study.springboot.utils.SpringBootUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/19 14:49
 * @since 1.0
 **/
@RestController
public class ObjectToJsonTest {

    @PostMapping("/student")
    public String jsonTestObject(@RequestParam("name") String name,@RequestParam("age") Integer age,
                                 @RequestParam("gender") Character gender,@RequestParam(value = "count",
            required = false,defaultValue = "1") String count) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String str = "[0-9]*";
        Pattern pattern = Pattern.compile(str);
        Boolean isNum = pattern.matcher(count).matches();
        ArrayList<Student> list = new ArrayList<>();
        if (isNum){
            for (int i = 0; i < Integer.parseInt(count); i++) {
                list.add(new Student(name,age,gender));
            }
        }else {
            list.add(new Student(name, age, gender));
        }
        return objectMapper.writeValueAsString(list);
    }

    @Autowired
    PropertiesClass propertiesClass;

    @GetMapping("/student")
    public String getsStudent() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(propertiesClass);
    }
}
