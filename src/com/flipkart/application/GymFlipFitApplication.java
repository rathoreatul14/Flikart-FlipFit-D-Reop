package com.flipkart.application;

public class GymFlipFitApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Press 1 for Login, 2 for Signup, 3 for TataByeBye");
		int option = in.nextInt();
		switch(option) {
			case 1:
				System.out.print("Enter your name: ");
				String name = in.next();
				System.out.println("Enter your password");
				String password = in.next();
				System.out.println("Enter your role");
				String role = in.next();
				// auth()
				switch (role) {
					case "admin":
						GYMFlipFitAdminMenu.run();
						break;
					case "customer":
						GYMFlipFitCustomerMenu.run();
						break;
					case "gymowner":
						GYMFlipFitGymOwnerMenu.run();
						break;
				}
				break;
		}
	}

}
