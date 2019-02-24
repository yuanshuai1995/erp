package com.yuan.erp.entity;

public class Custorageomer {
    private String custorageomerId;

    private String custorageomerName;

    private String custorageomerIdcard;

    private String custorageomerTel;

    public Custorageomer(String custorageomerId, String custorageomerName, String custorageomerIdcard, String custorageomerTel) {
        this.custorageomerId = custorageomerId;
        this.custorageomerName = custorageomerName;
        this.custorageomerIdcard = custorageomerIdcard;
        this.custorageomerTel = custorageomerTel;
    }

    public Custorageomer() {
        super();
    }

    public String getCustorageomerId() {
        return custorageomerId;
    }

    public void setCustorageomerId(String custorageomerId) {
        this.custorageomerId = custorageomerId == null ? null : custorageomerId.trim();
    }

    public String getCustorageomerName() {
        return custorageomerName;
    }

    public void setCustorageomerName(String custorageomerName) {
        this.custorageomerName = custorageomerName == null ? null : custorageomerName.trim();
    }

    public String getCustorageomerIdcard() {
        return custorageomerIdcard;
    }

    public void setCustorageomerIdcard(String custorageomerIdcard) {
        this.custorageomerIdcard = custorageomerIdcard == null ? null : custorageomerIdcard.trim();
    }

    public String getCustorageomerTel() {
        return custorageomerTel;
    }

    public void setCustorageomerTel(String custorageomerTel) {
        this.custorageomerTel = custorageomerTel == null ? null : custorageomerTel.trim();
    }
}