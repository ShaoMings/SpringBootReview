package com.study.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.study.springboot.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author shaoming
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
