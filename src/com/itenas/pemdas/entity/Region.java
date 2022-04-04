/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.pemdas.entity;

/**
 *
 * @author agus
 */
public class Region {

    private int regionCode;
    private String regionDescript;

    public Region() {
    }

    public Region(int regionCode, String regionDescript) {
        this.regionCode = regionCode;
        this.regionDescript = regionDescript;
    }

    public int getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(int regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionDescript() {
        return regionDescript;
    }

    public void setRegionDescript(String regionDescript) {
        this.regionDescript = regionDescript;
    }

}
