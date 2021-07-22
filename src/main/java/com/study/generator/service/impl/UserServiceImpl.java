package com.study.generator.service.impl;

import com.study.generator.entity.User;
import com.study.generator.mapper.UserMapper;
import com.study.generator.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shaoming
 * @since 2021-07-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
