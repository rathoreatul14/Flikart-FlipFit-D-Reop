package com.flipkart.bean;

import java.sql.Time;

public class Booking {
	
	private int bookingID;
	private int userID;
	private int slotID;

	private String slotDate;

	private Time slotTime;

	public Booking (){

	}


	public Booking(int bookingID, int userID, int slotID, String slotDate, Time slotTime) {
		this.bookingID = bookingID;
		this.userID = userID;
		this.slotID = slotID;
		this.slotDate = slotDate;
		this.slotTime = slotTime;
	}


	public String getSlotDate() {
		return slotDate;
	}

	public Time getSlotTime() {
		return slotTime;
	}

	public void setSlotDate(String slotDate) {
		this.slotDate = slotDate;
	}

	public void setSlotTime(Time slotTime) {
		this.slotTime = slotTime;
	}


	


	public int getBookingID() {
		return bookingID;
	}
	
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public int getSlotID() {
		return slotID;
	}
	
	public void setSlotID(int slotID) {
		this.slotID = slotID;
	}
	

	
}
