package com.yuan.erp.serviceImpl;

import com.yuan.erp.dao.UserMapper;
import com.yuan.erp.entity.User;
import com.yuan.erp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUsers();
    }

    @Override
    public void insertUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.update(user);
    }

    @Override
    public void deleteUser(String userId) {
        userMapper.delete(userId);
    }
}
