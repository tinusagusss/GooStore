/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.pemdas.controller;

import com.itenas.pemdas.entity.Employee;
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
public class ControllerEmployee {

    public boolean check;

    ConnectionManager connectionManager = new ConnectionManager();
    Connection connection = connectionManager.LogOn();

    public List<Employee> tampil() {

        List<Employee> employeeList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM employee");
            while (result.next()) {
                Employee e = new Employee();
                e.setNo(result.getInt("emp_code"));
                e.setTitle(result.getString("emp_title"));
                e.setFirstName(result.getString("emp_fname"));
                e.setLastName(result.getString("emp_lname"));
                e.setInitial(result.getString("emp_initial"));
                e.setDate(result.getString("emp_dob"));
                e.setStoreCode(result.getInt("store_code"));
                employeeList.add(e);
            }
        } catch (SQLException e) {
            System.out.println("Data gagal diambil dari database");
        }

        return employeeList;
    }

    public void insertData(String title, String firstName, String lastName, String initial, String date, int storeCode) {
        String query = "INSERT INTO employee(emp_title, emp_fname, emp_lname, emp_initial, emp_dob, store_code) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, initial);
            preparedStatement.setString(5, date);
            preparedStatement.setInt(6, storeCode);

            preparedStatement.executeUpdate();
            check = true;
        } catch (SQLException e) {
            System.out.println("Data gagal diambil dari database");
            check = false;
        }

    }

    public void updateData(String title, String firstName, String lastName, String initial, String date, int storeCode, int no) {
        String query = "UPDATE employee SET emp_title = CONCAT(?,'.'), emp_fname = ?, emp_lname = ?, emp_initial = ?, emp_dob = ?, store_code = ? WHERE emp_code = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, firstName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, initial);
            preparedStatement.setString(5, date);
            preparedStatement.setInt(6, storeCode);
            preparedStatement.setInt(7, no);

            preparedStatement.executeUpdate();
            check = true;
        } catch (SQLException e) {
            System.out.println("Data tidak dapat dilakukan perubahan");
            check = false;
        }
    }

    public void deleteMahasiswa(int no) {
        String query = "DELETE FROM employee WHERE emp_code = ?";
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
