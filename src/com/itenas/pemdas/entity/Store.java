/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.pemdas.entity;

/**
 *
 * @author agus
 */
public class Store {

    private int storeCode;
    private String storeName;
    private String storeSales;
    private int regionCode;

    public Store() {
    }

    public Store(int storeCode, String storeName, String storeSales, int regionCode) {
        this.storeCode = storeCode;
        this.storeName = storeName;
        this.storeSales = storeSales;
        this.regionCode = regionCode;
    }

    public Store(String storeName, String storeSales, int regionCode) {
        this.storeName = storeName;
        this.storeSales = storeSales;
        this.regionCode = regionCode;
    }

    public int getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(int storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreSales() {
        return storeSales;
    }

    public void setStoreSales(String storeSales) {
        this.storeSales = storeSales;
    }

    public int getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(int regionCode) {
        this.regionCode = regionCode;
    }

}
