package com.sweet.config;


import java.sql.*;

/**
 * Author:sweet
 * Created:2019/5/18
 */
//pass
public class DBManger {
    private String username;
    private String password;
    private String driverClass;
    private String url;


    private Connection conn=null;
    private Statement statement=null;
    private ResultSet rs=null;


    public Connection getConnection(){
        try {
            conn=DriverManager.getConnection(url,username,password);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
return conn;
    }
}
