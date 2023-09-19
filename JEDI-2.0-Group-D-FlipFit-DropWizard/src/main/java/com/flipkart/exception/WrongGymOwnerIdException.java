/**
 * 
 */
package com.flipkart.exception;

/**
 * @author arjit.giri
 */
public class WrongGymOwnerIdException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public WrongGymOwnerIdException(int id) {
		
		System.out.println("This id : " + id  + " does not exist");
		
	}
	
}
