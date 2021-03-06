package com.study.springboot;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.study.springboot.config.MysqlConfig;
import com.study.springboot.entity.User;
import com.study.springboot.mapper.CityMapper;
import com.study.springboot.mapper.UserMapper;
import com.study.springboot.service.CityService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class SpringBootReviewApplicationTests {


    private final CityService service;

    private final MysqlConfig mysqlConfig;

    private final CityMapper cityMapper;


    @Test
    void configTest(){
        mysqlConfig.test();
    }


    @Test
    void contextLoads() {
        service.list().forEach(System.out::println);
//        cityMapper.selectList(null).forEach(System.out::println);
    }

    private final UserMapper userMapper;

    @Test
    void testUserSelect(){
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    void testUserBatchSelect(){
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3, 4, 5));
        users.forEach(System.out::println);
    }

    @Test
    void testUserSelectByMap(){
        HashMap<String, Object> map = new HashMap<>();
        //map 查询条件是and
        map.put("name","shaoming");
        map.put("age",22);
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    @Test
    void testUserInsert(){
        User user = new User();
        user.setId(18L);
        user.setName("shaoming");
        user.setAge(22);
        user.setEmail("1650666953@qq.com");
        userMapper.insert(user);

    }

    @Test
    void testUserUpdate(){
        User user = new User();
        user.setId(10L);
        user.setAge(14);
        userMapper.updateById(user);
    }

    @Test
    void testUserDelete(){
        userMapper.deleteById(11);
    }

    /**
     * 测试乐观锁  成功
     */
    @Test
    void testOptimisticLocker(){
        // 1.查询用户信息
        User user = userMapper.selectById(11L);
        // 2.修改用户信息
        user.setName("update-with-optimistic-locker");
        user.setEmail("hehe@163.com");
        // 3.执行更新操作
        userMapper.updateById(user);
    }

    @Test
    void testOptimisticLocker2(){
        // 线程1
        User user = userMapper.selectById(18L);
        user.setName("optimistic-locker-1");
        user.setEmail("1111@qq.com");

        //模拟另外一个线程2进行插队操作
        User user2 = userMapper.selectById(18L);
        user2.setName("optimistic-locker-2");
        user2.setEmail("2222@qq.com");
        userMapper.updateById(user2);

        //如果没有乐观锁 就会覆盖插队线程2的值  有乐观锁 这里就不会执行成功
        userMapper.updateById(user);

    }

    /**
     * 测试分页
     */

    @Test
    void testSelectPage(){
        // Page<>(当前页,页面展示记录数)
        Page<User> userPage = new Page<>(1,5);
        userMapper.selectPage(userPage,null);

        userPage.getRecords().forEach(System.out::println);

        //第二页
        Page<User> userPage1 = new Page<>(2, 5);
        userMapper.selectPage(userPage1,null);
        userPage1.getRecords().forEach(System.out::println);

        System.out.println(userPage.getTotal());
    }





}
