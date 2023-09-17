package com.flipkart.business;

import java.util.Scanner;

import com.flipkart.bean.User;
import com.flipkart.dao.AdminDao;
import com.flipkart.dao.UserDao;

public class AdminServices implements AdminServicesInterface{

	AdminDao dao = new AdminDao();
	Scanner sc= new Scanner(System.in);
	UserDao userdao = new UserDao();
	
	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		System.out.println("Enter username: ");
		String username = sc.next();
		dao.fetchProfile(username);
	}

	@Override
	public void updatePassword() {
		// TODO Auto-generated method stub
		System.out.println("Enter user id: ");
		String userName = sc.next();
		System.out.println("Enter password: ");
		String password = sc.next();
		
		User user = userdao.authenticateUser(userName, password);
		if(user== null) {
			System.out.println("Invalid Credentials.");
		}
		else{
			System.out.println("Enter new Password.");
			String newPassword = sc.next();
			dao.updatePassword(userName,newPassword);
		}
	}

	@Override
	public void viewAllGyms() {
		// TODO Auto-generated method stub
		dao.viewAllGyms();
		
	}
	
	@Override
	public void viewAllGymOwners() {
		// TODO Auto-generated method stub
		dao.viewAllGymOwners();
		
	}
	
	@Override
	public void approveGymOwner() {
		// TODO Auto-generated method stub
		System.out.println("Enter gym owner id: ");
		int id = sc.nextInt();
		dao.approveGymOwner(id);
	}

	@Override
	public void approveGym() {
		// TODO Auto-generated method stub
		System.out.println("Enter gym id: ");
		int id = sc.nextInt();
		dao.approveGym(id);
		
	}

	@Override
	public void viewPendingGymOwner() {
		// TODO Auto-generated method stub
		dao.viewPendingGymOwner();
	}

	@Override
	public void viewPendingGym() {
		// TODO Auto-generated method stub
		dao.viewPendingGym();
	}
	
	
}
