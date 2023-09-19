package com.flipkart.service;

import java.util.ArrayList;
import java.util.Scanner;
import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
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

	// Prints details of all gyms
	@Override
	public ArrayList<Gym> viewAllGyms() {
		return dao.viewAllGyms();
	}

	// Prints details of all gym owners
	@Override
	public ArrayList<GymOwner> viewAllGymOwners() {
		return dao.viewAllGymOwners();
	}

	// Prints the list of unapproved gym owners
	@Override
	public ArrayList<GymOwner> viewPendingGymOwner() {
		return dao.viewPendingGymOwner();
	}

	// Prints the list of unapproved gyms
	@Override
	public ArrayList<Gym> viewPendingGym() {
		return dao.viewPendingGym();
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



}
