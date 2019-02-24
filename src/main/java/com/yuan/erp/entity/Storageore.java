package com.yuan.erp.entity;

public class Storageore {
    private String storageoreId;

    private String goodsId;

    private String goodsNumber;

    private String goodsName;

    private Integer goodsNum;

    public Storageore(String storageoreId, String goodsId, String goodsNumber, String goodsName, Integer goodsNum) {
        this.storageoreId = storageoreId;
        this.goodsId = goodsId;
        this.goodsNumber = goodsNumber;
        this.goodsName = goodsName;
        this.goodsNum = goodsNum;
    }

    public Storageore() {
        super();
    }

    public String getStorageoreId() {
        return storageoreId;
    }

    public void setStorageoreId(String storageoreId) {
        this.storageoreId = storageoreId == null ? null : storageoreId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber == null ? null : goodsNumber.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }
}