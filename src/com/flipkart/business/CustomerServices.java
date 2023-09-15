package com.flipkart.business;

import com.flipkart.bean.Booking;
import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;
import com.flipkart.dao.CustomerDao;
import com.flipkart.bean.User;

import java.util.*;

import com.flipkart.bean.Booking;
public class CustomerServices implements CustomerServicesInterface{
	
	CustomerDao dao = new CustomerDao();
	
	@Override
	public void registerCustomer(Scanner sc) {
		
		System.out.println("Enter Name");
		String  name = sc.next();
		System.out.println("Enter Email");
		String  email = sc.next();
		System.out.println("Enter Address");
		String  address = sc.next();
		System.out.println("Enter Mobile");
		String  mobile = sc.next();
		System.out.println("Enter Password");
		String  password = sc.next();
		
		User user=new User(1,name,email,"customer",password);
		Customer customer =new Customer(1,name,address,user.getUserID(),mobile,email);
		
		dao.registerCustomer(user, customer);
		System.out.println("Customer registerd successfully");
	}

	@Override
	public void viewProfile(Customer customer) {
		dao.viewProfile(customer);
	}
		// TODO Auto-generated method stub
		
	

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
