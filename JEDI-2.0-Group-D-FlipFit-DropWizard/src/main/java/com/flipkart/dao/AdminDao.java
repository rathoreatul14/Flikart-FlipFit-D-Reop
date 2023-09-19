package com.flipkart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.constants.SQLConstants;
import com.flipkart.utils.DatabaseConnector;
import com.flipkart.utils.OutputFormatter;

public class AdminDao implements AdminDaoInterface{

	@Override
	public ArrayList<Gym> viewAllGyms() {
		   Connection conn = null;
		   PreparedStatement stmt = null;

		ArrayList<Gym> gymList = new ArrayList<>();
		try {
			conn = DatabaseConnector.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_ALL_GYM_QUERY_ADMIN);
			ResultSet output = stmt.executeQuery();
			while (output.next()){
				Gym gym =new Gym(output.getInt(1),output.getString(2),output.getString(5),output.getInt(6));
				gymList.add(gym);
				System.out.println(output.getInt(1));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return gymList;
	}


	@Override
	  public ArrayList<GymOwner> viewAllGymOwners() {

		   Connection conn = null;
		   PreparedStatement stmt = null;
			ArrayList<GymOwner> gymList = new ArrayList<>();
			try {
				conn = DatabaseConnector.getConnection();
				stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_ALL_OWNER_QUERY);
				ResultSet output = stmt.executeQuery();
				while (output.next()){
					GymOwner gymOwner =new GymOwner(output.getInt(1),output.getString(2),output.getString(3));
					gymList.add(gymOwner);
				}
			} catch(Exception e) {
				System.out.println(e);
			}
			return gymList;
	   }

	@Override
	  public void approveGymOwner(int id) {
			// TODO Auto-generated method stub
		   Connection conn = null;
		   PreparedStatement stmt = null;

		   try {
			   conn = DatabaseConnector.getConnection();

			   stmt = conn.prepareStatement(SQLConstants.SQL_APPROVE_GYM_OWNER_QUERY);
			   stmt.setString(1, "Approved");
			   stmt.setInt(2, id);
			   stmt.executeUpdate();
			   System.out.println("GymOwner Approved Successfully!!");


		   } catch(Exception e) {

			   System.out.println(e);
		   };
		}


	@Override
		public void approveGym(int id) {
			// TODO Auto-generated method stub
			   Connection conn = null;
			   PreparedStatement stmt = null;

			   try {
				   conn = DatabaseConnector.getConnection();
				   stmt = conn.prepareStatement(SQLConstants.SQL_APPROVE_GYM_QUERY);
				   stmt.setInt(1, 1);
				   stmt.setInt(2, id);
				   stmt.executeUpdate();
				   System.out.println("Gym approved successfully!!");

			   } catch(Exception e) {
				   System.out.println(e);
			   }
		}

	@Override
		public ArrayList<GymOwner> viewPendingGymOwner() {
			// TODO Auto-generated method stub
			Connection conn = null;
			PreparedStatement stmt = null;
			ArrayList<GymOwner> gymList = new ArrayList<>();
			try {
				conn = DatabaseConnector.getConnection();
				stmt = conn.prepareStatement(SQLConstants.SQL_PENDING_GYM_OWNER_QUERY);
				ResultSet output = stmt.executeQuery();
				while (output.next()){
					GymOwner gymOwner =new GymOwner(output.getInt(1),output.getString(2),output.getString(3));
					gymList.add(gymOwner);
				}
			} catch(Exception e) {
				System.out.println(e);
			}
			return gymList;
		}


	@Override
		public ArrayList<Gym> viewPendingGym() {
			// TODO Auto-generated method stub
			Connection conn = null;
			PreparedStatement stmt = null;
			ArrayList<Gym> gymList = new ArrayList<>();
			try {
				conn = DatabaseConnector.getConnection();
				stmt = conn.prepareStatement(SQLConstants.SQL_PENDING_GYM_QUERY);
				ResultSet output = stmt.executeQuery();
				while (output.next()){
					Gym gym =new Gym(output.getInt(1),output.getString(2),output.getString(5),output.getInt(6));
					gymList.add(gym);
					System.out.println(output.getInt(1));
				}
			} catch(Exception e) {
				System.out.println(e);
			}
			return gymList;
		}
	
	@Override
	
	public boolean wrongGymOwnerId(int id) {
		// TODO Auto-generated method stub
		
		
		   Connection conn = null;
		   
		   PreparedStatement stmt = null;
		   
		   try {
			   conn = DatabaseConnector.getConnection();
			   
			   stmt = conn.prepareStatement(SQLConstants.SQL_FETCHING_GYM_OWNER);
			   stmt.setInt(1, id);
			   ResultSet output = stmt.executeQuery();
			   int countRows = 0;
			   
			   if(output.next()) {
				   countRows++;
			   }
			   
			   if(countRows == 0)
				   return true;
			   return false;
			   
		   } catch(Exception e) {
			   System.out.println(e);
		   } 
		
		
		return false;
	}
	
	@Override 

	public boolean alreadyApprovedGymOwner(int id) {
		// TODO Auto-generated method stub
		
		   Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try {
			   conn = DatabaseConnector.getConnection();
			   
			   stmt = conn.prepareStatement(SQLConstants.SQL_FETCHING_GYM_OWNER);
			   stmt.setInt(1, id);
			   ResultSet output = stmt.executeQuery();
			   output.next();
			   String alreadyApproved = output.getString(3);
			   String s = "Approved";
			   
			   if(alreadyApproved.equals(s)) {
				   return true;
			   }else {
				   return false;
			   }
			   
			   
		   } catch(Exception e) {
			   System.out.println(e);
		   } 
		
		return false;
	}
	
	
	@Override 

	public boolean wrongGymId(int id) {
		// TODO Auto-generated method stub
		
		   Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try {
			   conn = DatabaseConnector.getConnection();
			   
			   stmt = conn.prepareStatement(SQLConstants.SQL_FETCHING_GYM);
			   stmt.setInt(1, id);
			   ResultSet output = stmt.executeQuery();
			   int countRows = 0;
			   
			   if(output.next()) {
				   countRows++;
			   }
			   if(countRows == 0)
				   return true;
			   return false;
			   
		   } catch(Exception e) {
			   System.out.println(e);
		   } 
		
		
		return false;
	}
	
	@Override

	public boolean alreadyApprovedGym(int id) {
		// TODO Auto-generated method stub
		
		   Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try {
			   conn = DatabaseConnector.getConnection();
			   
			   stmt = conn.prepareStatement(SQLConstants.SQL_FETCHING_GYM);
			   stmt.setInt(1, id);
			   ResultSet output = stmt.executeQuery();
			   output.next();
			   int alreadyApproved = output.getInt(5);
              
			   if(alreadyApproved > 0) {
				   return true;
			   }else {
				   return false;
			   }
			   
		   } catch(Exception e) {
			   System.out.println(e);
		   } 
		
		return false;
	}
		
	   
}
