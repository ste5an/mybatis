package com.mybatis.app.service;

import com.mybatis.app.model.Users;
import com.mybatis.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users findUserById(int id) {
        return null;
    }

    @Override
    public void addEmployee(Users users) {
        userRepository.addEmployee(users);
    }

    @Override
    public void updateUsers(Users users) {

    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteEmployee(id);

    }
}
