package com.flipkart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.flipkart.constants.SQLConstants;
import com.flipkart.utils.DBUtils;
import com.flipkart.utils.OutputFormatter;
import com.flipkart.bean.*;

public class CustomerDao implements CustomerDaoInterface{

	/**
	 * Registers a new customer in the database.
	 *
	 * @param user     The user information.
	 * @param customer The customer information.
	 */
	public void registerCustomer(User user, Customer customer) {
		// Connect to the database and register the customer
		// Retrieve customer ID and register in the Customer schema
		// Register in the CustomerRegistration schema
		// Register in the User schema
		// Handle any exceptions that occur

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			// Getting customer Id
			conn = DBUtils.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_SIZE_CUSTOMER_QUERY);
			ResultSet output = stmt.executeQuery();
			output.next();
			int count = output.getInt(1);
			count++;
			count++;

//		    user.setUserName(Integer.toString(count));

			// Registering in Customer schema

			stmt = conn.prepareStatement(SQLConstants.SQL_REGISTER_CUSTOMER_USER_QUERY);
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getRole());
			stmt.executeUpdate();

			stmt = conn.prepareStatement(SQLConstants.SQL_REGISTER_CUSTOMER_QUERY);
			stmt.setString(1, customer.getName());
			stmt.setString(2, customer.getMobile());
			stmt.setString(3, customer.getEmail());
			stmt.setString(4, customer.getAddress());
			UserDao userDao = new UserDao();
			User user1 = userDao.authenticateUser(user.getName(), user.getPassword());
			stmt.setInt(5, user1.getUserID());

			stmt.executeUpdate();
		} catch (SQLException sqlExcep) {
			System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}
	}

	public Customer getCustomerFromUserID(int userId) {
		// Connect to the database and fetch the list of all gyms
		// get customer object
		// Handle any exceptions that occur

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtils.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_CUSTOMER_USING_USERID_QUERY);
			stmt.setInt(1, userId);

			ResultSet output = stmt.executeQuery();
			if (output.next()) {
				Customer customer = new Customer(output.getInt(1), output.getString(3), output.getString(4));
				return customer;
			}
			return null;

		} catch (SQLException sqlExcep) {
//		       System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}
		return null;
	}

	public void viewProfile(Customer customer) {
		// Connect to the database and fetch the list of all gyms
		// Print Customer profile
		// Handle any exceptions that occur

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtils.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_CUSTOMER_QUERY);
			stmt.setInt(1, customer.getCustomerID());

			ResultSet output = stmt.executeQuery();
			List<String> headers = new ArrayList<>();
	        headers.add("Name");
	        headers.add("Address");
	        headers.add("Email");

	        List<List> data = new ArrayList<>();
			while (output.next()) {
				data.add(List.of(output.getString(2), output.getString(5), output.getString(4)));
			}
			OutputFormatter.outputData(headers, data);
		} catch (SQLException sqlExcep) {
			System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}
	}

	/**
	 * Fetches the list of all gyms from the database.
	 */
	public void fetchGymList() {
		// Connect to the database and fetch the list of all gyms
		// Print the fetched gym details
		// Handle any exceptions that occur

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtils.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_ALL_GYM_QUERY);

			ResultSet output = stmt.executeQuery();
//			System.out.println("\tGymID\tName\tAddress");
			List<String> headers = new ArrayList<>();
	        headers.add("GymID");
	        headers.add("Name");
	        headers.add("Address");

	        List<List> data = new ArrayList<>();
			while (output.next()) {
//				System.out.println(
//						"\t " + output.getString(1) + "\t " + output.getString(2) + "\t " + output.getString(3));
				data.add(List.of(output.getString(1), output.getString(2), output.getString(3)));
			}
			OutputFormatter.outputData(headers, data);
		} catch (SQLException sqlExcep) {
//		       System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}
	}

	/**
	 * Fetches the list of available slots for a given gym from the database.
	 *
	 * @param gymId The ID of the gym.
	 */
	public void fetchSlotList(int gymId) {
		// Connect to the database and fetch the list of slots for the specified gym
		// Print the fetched slot details
		// Handle any exceptions that occur

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtils.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_GYM_SLOT_QUERY);
			stmt.setInt(1, gymId);
			ResultSet output = stmt.executeQuery();
//		    System.out.println(output);
			System.out.println("\tSlotId\tDay\ttime");
			while (output.next()) {
				System.out.println("\t " + output.getString(1) + "\t " + output.getString(3) + "    "
						+ output.getString(4) + ":00hrs");
			}
		} catch (SQLException sqlExcep) {
//		       System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}
	}

	/**
	 * Books a slot for a customer in the database.
	 *
	 * @param slotId     The ID of the slot to book.
	 * @param customerId The ID of the customer.
	 */
	public void bookSlots(int slotId, int customerId) {
		// Connect to the database and book the slot for the customer
		// Retrieve necessary details from the slot
		// Insert the booking details into the database
		// Handle any exceptions that occur

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtils.getConnection();

			stmt = conn.prepareStatement(SQLConstants.SQL_DATE_CHECK_FROM_SLOTID);
			stmt.setInt(1, slotId);
			ResultSet output = stmt.executeQuery();
			output.next();
			String date = output.getString(1);
			Time times = output.getTime(2);
			
			stmt = conn.prepareStatement(SQLConstants.SQL_CHECK_PREVIOUS_BOOKING);
			stmt.setInt(1, customerId);
			stmt.setTime(2, times);
			ResultSet out = stmt.executeQuery();
			if(out.next()) {
				
				System.out.println("getting");
				int previousSlotId = out.getInt(5);
				
				changeGymSlot( slotId, customerId, previousSlotId);
			}
			else {
			stmt = conn.prepareStatement(SQLConstants.SQL_INSERT_BOOK_QUERY);
			stmt.setInt(1, slotId);
			stmt.setInt(2, customerId);
			stmt.setString(3, date);
			stmt.setTime(4, times);

			stmt.executeUpdate();}

		} catch (SQLException sqlExcep) {
			System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}
		return;
	}

	/**
	 * Checks if a slot is full based on its capacity.
	 *
	 * @param slotId The ID of the slot to check.
	 * @return true if the slot is full, false otherwise.
	 */
	public boolean isFull(int slotId) {
		// Connect to the database and check the current capacity of the slot
		// Retrieve the total capacity of the slot
		// Return whether the current capacity is equal to or greater than the total
		// capacity
		// Handle any exceptions that occur

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtils.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_COUNT_CURRENT_CAPACITY_QUERY);
			stmt.setInt(1, slotId);
			ResultSet output = stmt.executeQuery();
			output.next();
			int current_capacity = output.getInt(1);

			stmt = conn.prepareStatement(SQLConstants.SQL_CHECK_CAPACITY_QUERY);
			stmt.setInt(1, slotId);
			output = stmt.executeQuery();
			output.next();
			int total_capacity = output.getInt(2);

			return current_capacity >= total_capacity;
		} catch (SQLException sqlExcep) {
			System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}
		return false;
	}

	/**
	 * Checks if a slot is already booked by the customer
	 * 
	 * @return true if already booked , false otherwise.
	 */
	public boolean isAlreadyBooked(int slotId, int customerId) {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtils.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_BOOK_QUERY_FOR_A_CUST);
			stmt.setInt(1, customerId);
			stmt.setInt(2, slotId);
			ResultSet output = stmt.executeQuery();
			return output.next();
		} catch (SQLException sqlExcep) {
			System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
		}
		return false;
	}

	/**
	 * Fetches the list of gyms booked by a customer from the database.
	 *
	 * @param custId The ID of the customer.
	 */
	public void bookedGymList(int custId) {
		// Connect to the database and fetch the list of slots booked by the customer
		// Print the fetched slot details
		// Handle any exceptions that occur

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtils.getConnection();
			stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_SLOTID_FOR_CUSTOMER);
			stmt.setInt(1, custId);
			ResultSet output = stmt.executeQuery();
			System.out.println("\tSlotID\tGymID\tDay\ttime");

			while (output.next()) {
				int slotId = output.getInt(5);
				stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_SLOT_DETAILS_QUERY);
				stmt.setInt(1, slotId);
				ResultSet out = stmt.executeQuery();
				while (out.next()) {
					System.out.println("\t " + out.getInt(1) + " \t " + out.getString(5) + "\t "
							+ out.getString(3) + "    " + out.getString(4) + ":00hrs");
				}
			}

		} catch (SQLException sqlExcep) {
			System.out.println(sqlExcep);
		} catch (Exception excep) {
			excep.printStackTrace();
			
		}
		return;
	}
	
	/**
	 * Changes the booked slot for a customer in the database.
	 *
	 * @param slotId     The ID of the new slot to book.
	 * @param customerId The ID of the customer.
	 * @return true if the slot is changed successfully, false otherwise.
	 */
	public boolean changeGymSlot(int slotId,int customerId, int previousSlot) {
		// Connect to the database and retrieve the details of the new slot
		// Retrieve the day and times of the new slot
		// Retrieve the current bookings of the customer on the same day and times
		// Delete the existing bookings and insert the new booking
		// Return whether the slot was changed successfully
		// Handle any exceptions that occur
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			
			conn = DBUtils.getConnection();
		    stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_BOOK_QUERY_FOR_A_CUST);
		    stmt.setInt(1, customerId);
		    stmt.setInt(2, previousSlot);
			ResultSet out = stmt.executeQuery();
			while(out.next()) {
				int bookingId = out.getInt(1);
				System.out.println(bookingId);
				
				stmt = conn.prepareStatement(SQLConstants.SQL_UPDATE_BOOKING);
				stmt.setInt(1, slotId);
				stmt.setInt(2, bookingId);
				stmt.executeUpdate();
				
			}
			return true;
		    	
	    } catch(SQLException sqlExcep) {
//		       System.out.println(sqlExcep);
	    } catch(Exception excep) {
	           excep.printStackTrace();
	    }
		return true;
	}

}