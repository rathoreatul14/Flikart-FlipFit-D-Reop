/**
 * Utility class for managing database connections.
 */
package com.flipkart.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
            	String url
                = "jdbc:mysql://localhost:3306/FlipFit"; // table details
            String username = "root"; // MySQL credentials
            String password = "root@123";
        		Class.forName(
        		    "com.mysql.cj.jdbc.Driver");
        	// Driver name
            connection = DriverManager.getConnection(
                url, username, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } 
            
            return connection;
           }
     }
}