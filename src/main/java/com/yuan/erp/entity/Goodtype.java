package com.yuan.erp.entity;

public class Goodtype {
    private String goodtypeId;

    private String goodtypeName;

    public Goodtype(String goodtypeId, String goodtypeName) {
        this.goodtypeId = goodtypeId;
        this.goodtypeName = goodtypeName;
    }

    public Goodtype() {
        super();
    }

    public String getGoodtypeId() {
        return goodtypeId;
    }

    public void setGoodtypeId(String goodtypeId) {
        this.goodtypeId = goodtypeId == null ? null : goodtypeId.trim();
    }

    public String getGoodtypeName() {
        return goodtypeName;
    }

    public void setGoodtypeName(String goodtypeName) {
        this.goodtypeName = goodtypeName == null ? null : goodtypeName.trim();
    }
}