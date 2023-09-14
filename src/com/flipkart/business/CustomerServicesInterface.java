/**
 * 
 */
package com.flipkart.business;

import java.util.HashMap;

import com.flipkart.bean.Booking;
import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;

/**
 * @author arjit.giri
 */
public interface CustomerServicesInterface {
	
//	public void listCustomer();
//	
//	public void createCustomer();
//	
//	void deleteCustomer(int custID);

//	void viewGyms(int cityID, HashMap<Integer, Gym> Gyms);

	void viewProfile(Customer customer);

	void updateProfile(Customer customer);

	void viewBookings(Customer customer, HashMap<Integer, Booking> hm);

	void viewGyms(HashMap<Integer, Gym> Gyms);

}
