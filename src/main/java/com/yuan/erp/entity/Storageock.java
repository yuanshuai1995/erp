package com.yuan.erp.entity;

public class Storageock {
    private String storageockId;

    private String goodsId;

    private String goodsName;

    private Long goodsPrice;

    private String employeeId;

    private String employeeName;

    private Integer storageockNum;

    private Long storageockPriceTotal;

    public Storageock(String storageockId, String goodsId, String goodsName, Long goodsPrice, String employeeId, String employeeName, Integer storageockNum, Long storageockPriceTotal) {
        this.storageockId = storageockId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.storageockNum = storageockNum;
        this.storageockPriceTotal = storageockPriceTotal;
    }

    public Storageock() {
        super();
    }

    public String getStorageockId() {
        return storageockId;
    }

    public void setStorageockId(String storageockId) {
        this.storageockId = storageockId == null ? null : storageockId.trim();
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

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Integer getStorageockNum() {
        return storageockNum;
    }

    public void setStorageockNum(Integer storageockNum) {
        this.storageockNum = storageockNum;
    }

    public Long getStorageockPriceTotal() {
        return storageockPriceTotal;
    }

    public void setStorageockPriceTotal(Long storageockPriceTotal) {
        this.storageockPriceTotal = storageockPriceTotal;
    }
}