package com.flipkart.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author msaikalyan.yadav
 */

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.User;
import com.flipkart.dao.GymOwnerDao;
import com.flipkart.dao.GymOwnerDaoInterface;

import com.flipkart.utils.OutputFormatter;



public class GymOwnerServices implements GymOwnerServicesInterface{
	GymOwnerDaoInterface gymOwnerDao = new GymOwnerDao();
	@Override
	public String registerGymOwner(GymOwner gymOwner) {
		// TODO Auto-generated method stub
		User user = new User(1, gymOwner.getName(), "gymOwner@gmail.com","gymOwner", gymOwner.getPassword());
			int status =gymOwnerDao.registerGymOwner(gymOwner,user);

			if(status==1)
			{
				return "GymOwner Registered Successfully";
			}
			else
			{
				return "Registartion Unsuccessfull";
			}
		}

	@Override
	public GymOwner viewProfile(int ownerId) {
		// TODO Auto-generated method stub
		GymOwner gymOwner=gymOwnerDao.viewProfile(ownerId);
		return gymOwner;
	}

	@Override
	public void updateProfile(GymOwner owner) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Details to update your profile ->");
		System.out.println("Please Enter your Details:-");
		System.out.print("$ Enter your Name: ");
		String name = in.next();
		System.out.print("$ Enter your mobile: ");
		String mobile = in.next();
		System.out.print("$ Enter your address: ");
		String address = in.next();
		System.out.print("$ Enter your aadhaarNumber: ");
		String aadhaarNumber = in.next();

		owner.setName(name);
		owner.setContactNumber(mobile);
		owner.setAadharNumber(aadhaarNumber);
		owner.setAddress(address);

		System.out.println(owner.getName());
		System.out.println(owner.getContactNumber());


		gymOwnerDao.updateProfile(owner);

	}


	@Override
	public void viewGyms(GymOwner owner) {
		// TODO Auto-generated method stub
//		try {
//		List<Gym> gyms =gymOwnerDao.viewGyms(owner);
//		if(gyms.size()==0) {
//			System.out.println("No gyms added!");
//			return ;
//		}
//		List<String> headers = new ArrayList<>();
//        headers.add("GymID");
//        headers.add("Name");
//        headers.add("Register Status");
//        headers.add("Owner ID");
//
//        List<List> data = new ArrayList<>();
//		for (Gym gym : gyms) {
//			String registrationStatus = "Not Approved";
//			if(gym.getRegisterStatus()=="1") {
//				registrationStatus = "Approved";
//			}
//            data.add(List.of(gym.getGymID(), gym.getGymName(), registrationStatus, gym.getGymOwnerID()));
//        }
//		}
//		catch(Exception Ex) {
//			System.out.println(Ex.getMessage());
//		}
//		return;

	}


	@Override
	public void registerGym(Scanner in, GymOwner owner) {
		// TODO Auto-generated method stub

		//SlotServicesInterface slotService = new SlotServices();

		int gymID = gymOwnerDao.registerGym(in, owner);


		int gymOwnerId = owner.getId();


		System.out.println("Enter Slots details : ");

		boolean exit = true;

		int slotcnt =  0;

		while(exit) {

			System.out.println("Options:\n\t1.Add a slot.\n\t2.Exit");

			int option = in.nextInt();

			if(option == 1) {
				SlotServicesInterface slotService =new SlotServices();

				slotService.addSlot(gymID);

				System.out.println("Slot added successfully");

				slotcnt++;

			}else {
				if(slotcnt < 1) {
					System.out.println("Atleast one slot must be added: ");

				}else {
					break;
				}
			}
		}

	}





}
