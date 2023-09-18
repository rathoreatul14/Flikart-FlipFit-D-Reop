/**
 * 
 */
package com.flipkart.exception;

/**
 * @author arjit.giri
 */
public class AlreadyApprovedGymException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public AlreadyApprovedGymException(int id) {
		System.out.println("ID : " + id + " Already Approved");
	}

}
