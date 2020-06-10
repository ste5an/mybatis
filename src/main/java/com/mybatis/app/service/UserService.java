package com.mybatis.app.service;

import com.mybatis.app.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public List<User> findUserById(int id);

    public Integer addUser(User user);

}