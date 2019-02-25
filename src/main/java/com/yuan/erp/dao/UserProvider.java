package com.yuan.erp.dao;

import com.yuan.erp.entity.User;
import org.apache.ibatis.jdbc.SQL;

public class UserProvider {
    public String insertByParams(final User user) {
        return new SQL() {{
            INSERT_INTO("t_user_info");
//            INTO_COLUMNS("username", "password");
//            INTO_VALUES("#{username},#{password}");
            INTO_COLUMNS("user_id");
            INTO_VALUES("#{userId}");
            if (user.getUsername() != null) {
                VALUES("username", "#{username}");
            }
            if (user.getPassword() != null) {
                VALUES("password", "#{password}");
            }
            if (user.getSalt() != null) {
                VALUES("salt", "#{salt}");
            }
        }}.toString();
    }

    public String updateByParams(final User user) {
        return new SQL() {{
            UPDATE("t_user_info");
            if (user.getUsername() != null) {
                SET("username = #{username}");
            }
            WHERE("user_id = #{userId}");
        }}.toString();
    }
}
