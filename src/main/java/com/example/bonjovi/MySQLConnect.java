package com.example.bonjovi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 *
 * @author komi.abotsi
 */
public class MySQLConnect {
    /**
     * Connect to a sample database
     */
    public static String connect() {
        Connection conn = null;
        String success = "Tried";
        try {
            // db parameters
            // Later, these should be read from a property file
            // Also I need to figure out how to add the db name to the url;
            final String url = "jdbc:mysql://localhost:3306/";
            final String username = "root";
            final String password = "903naSub)";
            // create a connection to the database
            conn = DriverManager.getConnection(url, username, password);
            success =  "Connection to MySQL has been established.";
            
        } catch (final SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (final SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        return success;
    }
    
}
