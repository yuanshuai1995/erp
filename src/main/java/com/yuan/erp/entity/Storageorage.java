package com.yuan.erp.entity;

public class Storageorage {
    private String storageorageId;

    private String storageorageName;

    public Storageorage(String storageorageId, String storageorageName) {
        this.storageorageId = storageorageId;
        this.storageorageName = storageorageName;
    }

    public Storageorage() {
        super();
    }

    public String getStorageorageId() {
        return storageorageId;
    }

    public void setStorageorageId(String storageorageId) {
        this.storageorageId = storageorageId == null ? null : storageorageId.trim();
    }

    public String getStorageorageName() {
        return storageorageName;
    }

    public void setStorageorageName(String storageorageName) {
        this.storageorageName = storageorageName == null ? null : storageorageName.trim();
    }
}