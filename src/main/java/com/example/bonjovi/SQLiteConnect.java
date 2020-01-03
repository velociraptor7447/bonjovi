package com.example.bonjovi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class SQLiteConnect {
     /**
     * Connect to a sample database
     */
    public static String connect() {
        Connection conn = null;
        String success = "Tried";
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\komi.s.abotsi\\MySQLiteDB";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            success =  "Connection to SQLite has been established.";
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        return success;
    }
    
}
