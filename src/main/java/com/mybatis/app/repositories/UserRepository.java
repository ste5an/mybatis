package com.mybatis.app.repositories;

import com.mybatis.app.model.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserRepository {

    @Select("SELECT * from users")
    public List<Users> findAll();

    @Insert("INSERT INTO users(users, first_name, last_name, email, phone, job_title) VALUES(?, ?, ?, ?, ?, ?)")
    public void addEmployee(Users users);

    @Delete("DELETE FROM employees WHERE employee_id=?")
    public void deleteEmployee(int id);




}
