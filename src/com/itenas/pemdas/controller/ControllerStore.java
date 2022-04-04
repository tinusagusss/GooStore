/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.pemdas.controller;

import com.itenas.pemdas.entity.Store;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agus
 */
public class ControllerStore {

    public boolean check;

    ConnectionManager connectionManager = new ConnectionManager();
    Connection connection = connectionManager.LogOn();

    public List<Store> tampil() {

        List<Store> storeList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM store");
            while (result.next()) {
                Store e = new Store();
                e.setStoreCode(result.getInt("store_code"));
                e.setStoreName(result.getString("store_name"));
                e.setStoreSales(result.getString("store_ytd_sales"));
                e.setRegionCode(result.getInt("region_code"));
                storeList.add(e);
            }
        } catch (SQLException e) {
            System.out.println("Data gagal diambil dari database");
        }

        return storeList;
    }

    public void insertData(String storeName, String storeSales, int regionCode) {
        String query = "INSERT INTO store(store_name, store_ytd_sales, region_code) VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, storeName);
            preparedStatement.setString(2, storeSales);
            preparedStatement.setInt(3, regionCode);

            preparedStatement.executeUpdate();
            check = true;
        } catch (SQLException e) {
            System.out.println("Data gagal diambil dari database");
            check = false;
        }

    }

    public void updateData(int storeCode, String storeName, String storeSales, int regionCode) {
        String query = "UPDATE store SET store_name = ?, store_ytd_sales = ?, region_code = ? WHERE store_code = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, storeName);
            preparedStatement.setString(2, storeSales);
            preparedStatement.setInt(3, regionCode);
            preparedStatement.setInt(4, storeCode);

            preparedStatement.executeUpdate();
            check = true;
        } catch (SQLException e) {
            System.out.println("Data tidak dapat dilakukan perubahan");
            check = false;
        }
    }

    public void deleteData(int no) {
        String query = "DELETE FROM store WHERE store_code = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, no);
            preparedStatement.executeUpdate();
            check = true;
        } catch (SQLException e) {
            System.out.println("Data tidak dapat dihapus dari database");
            check = false;
        }
    }

}
