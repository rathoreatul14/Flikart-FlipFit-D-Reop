/**
 * 
 */
package com.flipkart.service;

import java.util.ArrayList;
import java.util.Scanner;
import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;

/**
 * @author arjit.giri
 */
public interface CustomerServicesInterface {

	// This method is used to register a new customer
	// @params sc
	String registerCustomer(Customer customer);

	// This method is used to view the details of a customer
	// @params customer
	Customer viewProfile(int id);

	// This method is used to update details of a customer
	// @params customer
	void updateProfile(Customer customer);

	// This method is used by customer to book a slot
	// @params customer
	void bookSlot(Customer customer);

	// This method is used to view the details of all gyms
	ArrayList<Gym> viewGyms();

	// This method is used to view the bookings of a customer
	// @params customer
	void viewBookings(Customer customer);
	

}
