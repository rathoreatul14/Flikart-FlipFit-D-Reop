/**
 * 
 */
package com.flipkart.constants;

/**
 * SQLConstants Class for SQL Queries 
 */
public class SQLConstants {

	public static final String SQL_AUTH_QUERY = "Select * From User Where UserName = (?) AND Password = (?)" ;
	

	public static final String SQL_FETCH_ADMIN_QUERY = "Select * From User Where UserName = (?)";
	
	public static final String SQL_UPDATE_ADMIN_PASSWORD_QUERY = "UPDATE User SET Password = (?)WHERE UserName = (?)";
	
	public static final String SQL_APPROVE_GYM_OWNER_QUERY = "UPDATE GymOwner SET status = (?) WHERE ownerId = (?)";
	
	public static final String SQL_APPROVE_GYM_QUERY = "UPDATE Gym SET Approved = (?) WHERE GymId = (?)";
	
	public static final String SQL_PENDING_GYM_OWNER_QUERY = "Select * From GymOwner Where Status = (?)";

	public static final String SQL_PENDING_GYM_QUERY = "Select * From Gym Where Approved = (?)";


	
	public static final String SQL_FETCH_ALL_OWNER_QUERY = "Select * From GymOwner";
	public static final String SQL_FETCH_ALL_GYM_QUERY_ADMIN = "Select * From Gym";
	public static final String SQL_FETCH_ALL_GYM_QUERY = "Select * From Gym Where Approved = 1";
	public static final String SQL_FETCH_PENDING_OWNER_REQ_QUERY = "Select * From GymOwner Where Approved = 0";
	public static final String SQL_FETCH_PENDING_GYM_REQ_QUERY = "Select * From Gym Where Approved = 0";
	public static final String SQL_APPR_SING_OWNER_REQ_QUERY = "Update GymOwner Set Approved = 1 Where GymOwnerId = (?)";
	public static final String SQL_APPR_SING_GYM_REQ_QUERY = "Update Gym Set Approved = 1 Where GymId = (?)";
	public static final String SQL_UNAPPR_SING_GYM_REQ_QUERY = "Update Gym Set Approved = 0 Where GymOwnerId = (?)";
	public static final String SQL_UNAPPR_SING_OWNER_REQ_QUERY = "Update GymOwner Set Approved = 0 Where GymOwnerId = (?)";
	public static final String SQL_APPR_ALL_OWNER_QUERY = "Update GymOwner Set Approved = 1";
	public static final String SQL_APPR_ALL_GYM_QUERY = "Update Gym Set Approved = 1";
	
	public static final String SQL_FETCH_SING_OWNER_DET_QUERY = "Select * From GymOwner Where GymOwnerId = (?)";
	public static final String SQL_FETCH_OWNER_GYM_DET_QUERY = "Select * From Gym Where owner = (?)";
	public static final String SQL_FETCH_GYMOWNER_USING_USERID_QUERY = "Select * From GymOwner Where UserId = (?)";
	public static final String SQL_FETCH_OWNER_APPROVAL_QUERY = "Select Approved From GymOwner Where GymOwnerId = (?)";
	public static final String SQL_SIZE_GYM_QUERY = "Select Count(*) From Gym";
	public static final String SQL_INSERT_GYM_QUERY = "Insert Into Gym Values (?,?,?,?,?,?,?)";
	public static final String SQL_SIZE_Slot_QUERY = "Select Count(*) From Slot";
	public static final String SQL_INSERT_Slot_QUERY = "Insert Into Slot Values (?,?,?,?,?)";
	public static final String SQL_SIZE_GYMOWNER_QUERY = "Select Count(*) From GymOwner";
	public static final String SQL_SIZE_GYMOWNER_REG_QUERY = "Select Count(*) From GymOwnerRegistration";
	public static final String SQL_REGISTER_GYMOWNER_QUERY = "Insert Into GymOwner (name,status,aadhar,contactNumber,address,userId) Values (?,?,?,?,?,?)";
	public static final String SQL_REGISTER_GYMOWNER_REG_QUERY = "Insert Into GymOwnerRegistration Values (?,NULL,NULL,?)";
	public static final String SQL_REGISTER_GYMOWNER_USER_QUERY = "Insert Into User (UserName,Password,Email,Role) Values (?,?,?,?)";
	public static final String SQL_FETCH_GYMOWNER_QUERY = "Select * From GymOwner Where userId = (?)";
	public static final String SQL_UPDATE_GYMOWNER_QUERY = "Update GymOwner Set name= (?), aadhar=(?),contactNumber= (?), address= (?) Where userId = (?)";
	
	
	public static final String SQL_FETCH_GYM_SLOT_QUERY = "Select * From Slot Where GymId = (?)";
	public static final String SQL_FETCH_CUSTOMER_USING_USERID_QUERY = "Select * From Customer Where UserId = (?)";
	public static final String SQL_FETCH_CUSTOMER_QUERY = "Select * From Customer Where CustomerId = (?)";
	public static final String SQL_SIZE_BOOK_QUERY = "Select Count(*) From Booking";
	public static final String SQL_SIZE_CUSTOMER_QUERY = "Select Count(*) From Customer";
	public static final String SQL_SIZE_CUSTOMER_REG_QUERY = "Select Count(*) From CustomerRegistration";
	public static final String SQL_INSERT_BOOK_QUERY = "Insert Into Booking (SlotId, CustomerId, SlotDate, SlotTime) Values (?,?,?,?)";
	public static final String SQL_FETCH_BOOK_QUERY_FOR_A_CUST = "Select * from Booking Where CustomerId = (?) And SlotId = (?)";
	public static final String SQL_COUNT_CURRENT_CAPACITY_QUERY = "Select Count(*) From Booking Where SlotId = (?)";
	public static final String SQL_CHECK_CAPACITY_QUERY = "Select * From Slot Where SlotId = (?)";
	public static final String SQL_FETCH_MY_BOOKINGS_QUERY = "Select * From Booking Where CustomerId = (?)";
	public static final String SQL_FETCH_SLOT_DETAILS_QUERY = "Select * From Slot Where SlotId = (?)";
	public static final String SQL_REGISTER_CUSTOMER_QUERY = "Insert Into Customer (Name,Mobile,Email,Address,UserId) Values (?,?,?,?,?)";
	public static final String SQL_REGISTER_CUSTOMER_REG_QUERY = "Insert Into CustomerRegistration Values (?,NULL,NULL,?)";
	public static final String SQL_REGISTER_CUSTOMER_USER_QUERY = "Insert Into User (UserName,Password,Email,Role) Values (?,?,?,?)";
	
	
	public static final String SQL_DATE_CHECK_FROM_SLOTID = "SELECT SlotDate, SlotTime from Slot WHERE SlotId = (?)";
	public static final String SQL_FETCH_SLOTID_FOR_CUSTOMER = "SELECT * from Booking  WHERE CustomerId = (?)"; 
	public static final String SQL_DELETE_QUERY_FOR_CUST_IN_Booking  = "DELETE from Booking  Where CustomerId = (?) And SlotDate = (?) And SlotTime = (?)";
	public static final String SQL_ADD_SLOT_QUERY = "Insert into slot (Capacity,SlotDate,SlotTime,GymId) values(?,?,?,?)";
	public static final String SQL_DELETE_SLOT_QUERY="Delete from slot where SlotId=(?)";

	
	
	// queries for exceptions
	
	public static final String SQL_FETCHING_GYM_OWNER = "Select * from GymOwner Where ownerId = (?)";
	public static final String SQL_FETCHING_GYM = "Select * from Gym Where GymId = (?)";
	public static final String SQL_CHECK_PREVIOUS_BOOKING = "Select * from Booking Where CustomerId = (?) AND SlotTime = (?)";
	public static final String SQL_UPDATE_BOOKING = "UPDATE Booking SET SlotId = (?) WHERE BookingId = (?)";


	public static final String SQL_INSERTING_GYM = "Insert Into Gym (Name,Address,Owner) Values (?,?,?)";


	public static final String SQL_FETCHING_INSERTING_GYM = "Select GymId from Gym where owner = (?) AND name = (?)";





	
	
	
}
