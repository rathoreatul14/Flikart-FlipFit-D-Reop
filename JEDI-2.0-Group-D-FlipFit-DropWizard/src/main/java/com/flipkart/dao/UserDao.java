/**
 * DAO class for User management system.
 */
package com.flipkart.dao;
import java.sql.Connection;

import com.flipkart.bean.User;
import com.flipkart.constants.SQLConstants;
import com.flipkart.utils.DatabaseConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DAO class that provides database operations for User management system.
 */
public class UserDao {
	
	/**
	 * Authenticates a user by checking their username and password.
	 *
	 * @param userName The username of the user.
	 * @param password The password of the user.
	 * @return The exit code: 0 for admin, 1 for customer, 2 for gym owner, 3 for trainer, 4 for invalid credentials.
	 */	   
   public User authenticateUser(String userName, String password) {
	   int exitCode = 4;
	   
	   Connection conn = null;
	   PreparedStatement stmt = null;
	   
	   try {
		   conn = DatabaseConnector.getConnection();
		   
		   stmt = conn.prepareStatement(SQLConstants.SQL_AUTH_QUERY);
		   stmt.setString(1, userName);
		   stmt.setString(2, password);
	
		   ResultSet output = stmt.executeQuery();
		   //System.out.println(output.getString("UserName"));
		   if(output.next()) {
		   
		   User user = new User(output.getInt(1),output.getString(2),output.getString(4),output.getString(5),output.getString(3));

		   return user;
		   }
		   else return null;
		   
	   } catch(SQLException sqlExcep) {
	      System.out.println(sqlExcep);
	   } catch(Exception excep) {
	      excep.printStackTrace();
	   }
	   
	   return null;
   }
}