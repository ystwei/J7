package com.weikun.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/11/2.
 */
public class DB {
    //private static Connection conn;
    public static Connection getConnection(){
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn= DriverManager.getConnection("jdbc:mysql://192.168.3.24/test?useUnicode=true&characterEncoding=utf-8","root","root");


        } catch (Exception e) {
            e.printStackTrace();
        }


        return conn;
    }
    public static void closeConnection(Connection conn){

        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
