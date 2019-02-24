package com.yuan.erp.entity;

public class Provide {
    private String provideId;

    private String goodsId;

    private String goodsName;

    private String providecmpId;

    private String providecmpName;

    public Provide(String provideId, String goodsId, String goodsName, String providecmpId, String providecmpName) {
        this.provideId = provideId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.providecmpId = providecmpId;
        this.providecmpName = providecmpName;
    }

    public Provide() {
        super();
    }

    public String getProvideId() {
        return provideId;
    }

    public void setProvideId(String provideId) {
        this.provideId = provideId == null ? null : provideId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getProvidecmpId() {
        return providecmpId;
    }

    public void setProvidecmpId(String providecmpId) {
        this.providecmpId = providecmpId == null ? null : providecmpId.trim();
    }

    public String getProvidecmpName() {
        return providecmpName;
    }

    public void setProvidecmpName(String providecmpName) {
        this.providecmpName = providecmpName == null ? null : providecmpName.trim();
    }
}