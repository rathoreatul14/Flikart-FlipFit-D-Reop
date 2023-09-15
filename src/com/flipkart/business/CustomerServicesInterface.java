/**
 * 
 */
package com.flipkart.business;

import java.util.HashMap;
import java.util.Scanner;

import com.flipkart.bean.Booking;
import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;

/**
 * @author arjit.giri
 */
public interface CustomerServicesInterface {
	
	void registerCustomer(Scanner sc);

	void viewProfile(Customer customer);

	void updateProfile(Customer customer);

	void viewBookings(Customer customer, HashMap<Integer, Booking> hm);

	void viewGyms(HashMap<Integer, Gym> Gyms);
	

}
