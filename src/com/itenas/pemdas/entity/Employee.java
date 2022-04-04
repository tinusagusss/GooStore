/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.pemdas.entity;

/**
 *
 * @author agus
 */
public class Employee {

    private int no;
    private String title;
    private String firstName;
    private String lastName;
    private String initial;
    private String date;
    private int storeCode;

    public Employee() {
    }

    public Employee(String title, String firstName, String lastName, String initial, String date, int storeCode) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.initial = initial;
        this.date = date;
        this.storeCode = storeCode;
    }

    public Employee(int no, String title, String firstName, String lastName, String initial, String date, int storeCode) {
        this.no = no;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.initial = initial;
        this.date = date;
        this.storeCode = storeCode;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(int storeCode) {
        this.storeCode = storeCode;
    }

}
