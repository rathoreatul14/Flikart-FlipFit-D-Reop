/**
 * 
 */
package com.flipkart.exception;

/**
 * @author arjit.giri
 */
public class WrongGymIdException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public WrongGymIdException(int id) {
		
		System.out.println("ID : " + id + " does not exist" );
		
	}

}
