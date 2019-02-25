package com.yuan.erp.dao;

import com.yuan.erp.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    @Select("select * from t_user_info")
    @Results(
            @Result(column = "user_id", property = "userId")
    )
    List<User> getAllUsers();

    @InsertProvider(type = UserProvider.class, method = "insertByParams")
    int insert(User user);

    @UpdateProvider(type = UserProvider.class, method = "updateByParams")
    int update(User user);

    @Delete("delete from t_user_info where user_id = #{userId}")
    int delete(@Param("userId") String userId);

    @Select("select user_id,username from t_user_info where username = #{username} and password = #{password}")
    User getUserByUsernameAndPassWord(@Param("username") String username, @Param("password") String password);

    @Select("select * from t_user_info where username = #{username}")
    @Results(
            @Result(column = "user_id",property = "userId")
    )
    User getUserByUsername(@Param("username") String username);
}
