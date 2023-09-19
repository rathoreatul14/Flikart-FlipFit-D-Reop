package com.flipkart.dao;

import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;
import com.flipkart.bean.User;

import java.util.ArrayList;

public interface CustomerDaoInterface {
	/**
	*This is Used to register a customer
 	*@param user
  	*@param customer
	*/
	public int registerCustomer(User user, Customer customer);
	/**
	*This is Used to get custonmer from a given userID
 	*@param userId
	@return Customer Object
	*/
	public Customer getCustomerFromUserID(int userId);
	/**
	*This is Used to view profile of a particular Customer
	*This is Used to view profile of a particular Customer
 	*@param Customer
	*/
	public Customer viewProfile(int id);
	/**
	*This is Used to fetch the list of approved and available gyms
	*/
	public ArrayList<Gym> fetchGymList();
	/**
	*This is Used to fetch the slot list of a particular gym
 	*@param gymId
	*/
	public int fetchSlotList(int gymId) ;
	/**
 	*@param slotId
	*This is Used to book slots for a particular slotId for a particular user
	*/
	public void bookSlots(int slotId, int customerId);
	/**
	*This is Used to check if the give slot of a gym has available seats or not
 	*@param slotId
  	*@return True or False
	*/
	public boolean isFull(int slotId);
	/**
	*This is Used to check if the customes already has a booked seat in the particular slot
 	*@param slotId
  	*@param customerId
 	*@return True or False
	*/
	public boolean isAlreadyBooked(int slotId, int customerId);
	/**
	*This is Used to check all bookings of a customer
 	*@param custId
	*/
	public void bookedGymList(int custId);

}
