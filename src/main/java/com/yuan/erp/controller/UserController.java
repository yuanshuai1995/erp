package com.yuan.erp.controller;

import com.yuan.erp.entity.User;
import com.yuan.erp.service.IUserService;
import com.yuan.erp.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController("/user")
@EnableAutoConfiguration
@Api(value = "userController", tags = "用户信息")
public class UserController {

    @Autowired
    private IUserService userService;
    @Resource
    RedisUtil redisUtil;

    @ApiOperation(value = "获取所有用户", httpMethod = "GET")
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<User> getAllUsers() {

        return userService.getAllUser();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ApiOperation(value = "新增用户", httpMethod = "POST")
    public boolean insertUser(User user) {
        try {
            userService.insertUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @RequestMapping(value = "/update/{userId}", method = RequestMethod.POST)
    @ApiOperation(value = "更新用户", httpMethod = "POST")
    public boolean updateUser(User user, @PathVariable String userId) {
        try {
            userService.updateUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @RequestMapping(value = "/delete/{userId}", method = RequestMethod.POST)
    @ApiOperation(value = "删除用户", httpMethod = "POST")
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
