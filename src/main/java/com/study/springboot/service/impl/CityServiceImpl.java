package com.study.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.springboot.entity.City;
import com.study.springboot.mapper.CityMapper;
import com.study.springboot.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description TODO
 *
 * @author shaoming
 * @date 2021/7/21 10:41
 * @since 1.0
 **/
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper,City> implements CityService{

}
