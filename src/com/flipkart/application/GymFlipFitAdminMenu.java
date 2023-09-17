package com.flipkart.application;

import java.util.Scanner;
import com.flipkart.business.AdminServices;
import com.flipkart.business.AdminServicesInterface;

public class GymFlipFitAdminMenu {

	public void adminActionPage(Scanner in) {
		
		System.out.println("\nWelcome to FlipFit Gymnasium Application");
		
		AdminServicesInterface adminService = new AdminServices();

		int choice = 0;
		while (choice != 10) {
			System.out.println("\nMenu:-");
			System.out.println("\t1.View All Gym Owners\n" 
							+ "\t2.View All Gym\n" 
							+ "\t3.View Gym Owner Pending Requests\n"
							+ "\t4.View Gym Pending Requests\n" 
							+ "\t5.Approve Gym Owner Request\n" 
							+ "\t6.Approve Gym Request\n"
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
					adminService.approveGymOwner();
					break;
				case 6:
					adminService.approveGym();;
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
