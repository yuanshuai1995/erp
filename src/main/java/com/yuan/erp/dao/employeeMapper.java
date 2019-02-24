package com.yuan.erp.dao;

import com.yuan.erp.entity.employee;

public interface employeeMapper {
    int deleteByPrimaryKey(String employeeId);

    int insert(employee record);

    int insertSelective(employee record);

    employee selectByPrimaryKey(String employeeId);

    int updateByPrimaryKeySelective(employee record);

    int updateByPrimaryKey(employee record);
}