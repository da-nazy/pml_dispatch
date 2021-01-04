package com.pml_dispatch;

public class collectionModel {
    // This is know if the product has been attended to or not
    private int  dev_pending;
     // product name
    private String name;

    public collectionModel(){

    }

    public collectionModel(int dev_pending, String name) {
        this.dev_pending = dev_pending;
        this.name = name;
    }

    public int getDev_pending() {
        return dev_pending;
    }

    public void setDev_pending(int dev_pending) {
        this.dev_pending = dev_pending;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
