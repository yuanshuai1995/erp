package com.yuan.erp.service;

import com.yuan.erp.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(String userId);
}
