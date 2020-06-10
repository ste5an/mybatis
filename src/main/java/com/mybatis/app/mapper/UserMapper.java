package com.mybatis.app.mapper;

import com.mybatis.app.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USERS") //SQL
    List<User> findAll( );

    @Select("SELECT * FROM USERS WHERE ID = #{id}")
    List<User> findById(@Param("id") int id);

    @Insert("INSERT INTO users(id, name, age) values (#{id}, #{name}, #{age})")
    public Integer addUser(User user);

    @Delete("DELETE FROM users WHERE ID (#{id})")
    public void deleteUserById(int id);

}
