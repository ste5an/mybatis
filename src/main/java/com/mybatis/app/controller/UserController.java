package com.mybatis.app.controller;

import com.mybatis.app.model.User;
import com.mybatis.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @GetMapping("/find/{id}")
    public List<User> findById(@PathVariable("id") int id) {
        return userService.findUserById(id);
    }

    @PostMapping("/save")
    public Integer saveUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }

}
