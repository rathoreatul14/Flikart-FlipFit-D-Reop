package com.flipkart.application;

import java.util.Scanner;
import com.flipkart.business.AdminServices;
import com.flipkart.business.AdminServicesInterface;

public class GymFlipFitAdminMenu {

    public void run(Scanner in) {
        System.out.println("Admin menu");
//        Scanner in = new Scanner(System.in);
//
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
   
	public void approveGymOwner(Scanner in, AdminServicesInterface adminService) {
		System.out.print("Enter Owner ID: ");
		String choice = in.next();

		if (adminService.approveGymOwner(choice)) {
			System.out.print("Owner " + choice + " request approved successfully");
		} else {
			System.out.print("Error...please try again later");
		}
	}

	
	public void approveGym(Scanner in, AdminServicesInterface adminService) {
		// Add a slot timing menu here
		System.out.print("Enter Gym ID: ");
		String choice = in.next();

		if (adminService.approveGym(choice)) {
			System.out.print("Gym " + choice + " request approved successfully");
		} else {
			System.out.print("Error...please try again later");
		}
	}
	
    

	public void adminActionPage(Scanner in) {
		System.out.println("\nWelcome to FlipFit Gymnasium Application");
		AdminServicesInterface adminService = new AdminServices();

		int choice = 0;
		while (choice != 10) {
			System.out.println("\nMenu:-");
			System.out.println("\t1.View All Gym Owners\n" 
							+ "\t2.View All Gymnasiums\n" 
							+ "\t3.View Gym Owner Pending Requests\n"
							+ "\t4.View Gymnasiums Pending Requests\n" 
							+ "\t5.Approve Gym Owner Request\n" 
							+ "\t6.Approve Gymnasium Request\n"
							+ "\t7.RETURN\n");

			System.out.print("$ Enter your choice: ");
			choice = in.nextInt();

			switch (choice) {
				// Case statements
				case 1:
					adminService.viewAllGymOwners();
					break;
				case 2:
					adminService.viewAllGyms();
					break;
				case 3:
					adminService.viewPendingGymOwner();
					break;
				case 4:
					adminService.viewPendingGym();
					break;
				case 5:
					approveGymOwner(in, adminService);
					break;
				case 6:
					approveGym(in, adminService);
					break;
				case 7:
					System.out.println("Exit!!");
					break;
				// Default case statement
				default:
					System.out.println("Incorrect choice!!! Please try again!!!");
			}
		}
	}
	

}
