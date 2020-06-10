package com.mybatis.app.service;

import com.mybatis.app.model.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public interface UserService {

    public List<Users> getAllUsers();

    public Users findUserById(int id);

    public void addEmployee(Users users);

    public void updateUsers(Users users);

    public void deleteUser(int id);
}
