/**
 * Utility class for managing database connections.
 */
package com.flipkart.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
	
	private static Connection connection = null;
	
	/**
	 * Retrieves a database connection.
	 * 
	 * @return The database connection.
	 */
	public static Connection getConnection() {

        if (connection != null)
            return connection;
        else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FlipFit", "root", "root@123");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return connection;
        }
        }
    }