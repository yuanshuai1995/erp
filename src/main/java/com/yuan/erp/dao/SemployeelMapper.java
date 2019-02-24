package com.yuan.erp.dao;

import com.yuan.erp.entity.Semployeel;

public interface SemployeelMapper {
    int deleteByPrimaryKey(String semployeelId);

    int insert(Semployeel record);

    int insertSelective(Semployeel record);

    Semployeel selectByPrimaryKey(String semployeelId);

    int updateByPrimaryKeySelective(Semployeel record);

    int updateByPrimaryKey(Semployeel record);
}