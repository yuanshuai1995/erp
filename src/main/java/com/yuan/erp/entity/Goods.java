package com.yuan.erp.entity;

public class Goods {
    private String goodsId;

    private String goodsNumber;

    private String goodsName;

    private String goodtypeId;

    private Long goodsPrice;

    private Integer goodsLowstorage;

    private Integer goodsTopstorage;

    private String storageorageName;

    private String goodsRemark;

    public Goods(String goodsId, String goodsNumber, String goodsName, String goodtypeId, Long goodsPrice, Integer goodsLowstorage, Integer goodsTopstorage, String storageorageName, String goodsRemark) {
        this.goodsId = goodsId;
        this.goodsNumber = goodsNumber;
        this.goodsName = goodsName;
        this.goodtypeId = goodtypeId;
        this.goodsPrice = goodsPrice;
        this.goodsLowstorage = goodsLowstorage;
        this.goodsTopstorage = goodsTopstorage;
        this.storageorageName = storageorageName;
        this.goodsRemark = goodsRemark;
    }

    public Goods() {
        super();
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

    public String getGoodtypeId() {
        return goodtypeId;
    }

    public void setGoodtypeId(String goodtypeId) {
        this.goodtypeId = goodtypeId == null ? null : goodtypeId.trim();
    }

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsLowstorage() {
        return goodsLowstorage;
    }

    public void setGoodsLowstorage(Integer goodsLowstorage) {
        this.goodsLowstorage = goodsLowstorage;
    }

    public Integer getGoodsTopstorage() {
        return goodsTopstorage;
    }

    public void setGoodsTopstorage(Integer goodsTopstorage) {
        this.goodsTopstorage = goodsTopstorage;
    }

    public String getStorageorageName() {
        return storageorageName;
    }

    public void setStorageorageName(String storageorageName) {
        this.storageorageName = storageorageName == null ? null : storageorageName.trim();
    }

    public String getGoodsRemark() {
        return goodsRemark;
    }

    public void setGoodsRemark(String goodsRemark) {
        this.goodsRemark = goodsRemark == null ? null : goodsRemark.trim();
    }
}