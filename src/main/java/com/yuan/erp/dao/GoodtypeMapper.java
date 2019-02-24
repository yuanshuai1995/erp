package com.yuan.erp.dao;

import com.yuan.erp.entity.Goodtype;

public interface GoodtypeMapper {
    int deleteByPrimaryKey(String goodtypeId);

    int insert(Goodtype record);

    int insertSelective(Goodtype record);

    Goodtype selectByPrimaryKey(String goodtypeId);

    int updateByPrimaryKeySelective(Goodtype record);

    int updateByPrimaryKey(Goodtype record);
}