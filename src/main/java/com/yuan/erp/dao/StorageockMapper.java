package com.yuan.erp.dao;

import com.yuan.erp.entity.Storageock;

public interface StorageockMapper {
    int deleteByPrimaryKey(String storageockId);

    int insert(Storageock record);

    int insertSelective(Storageock record);

    Storageock selectByPrimaryKey(String storageockId);

    int updateByPrimaryKeySelective(Storageock record);

    int updateByPrimaryKey(Storageock record);
}