package com.yuan.erp.serviceImpl;

import com.yuan.erp.dao.UserMapper;
import com.yuan.erp.entity.User;
import com.yuan.erp.service.IUserService;
import com.yuan.erp.util.PasswordStorage;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
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
        // Generate a random salt
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[24];
        random.nextBytes(salt);
        String saltStr = PasswordStorage.toBase64(salt);
        user.setSalt(saltStr);
        String password = saltStr + user.getPassword();
        try {
            user.setPassword(PasswordStorage.createHash(password));
        } catch (PasswordStorage.CannotPerformOperationException e) {
            e.printStackTrace();
        }
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

    @Override
    public boolean login(String n, String p) {
        User user = userMapper.getUserByUsername(n);
        String salt = user.getSalt();
        String password = salt + p;
        try {
            return PasswordStorage.verifyPassword(password, user.getPassword());
        } catch (PasswordStorage.CannotPerformOperationException e) {
            e.printStackTrace();
        } catch (PasswordStorage.InvalidHashException e) {
            e.printStackTrace();
        }
        return false;
    }

}
