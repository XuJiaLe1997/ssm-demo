package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/AddUser")
    @ResponseBody
    public String addUser(@RequestParam("name") String name,
                          @RequestParam("password") String password,
                          @RequestParam("age") int age) {
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setAge(age);

        int result = userService.addUser(user);
        if (result == 1) {
            return "Succeed";
        }
        return "Failed";
    }

    @RequestMapping(value = "/GetUser")
    @ResponseBody
    public User getUser(@RequestParam("id") long id) {
        return userService.getUser(id);
    }
}
