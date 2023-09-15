package com.flipkart.application;

import java.time.LocalDate;
import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

import com.flipkart.bean.Booking;
import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;
import com.flipkart.bean.User;
import com.flipkart.dao.CustomerDao;
import com.flipkart.dao.UserDao;
import com.flipkart.business.CustomerServicesInterface;
import com.flipkart.business.CustomerServices;


public class GymFlipFitApplication {

	public static void main(String[] args) {
		
		
		System.out.println("\nWelcome to FlipFit Gym Application");
		Scanner in = new Scanner(System.in);
		int choice = 1;
		while (choice != 4) {

			System.out.println("\nMenu:-");
			System.out.println("\t1. Login\n" + "\t2. Admin Registration\n" + "\t3. Customer Registration\n" + "\t4. GymOwner Registration" + "\t5. Exit\n");

			System.out.print("$ Enter your choice: ");

			try {
				choice = in.nextInt();
				in.nextLine(); // Consume the newline character after reading the integer

				switch (choice) {
				case 1:
					openLoginMenu(in);
					break;
				case 2:
					GymFlipFitAdminMenu admin = new GymFlipFitAdminMenu();
					admin.run(in);
					break;
				case 3:
					CustomerServicesInterface customerService=new CustomerServices();
					customerService.registerCustomer(in);
					break;
				case 4:
					GymFlipFitGymOwnerMenu gymOwner = new GymFlipFitGymOwnerMenu();
					gymOwner.run(in);
					break;
				case 5:
//					System.exit(0);
					break;

				default:
					System.out.println("Invalid Credentials");
				}
			} catch (Exception e) {
				System.out.println("Error");
			}

		}
		System.out.println("Thankyou for visiting");
		in.close();
	}

	public static void openLoginMenu(Scanner in) {
		// Login check users
		System.out.println("\nEnter your login credentials:-");
		
		System.out.print("$ Username: ");
		String username= in.next();
		
		System.out.print("$ Password: ");
		String password = in.next();
		
		
		// authenticate
		// hard coded right now
		UserDao dao = new UserDao();
		User user=dao.authenticateUser(username, password);
		if(user==null) {
			System.out.println("Invalid Credentials");
			System.exit(0);
		}

		System.out.println("User logged In");
		
		String role = user.getRole();
//		LocalDate localDate = LocalDate.now();
//		System.out.println(localDate.getDayOfMonth() + "/" + localDate.getMonth() + "/" + localDate.getYear());
		System.out.println("Hello!! " + "\nWelcome to GMS");
		System.out.println(role);
		switch (role) {
			case "admin": 
				GymFlipFitAdminMenu admin = new GymFlipFitAdminMenu();
				admin.adminActionPage(in);
				break;
				
			case "customer": 
				GymFlipFitCustomerMenu customerMenu = new GymFlipFitCustomerMenu();
				CustomerDao cusDao = new CustomerDao();
				Customer customer = cusDao.getCustomerFromUserID(user.getUserID());
				customerMenu.customerActionPage(in, customer);
				break;
				
			case "gymOwner":
				
				GymFlipFitGymOwnerMenu owner = new GymFlipFitGymOwnerMenu();
//				owner.customerActionPage(in, user);
				break;
				
			default:
				System.out.println("\nIncorrect choice!!! Please try again!!!");
				break;
		}
		
	}
}
