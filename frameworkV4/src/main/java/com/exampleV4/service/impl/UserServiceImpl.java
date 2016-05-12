package com.exampleV4.service.impl;

import com.exampleV3.entity.User;
import com.exampleV3.mapper.UserMapper;
import com.exampleV3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author GuoLong
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser() {
        return userMapper.getAllUsers().get(0);
    }
}
