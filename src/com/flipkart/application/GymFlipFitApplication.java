package com.flipkart.application;

import java.util.Scanner;

public class GymFlipFitApplication {

	public static void main(String[] args) {
		System.out.println("\nWelcome to FlipFit Gym Application");
		Scanner in = new Scanner(System.in);
		int choice = 1;
		openLoginMenu(in);
		while (choice != 4) {

			System.out.println("\nMenu:-");
			System.out.println("\t1. Admin Menu\n" + "\t2. Customer Menu\n" + "\t3. GymOwner Menu" + "\t4. Exit\n");

			System.out.print("$ Enter your choice: ");

			try {
				choice = in.nextInt();
				in.nextLine(); // Consume the newline character after reading the integer

				switch (choice) {
				case 1:
					GymFlipFitAdminMenu admin = new GymFlipFitAdminMenu();
					admin.run(in);
					break;

				case 2:
					GymFlipFitCustomerMenu customer = new GymFlipFitCustomerMenu();
					customer.run(in);
					break;

				case 3:
					GymFlipFitGymOwnerMenu gymOwner = new GymFlipFitGymOwnerMenu();
					gymOwner.run(in);
					break;
				case 4:
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
		// Login check
		System.out.println("Login Function Started");
	}
}
