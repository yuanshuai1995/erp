package com.yuan.erp.dao;

import com.yuan.erp.entity.Provide;

public interface ProvideMapper {
    int deleteByPrimaryKey(String provideId);

    int insert(Provide record);

    int insertSelective(Provide record);

    Provide selectByPrimaryKey(String provideId);

    int updateByPrimaryKeySelective(Provide record);

    int updateByPrimaryKey(Provide record);
}