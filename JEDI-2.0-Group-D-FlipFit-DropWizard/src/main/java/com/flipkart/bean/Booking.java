package com.flipkart.bean;

public class Booking {
	
	private int bookingID;
	private int userID;
	private int slotID;
	private String status;
	
	
	public Booking(int bookingID, int userID, int slotID, String status) {
		super();
		this.bookingID = bookingID;
		this.userID = userID;
		this.slotID = slotID;
		this.status = status;
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
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
