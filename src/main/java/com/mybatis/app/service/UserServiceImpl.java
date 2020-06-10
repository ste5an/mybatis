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
        List<User> userId = userMapper.findById(id);
        logger.info("Get user by Id from DB: {}", userId);
        return userMapper.findById(id);
    }

    @Override
    public Integer addUser(User user) {
        logger.info("Save user to DB: {}", user);
        return userMapper.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        logger.info("Delete user by Id from DB: {}", id);
        userMapper.deleteUserById(id);
    }


}
