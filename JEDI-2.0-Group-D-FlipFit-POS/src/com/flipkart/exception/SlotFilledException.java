package com.flipkart.exception;

public class SlotFilledException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor for slotFilled.
	 */
	public SlotFilledException() {
		
	}
	
	/**
	 * Returns the error message when the exception is thrown.
	 * 
	 * @return The error message indicating that the slots are already filled.
	 */
	@Override
	public String getMessage() {
		return "Sorry, slots are already filled.";
	}
}
