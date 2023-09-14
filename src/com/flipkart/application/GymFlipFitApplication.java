package com.flipkart.application;

import java.util.Scanner;

public class GymFlipFitApplication {

	public static void main(String[] args) {
		System.out.println("\nWelcome to FlipFit Gym Application");
		Scanner in = new Scanner(System.in);
		int choice = 1;

		while (choice != 5) {

			System.out.println("\nMenu:-");
			System.out.println("\t1. Login\n"
					+ "\t2. GymOwner Menu\n"
					+ "\t3. Customer Menu>\n"
					+ "\t4. Admin Menu"
					+ "\t4. Exit\n");

			System.out.print("$ Enter your choice: ");

			try {
				choice = in.nextInt();
				in.nextLine(); // Consume the newline character after reading the integer

				switch (choice) {
					case 1:
						System.out.println("");
						openLoginMenu(in);
						break;

					case 2:
						GymFlipFitAdminMenu admin = new GymFlipFitAdminMenu();
						admin.run(in);
						break;

					case 3:
						GymFlipFitCustomerMenu customer = new GymFlipFitCustomerMenu();
						customer.run(in);
						break;

					case 4:
						GymFlipFitGymOwnerMenu gymOwner = new GymFlipFitGymOwnerMenu();
						gymOwner.run(in);
						break;
					case 5:
						break;

					default:
						System.out.println("Invalid Credentials");
				}
			}
		}
		in.close();
	}

	public void openLoginMenu(Scanner in){
		// Login check
		System.out.println("Login Function Started");
	}
}
