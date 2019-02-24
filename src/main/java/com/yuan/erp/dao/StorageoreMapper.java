package com.yuan.erp.dao;

import com.yuan.erp.entity.Storageore;

public interface StorageoreMapper {
    int deleteByPrimaryKey(String storageoreId);

    int insert(Storageore record);

    int insertSelective(Storageore record);

    Storageore selectByPrimaryKey(String storageoreId);

    int updateByPrimaryKeySelective(Storageore record);

    int updateByPrimaryKey(Storageore record);
}