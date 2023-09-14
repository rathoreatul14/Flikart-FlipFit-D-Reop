package com.flipkart.business;

import com.flipkart.bean.Booking;
import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;

import java.util.*;


public class CustomerServices implements CustomerServicesInterface{
	

	@Override
	public void viewProfile(Customer customer) {
		// TODO Auto-generated method stub
		
		System.out.println("customer ID : " + customer.getCustomerID());
		System.out.println("customer Name : " + customer.getName());
		System.out.println("customer Address : " + customer.getAddress());
		
	}
	

	@Override
	public void updateProfile(Customer customer) {
		// TODO Auto-generated method stub
		
		int custID = customer.getCustomerID();
		Scanner sc = new Scanner(System.in);
		System.out.println("username");
		String newName = sc.next();   //
		System.out.println("Address");
		String newAddress = sc.next();  
		customer.setAddress(newAddress);
		customer.setName(newName);

	}
	
	@Override
	public void viewBookings(Customer customer, HashMap<Integer,Booking> hm) {
		int custId=customer.getCustomerID();
		for(int i=0;i<hm.size();i++) {
			if(hm.get(i).getUserID()==custId) {
				Booking booking = hm.get(i);
				System.out.println("Booking Id: "+booking.getBookingID());
				System.out.println("User Id : "+booking.getUserID());
			}
		}
	}

	@Override
	public void viewGyms(HashMap<Integer, Gym> Gyms) {
		// TODO Auto-generated method stub
		for(int i=0;i<Gyms.size();i++) {
			Gym gym=Gyms.get(i);
			System.out.println("Gym Id: "+gym.getGymID());
			System.out.println("Gym Name: "+gym.getGymName());
		}
	}

//	@Override
//	public void createCustomer() {
//		// TODO Auto-generated method stub
//		
////		Customer customer1 = new Customer(101, "Ram", "Ayodhya");
////		
////		list.add(customer1);
//		
//	
//		
//	}
////
//	@Override
//	public void listCustomer() {
//		// TODO Auto-generated method stub
//		
////		for(int i = 0;i < list.size();i++) {
////			System.out.println(list.get(i));
////		}
//		
//	}
//
//	@Override
//	public void deleteCustomer(int custID) {
//		// TODO Auto-generated method stub
//		
////		int index = -1;
////		
////		for(int i = 0;i < list.size();i++){
////			if(list.get(i).getCustomerID() == custID) {
////				index = i;
////				break;
////			}
////		}
////		
////		if(index != -1)
////		   list.remove(custID);
//		
//		
//	}
//

	


}
