package com.yuan.erp.dao;

import com.yuan.erp.entity.Goods;

public interface GoodsMapper {
    int deleteByPrimaryKey(String goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(String goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}