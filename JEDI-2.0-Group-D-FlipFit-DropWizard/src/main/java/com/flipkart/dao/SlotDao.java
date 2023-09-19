/**
 * 
 */
package com.flipkart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.flipkart.bean.Slot;
import com.flipkart.bean.User;
import com.flipkart.constants.SQLConstants;
import com.flipkart.dao.SlotDaoInterface;
import com.flipkart.utils.DatabaseConnector;
import java.time.LocalTime;
import java.sql.SQLException;
import java.sql.*;

/**
 * 
 */
public class SlotDao implements SlotDaoInterface {


	@Override
	public void addSlot(Slot slot) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			// Getting customer Id
			conn = DatabaseConnector.getConnection();

//		    user.setUserName(Integer.toString(count));

			// Registering in Customer schema

			stmt = conn.prepareStatement(SQLConstants.SQL_ADD_SLOT_QUERY);
			stmt.setInt(1, slot.getCapacity());
			stmt.setString(2, slot.getSlotDate());
			stmt.setTime(3, java.sql.Time.valueOf(slot.getSlotTime()));
			stmt.setInt(4, slot.getGymId());

			stmt.executeUpdate();
		} catch (SQLException sqlExcep) {
			System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}	
		
	}

	@Override
	public void deleteSlot(int SlotId) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DatabaseConnector.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_DELETE_SLOT_QUERY);
			stmt.setInt(1, SlotId);
			int rowsUpdated=stmt.executeUpdate();
			
			if (rowsUpdated > 0) {
	                System.out.println("Slot details Details successfully.");
	            } else {
	                System.out.println("Slot not found or no changes made.");
	            }
		} catch (SQLException sqlExcep) {
			System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}
		
	}
}
	