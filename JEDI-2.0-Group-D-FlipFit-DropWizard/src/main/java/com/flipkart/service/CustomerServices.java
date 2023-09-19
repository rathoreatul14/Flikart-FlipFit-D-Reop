package com.flipkart.service;

import com.flipkart.bean.Customer;
import com.flipkart.dao.CustomerDao;
import com.flipkart.exception.BookingExistsException;
import com.flipkart.exception.SlotFilledException;

import com.flipkart.bean.User;

import java.util.*;

public class CustomerServices implements CustomerServicesInterface {

	CustomerDao dao = new CustomerDao();


	// Registers a new customer
	@Override
	public void registerCustomer(Scanner sc) {

		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Email");
		String email = sc.next();

		
		
		System.out.println("Enter Address");
		String address = sc.next();
		System.out.println("Enter Mobile");
		String mobile = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();

		User user = new User(1, name, email, "customer", password);
		Customer customer = new Customer(1, name, address, user.getUserID(), mobile, email);

		dao.registerCustomer(user, customer);
		System.out.println("Customer registerd successfully");
	}

	// View details of particular customer
	@Override
	public void viewProfile(Customer customer) {
		dao.viewProfile(customer);
	}

	// Update details of a particular customer
	@Override
	public void updateProfile(Customer customer) {
		// TODO Auto-generated method stub

		int custID = customer.getCustomerID();
		Scanner sc = new Scanner(System.in);
		System.out.println("username");
		String newName = sc.next(); //
		System.out.println("Address");
		String newAddress = sc.next();
		customer.setAddress(newAddress);
		customer.setName(newName);

	}

	// View bookings of an user
	@Override
	public void viewBookings(Customer customer) {
		dao.bookedGymList(customer.getCustomerID());
	}

	// Prints list of all gyms
	@Override
	public void viewGyms() {
		dao.fetchGymList();
	}

	// To book a slot
	@Override
	public void bookSlot(Customer customer) {
		try {
			System.out.println("Enter the gymId to view slots.");
			Scanner sc = new Scanner(System.in);
			int gymId = sc.nextInt();
			if(fetchSlots(gymId)==0){
				return;
			}
			System.out.println("Enter the slotId to book slot.");
			int slotId = sc.nextInt();
			
			if (dao.isFull(slotId)) {
					throw new SlotFilledException();
			} else if (dao.isAlreadyBooked(slotId, customer.getCustomerID())) {
					throw new BookingExistsException();
			} else {
					dao.bookSlots(slotId, customer.getCustomerID());
					System.out.println("Slot booked successfully!");		
			}
		}catch(Exception Ex) {
			System.out.println(Ex.getMessage());
		}	
	}

	// Fetch list of slots in a gym
	public int fetchSlots(int gymId) {
		return dao.fetchSlotList(gymId);
	}
}
