package com.yuan.erp.entity;

public class Tprovidecmp {
    private String providecmpId;

    private String providecmpNumber;

    private String providecmpName;

    private String providecmpAdress;

    private String providecmpPerson;

    private String providecmpTel;

    public Tprovidecmp(String providecmpId, String providecmpNumber, String providecmpName, String providecmpAdress, String providecmpPerson, String providecmpTel) {
        this.providecmpId = providecmpId;
        this.providecmpNumber = providecmpNumber;
        this.providecmpName = providecmpName;
        this.providecmpAdress = providecmpAdress;
        this.providecmpPerson = providecmpPerson;
        this.providecmpTel = providecmpTel;
    }

    public Tprovidecmp() {
        super();
    }

    public String getProvidecmpId() {
        return providecmpId;
    }

    public void setProvidecmpId(String providecmpId) {
        this.providecmpId = providecmpId == null ? null : providecmpId.trim();
    }

    public String getProvidecmpNumber() {
        return providecmpNumber;
    }

    public void setProvidecmpNumber(String providecmpNumber) {
        this.providecmpNumber = providecmpNumber == null ? null : providecmpNumber.trim();
    }

    public String getProvidecmpName() {
        return providecmpName;
    }

    public void setProvidecmpName(String providecmpName) {
        this.providecmpName = providecmpName == null ? null : providecmpName.trim();
    }

    public String getProvidecmpAdress() {
        return providecmpAdress;
    }

    public void setProvidecmpAdress(String providecmpAdress) {
        this.providecmpAdress = providecmpAdress == null ? null : providecmpAdress.trim();
    }

    public String getProvidecmpPerson() {
        return providecmpPerson;
    }

    public void setProvidecmpPerson(String providecmpPerson) {
        this.providecmpPerson = providecmpPerson == null ? null : providecmpPerson.trim();
    }

    public String getProvidecmpTel() {
        return providecmpTel;
    }

    public void setProvidecmpTel(String providecmpTel) {
        this.providecmpTel = providecmpTel == null ? null : providecmpTel.trim();
    }
}