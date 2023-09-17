/**
 * 
 */
package com.flipkart.business;

import java.util.Scanner;
import com.flipkart.bean.Customer;

/**
 * @author arjit.giri
 */
public interface CustomerServicesInterface {
	
	void registerCustomer(Scanner sc);

	void viewProfile(Customer customer);

	void updateProfile(Customer customer);

	void bookSlot(Customer customer);

	void viewGyms();

	void viewBookings(Customer customer);
	

}
