package com.itenas.pemdas.controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author agus
 */
public class ConnectionManager {

    private Connection con;
    private final String Driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/pbdstore_162020016";
    private final String Username = "root";
    private final String Password = "P@ssw0rd.01";
//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

    public Connection LogOn() {
        try {
            Class.forName(Driver).newInstance();
            con = DriverManager.getConnection(url, Username, Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    public void LogOff() {
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
