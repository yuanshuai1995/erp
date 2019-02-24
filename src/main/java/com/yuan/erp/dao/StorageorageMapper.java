package com.yuan.erp.dao;

import com.yuan.erp.entity.Storageorage;

public interface StorageorageMapper {
    int deleteByPrimaryKey(String storageorageId);

    int insert(Storageorage record);

    int insertSelective(Storageorage record);

    Storageorage selectByPrimaryKey(String storageorageId);

    int updateByPrimaryKeySelective(Storageorage record);

    int updateByPrimaryKey(Storageorage record);
}