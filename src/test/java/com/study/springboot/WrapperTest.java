package com.study.springboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.springboot.entity.User;
import com.study.springboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * Description 测试条件构造器 wrapper
 *
 * @author shaoming
 * @date 2021/7/22 9:50
 * @since 1.0
 **/
@SpringBootTest
public class WrapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    void testWrapper1(){
        //查询user表中 邮箱不为 XXX@XXX.com 以及 年龄 不大于10的记录
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.ne("email","XXX@XXX.com");
        wrapper.le("age",10);
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }

    @Test
    void testWrapper2() {
        //查询user表中 年龄 在10-25之间的记录条数
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.between("age",10,25);
        Integer count = userMapper.selectCount(wrapper);
        System.out.println(count);
    }


    @Test
    void testWrapper3(){
        //查询user表中 年龄包含数字1 的记录
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("age",1);
        List<Map<String, Object>> users = userMapper.selectMaps(wrapper);
        users.forEach(System.out::println);
    }

    @Test
    void testWrapper4(){
        // 子查询 可联表查询
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.inSql("id","select id from user where age < 25");
        List<User> objects = userMapper.selectList(wrapper);
        objects.forEach(System.out::println);
    }
}
