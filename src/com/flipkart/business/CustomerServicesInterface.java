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

	// This method is used to register a new customer
	// @params Scanner
	void registerCustomer(Scanner sc);

	// This method is used to view the details of a customer
	// @params Customer
	void viewProfile(Customer customer);

	// This method is used to update details of a customer
	// @params Customer
	void updateProfile(Customer customer);

	// This method is used by customer to book a slot
	// @params Customer
	void bookSlot(Customer customer);

	// This method is used to view the details of all gyms
	void viewGyms();

	// This method is used to view the bookings of a customer
	// @params Customer
	void viewBookings(Customer customer);
	

}
