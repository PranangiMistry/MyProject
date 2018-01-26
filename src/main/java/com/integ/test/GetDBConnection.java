package com.integ.test;

import java.sql.Connection;

/**
 * Author: mpanchal
 * Date: 1/23/18 5:19 PM
 */
import java.sql.*;
public class GetDBConnection {

    public Connection connectMyDB(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("connect successfully driver");
        }
        catch (Exception e){
            System.out.println(e);
        }
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:49171:xe", "PTM", "PTM");
            System.out.println("connetion done");

        }
        catch (Exception e){
            System.out.println(e);
        }

        if (connection != null) {
            return connection;
        } else {
            System.out.println("Failed to make connection!");
        }
        return connection;
    }
}