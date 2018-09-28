package com.example.service;

import com.example.entity.User;

public interface UserService {

    /**
     * 添加用户
     */
    int addUser(User user);

    /**
     * 获取用户信息
     */
    User getUser(long id);

}
