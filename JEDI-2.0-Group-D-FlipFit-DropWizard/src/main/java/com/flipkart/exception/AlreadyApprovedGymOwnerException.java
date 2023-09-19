/**
 * 
 */
package com.flipkart.exception;

/**
 * @author arjit.giri
 */
public class AlreadyApprovedGymOwnerException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public AlreadyApprovedGymOwnerException(int id) {
		
		System.out.println("ID : " + id + " Already Approved");
		
	}

}
