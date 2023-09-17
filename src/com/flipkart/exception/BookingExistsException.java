package com.flipkart.exception;

public class BookingExistsException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor for slotFilled.
	 */
	public BookingExistsException() {
		
	}
	
	/**
	 * Returns the error message when the exception is thrown.
	 * 
	 * @return The error message indicating that the slots are already filled.
	 */
	@Override
	public String getMessage() {
		return "You have already booked this slot";
	}
}
