package com.yuan.erp.entity;

import java.util.Date;

public class Semployeel {
    private String semployeelId;

    private String goodsId;

    private String goodsName;

    private String goodsNumber;

    private String semployeelNumber;

    private Date semployeelDate;

    private String employeeNumber;

    private String custorageomerId;

    private Integer semployeelNum;

    private Long semployeelPriceTotal;

    public Semployeel(String semployeelId, String goodsId, String goodsName, String goodsNumber, String semployeelNumber, Date semployeelDate, String employeeNumber, String custorageomerId, Integer semployeelNum, Long semployeelPriceTotal) {
        this.semployeelId = semployeelId;
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsNumber = goodsNumber;
        this.semployeelNumber = semployeelNumber;
        this.semployeelDate = semployeelDate;
        this.employeeNumber = employeeNumber;
        this.custorageomerId = custorageomerId;
        this.semployeelNum = semployeelNum;
        this.semployeelPriceTotal = semployeelPriceTotal;
    }

    public Semployeel() {
        super();
    }

    public String getSemployeelId() {
        return semployeelId;
    }

    public void setSemployeelId(String semployeelId) {
        this.semployeelId = semployeelId == null ? null : semployeelId.trim();
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

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber == null ? null : goodsNumber.trim();
    }

    public String getSemployeelNumber() {
        return semployeelNumber;
    }

    public void setSemployeelNumber(String semployeelNumber) {
        this.semployeelNumber = semployeelNumber == null ? null : semployeelNumber.trim();
    }

    public Date getSemployeelDate() {
        return semployeelDate;
    }

    public void setSemployeelDate(Date semployeelDate) {
        this.semployeelDate = semployeelDate;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber == null ? null : employeeNumber.trim();
    }

    public String getCustorageomerId() {
        return custorageomerId;
    }

    public void setCustorageomerId(String custorageomerId) {
        this.custorageomerId = custorageomerId == null ? null : custorageomerId.trim();
    }

    public Integer getSemployeelNum() {
        return semployeelNum;
    }

    public void setSemployeelNum(Integer semployeelNum) {
        this.semployeelNum = semployeelNum;
    }

    public Long getSemployeelPriceTotal() {
        return semployeelPriceTotal;
    }

    public void setSemployeelPriceTotal(Long semployeelPriceTotal) {
        this.semployeelPriceTotal = semployeelPriceTotal;
    }
}