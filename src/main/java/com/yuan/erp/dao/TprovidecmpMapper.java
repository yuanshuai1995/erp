package com.yuan.erp.dao;

import com.yuan.erp.entity.Tprovidecmp;

public interface TprovidecmpMapper {
    int deleteByPrimaryKey(String providecmpId);

    int insert(Tprovidecmp record);

    int insertSelective(Tprovidecmp record);

    Tprovidecmp selectByPrimaryKey(String providecmpId);

    int updateByPrimaryKeySelective(Tprovidecmp record);

    int updateByPrimaryKey(Tprovidecmp record);
}