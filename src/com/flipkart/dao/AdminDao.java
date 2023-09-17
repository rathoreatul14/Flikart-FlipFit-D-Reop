package com.flipkart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.flipkart.constants.SQLConstants;
import com.flipkart.utils.DBUtils;

public class AdminDao implements AdminDaoInterface{
	
	@Override
	public void fetchProfile(String userName) {
			Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try {
			   conn = DBUtils.getConnection();
			   
			   stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_ADMIN_QUERY);
			   stmt.setString(1, userName);
			   
			   ResultSet output = stmt.executeQuery();

			   if (output.next()) {
			       System.out.println("\n\tUsername\tEmail");
			       do {
			           System.out.println("\t" + output.getString(2) + " \t " + output.getString(4));
			       } while (output.next());
			   } else {
			       System.out.println("No admin registered yet");
			   }

		   } catch(Exception e) {}
	}
	
	@Override
	public void updatePassword(String userName,String Password) {
		Connection conn = null;
	   PreparedStatement stmt = null;
	   
	   try {
		   conn = DBUtils.getConnection();
		   
		   stmt = conn.prepareStatement(SQLConstants.SQL_UPDATE_ADMIN_PASSWORD_QUERY);
		   stmt.setString(1, Password);
		   stmt.setString(2, userName);
		   
		   ResultSet output = stmt.executeQuery();

	   } catch(Exception e) {}
	}
	
	@Override
	public void viewAllGyms() {
		   Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try {
			   conn = DBUtils.getConnection();
			   
			   stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_ALL_GYM_QUERY);
			   ResultSet output = stmt.executeQuery();

			   if (output.next()) {
				   System.out.println("\n\tID\tGym Name\tStatus");
			       do {
			           System.out.println("\t" + output.getString(1) + " \t " + output.getString(2)+ " \t " + output.getString(3));
			       } while (output.next());
			   } else {
			       System.out.println("No gyms available");
			   }
		   } catch(Exception e) {} 
	   }
	
	@Override
	  public void viewAllGymOwners() {
		   
		   Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try {
			   conn = DBUtils.getConnection();
			   
			   stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_ALL_OWNER_QUERY);
			   ResultSet output = stmt.executeQuery();

			   if (output.next()) {
			       System.out.println("\n\tID\tGymOwner Name\tStatus");
			       do {
			           System.out.println("\t" + output.getString(1) + " \t " + output.getString(2)+ " \t " + output.getString(3));
			       } while (output.next());
			   } else {
			       System.out.println("No gym owner registered yet");
			   }
		   } catch(Exception e) {} 
	   }
	   
	@Override
	  public void approveGymOwner(int id) {
			// TODO Auto-generated method stub
		  Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try {
			   conn = DBUtils.getConnection();
			   
			   stmt = conn.prepareStatement(SQLConstants.SQL_APPROVE_GYM_OWNER_QUERY);
			   stmt.setString(1, "Approved");
			   stmt.setInt(2, id);
			   ResultSet output = stmt.executeQuery();

		   } catch(Exception e) {}
		}


	@Override
		public void approveGym(int id) {
			// TODO Auto-generated method stub
			Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try {
				   conn = DBUtils.getConnection();
				   
				   stmt = conn.prepareStatement(SQLConstants.SQL_APPROVE_GYM_QUERY);
				   stmt.setString(1, "Approved");
				   stmt.setInt(2, id);	   
				   ResultSet output = stmt.executeQuery();

			   } catch(Exception e) {}
		}
	   
	@Override
		public void viewPendingGymOwner() {
			// TODO Auto-generated method stub
			Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try {
				   conn = DBUtils.getConnection();
				   
				   stmt = conn.prepareStatement(SQLConstants.SQL_PENDING_GYM_OWNER_QUERY);
				   stmt.setString(1, "Unapproved");
				   ResultSet output = stmt.executeQuery();

				   if (output.next()) {
					   System.out.println("\n\tID\tGym Owner Name");
				       do {
				           System.out.println("\t" + output.getString(1) + " \t " + output.getString(2));
				       } while (output.next());
				   } else {
				       System.out.println("No pending gym owners available.");
				   }
			   } catch(Exception e) {} 
		}


	@Override
		public void viewPendingGym() {
			// TODO Auto-generated method stub
			Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try {
				   conn = DBUtils.getConnection();
				   
				   stmt = conn.prepareStatement(SQLConstants.SQL_PENDING_GYM_QUERY);
				   stmt.setString(1, "Unapproved");
				   ResultSet output = stmt.executeQuery();

				   if (output.next()) {
					   System.out.println("\n\tID\tGym Name");
				       do {
				           System.out.println("\t" + output.getString(1) + " \t " + output.getString(2));
				       } while (output.next());
				   } else {
				       System.out.println("No pending gyms available.");
				   }
			   } catch(Exception e) {} 
		}
		
	   
}
