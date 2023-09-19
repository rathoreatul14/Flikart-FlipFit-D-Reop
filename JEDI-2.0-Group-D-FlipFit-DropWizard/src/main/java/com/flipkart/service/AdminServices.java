package com.flipkart.service;

import java.util.Scanner;

import com.flipkart.bean.User;
import com.flipkart.dao.AdminDao;
import com.flipkart.dao.UserDao;
import com.flipkart.exception.AlreadyApprovedGymException;
import com.flipkart.exception.AlreadyApprovedGymOwnerException;
import com.flipkart.exception.WrongGymIdException;
import com.flipkart.exception.WrongGymOwnerIdException;

public class AdminServices implements AdminServicesInterface {

	AdminDao dao = new AdminDao();
	Scanner sc = new Scanner(System.in);
	UserDao userdao = new UserDao();

	// Prints details of an admin
	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		System.out.println("Enter username: ");
		String username = sc.next();
		dao.fetchProfile(username);
	}

	// Updates password of admin
	@Override
	public void updatePassword() {
		// TODO Auto-generated method stub
		System.out.println("Enter user id: ");
		String userName = sc.next();
		System.out.println("Enter password: ");
		String password = sc.next();

		User user = userdao.authenticateUser(userName, password);
		if (user == null) {
			System.out.println("Invalid Credentials.");
		} else {
			System.out.println("Enter new Password.");
			String newPassword = sc.next();
			dao.updatePassword(userName, newPassword);
		}
	}

	// Prints details of all gyms
	@Override
	public void viewAllGyms() {

		dao.viewAllGyms();

	}

	// Prints details of all gym owners
	@Override
	public void viewAllGymOwners() {

		dao.viewAllGymOwners();

	}

	// Approve gym owner registration request
	@Override
	public void approveGymOwner() {
		// TODO Auto-generated method stub

		// wrong GymOwner ID exception && already approved GymOwner exception

		try {

			System.out.println("Enter gym owner id: ");

			int id = sc.nextInt();

			if (dao.wrongGymOwnerId(id)) {
				throw new WrongGymOwnerIdException(id);
			} else if (dao.alreadyApprovedGymOwner(id)) {
				throw new AlreadyApprovedGymOwnerException(id);
			} else {

				dao.approveGymOwner(id);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// Approve gym registration request
	@Override
	public void approveGym() {
		// TODO Auto-generated method stub

		// wrong Gym ID exception && already approved exception

		try {

			System.out.println("Enter gym id: ");
			int id = sc.nextInt();

			if (dao.wrongGymId(id)) {
				throw new WrongGymIdException(id);
			} else if (dao.alreadyApprovedGym(id)) {
				throw new AlreadyApprovedGymException(id);
			} else {
				dao.approveGym(id);
			}

		} catch (Exception e)

		{
			System.out.println(e);
		}

	}

	// Prints the list of unapproved gym owners
	@Override
	public void viewPendingGymOwner() {

		dao.viewPendingGymOwner();
	}

	// Prints the list of unapproved gyms
	@Override
	public void viewPendingGym() {

		dao.viewPendingGym();
	}

}
