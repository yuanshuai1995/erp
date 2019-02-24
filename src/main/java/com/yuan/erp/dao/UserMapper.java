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
}
