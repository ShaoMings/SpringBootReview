package com.study.springboot.controller;

import com.study.springboot.entity.City;
import com.study.springboot.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/21 10:44
 * @since 1.0
 **/
@Api(value = "把City表的信息转为Json")
@RestController
@RequestMapping("/city")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CityInfoToJson {

    private final CityService cityService;

    @ApiOperation("获取城市信息")
    @GetMapping("/json")
    public List<City> cityList(){
        return cityService.list();
    }
}
