package com.flipkart.dao;

import com.flipkart.bean.Customer;
import com.flipkart.bean.User;

public interface CustomerDaoInterface {
	
	public void registerCustomer(User user, Customer customer);

	public Customer getCustomerFromUserID(int userId);

	public void viewProfile(Customer customer);

	public void fetchGymList();

	public void fetchSlotList(int gymId) ;

	public void bookSlots(int slotId, int customerId);

	public boolean isFull(int slotId);

	public boolean isAlreadyBooked(int slotId, int customerId);

	public void bookedGymList(int custId);

}
