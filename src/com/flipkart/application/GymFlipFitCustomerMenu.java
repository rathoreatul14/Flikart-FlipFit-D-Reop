package com.flipkart.application;

import java.util.HashMap;
import java.util.Scanner;

import com.flipkart.bean.Booking;
import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;
import com.flipkart.business.CustomerServices;
import com.flipkart.business.CustomerServicesInterface;

public class GymFlipFitCustomerMenu {

    public void run(Scanner in) {
        System.out.println("Customer menu");
//        Scanner in = new Scanner(System.in);

//        System.out.println("Press 1 for Login, 2 for Signup, 3 for TataByeBye");
//        int option = in.nextInt();
//        switch option {
//            case 1:
//                System.out.print("Enter your name: ");
//                String name = in.next();
//                System.out.println("Enter your password");
//                String password = in.next();
//                System.out.println("Enter your role");
//                String role = in.next();
//                // auth()
//                switch role {
//                case "admin":
//                    GYMFlipFitAdminMenu();
//            }
//        }
        
        
    }
    
    public void customerActionPage(Scanner in, Customer customer) {
		System.out.println("\nWelcome to FlipFit Customer Application");
		CustomerServicesInterface customerService = new CustomerServices();

		int choice = 0;
		while (choice != 10) {
			System.out.println("\nMenu:-");
			System.out.println("\t1.View Profile\n" 
							+ "\t2.View Bookings\n" 
							+ "\t3.View Gyms\n"
							+ "\t4.Book Slot\n"
							+ "\t5.Exit");

			System.out.print("$ Enter your choice: ");
			choice = in.nextInt();

			switch (choice) {
				// Case statements
				case 1:
					customerService.viewProfile(customer);
					break;
				case 2:
					customerService.viewBookings(customer);;
					break;
				case 3:
					customerService.viewGyms();
					break;
				case 4:
					customerService.bookSlot(customer);
					break;
				case 5:
					System.out.println("Exit!!");
					break;
				// Default case statement
				default:
					System.out.println("Incorrect choice!!! Please try again!!!");
			}
		}
	}


}
