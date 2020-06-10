package com.mybatis.app.service;

import com.google.common.collect.Lists;
import com.mybatis.app.mapper.UserMapper;
import com.mybatis.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);


    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        ArrayList<User> users = Lists.newArrayList(userMapper.findAll());
        logger.info("Get users from DB: {}", users);
        return userMapper.findAll();
    }

    @Override
    public List<User> findUserById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

}
