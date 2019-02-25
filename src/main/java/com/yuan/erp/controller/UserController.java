package com.yuan.erp.controller;

import com.yuan.erp.entity.User;
import com.yuan.erp.service.IUserService;
import com.yuan.erp.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private IUserService userService;
    @Resource
    RedisUtil redisUtil;

    @RequestMapping("/user/getAll")
    public List<User> getAllUsers() {

        return userService.getAllUser();
    }

    @RequestMapping("/user/insert")
    public boolean insertUser(User user) {
        try {
            userService.insertUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @RequestMapping("/user/update/{userId}")
    public boolean updateUser(User user, @PathVariable String userId) {
        try {
            userService.updateUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @RequestMapping("/user/delete/{userId}")
    public boolean deleteUser(@PathVariable String userId) {
        try {
            userService.deleteUser(userId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
