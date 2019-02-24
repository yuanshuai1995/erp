package com.yuan.erp.dao;

import com.yuan.erp.entity.Custorageomer;

public interface CustorageomerMapper {
    int deleteByPrimaryKey(String custorageomerId);

    int insert(Custorageomer record);

    int insertSelective(Custorageomer record);

    Custorageomer selectByPrimaryKey(String custorageomerId);

    int updateByPrimaryKeySelective(Custorageomer record);

    int updateByPrimaryKey(Custorageomer record);
}