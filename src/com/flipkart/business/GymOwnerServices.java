package com.flipkart.business;

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

public class GymOwnerServices implements GymOwnerServicesInterface{
	GymOwnerDaoInterface gymOwnerDao = new GymOwnerDao();
	@Override
	public void registerGymOwner(Scanner in) {
		// TODO Auto-generated method stub
			System.out.println("Please Enter your Details:-");
			System.out.print("$ Enter your Name: ");
			String name = in.next();
			System.out.print("$ Enter your email: ");
			String email = in.next();
			System.out.print("$ Enter your mobile: ");
			String mobile = in.next();
			System.out.print("$ Enter your address: ");
			String address = in.next();
			System.out.print("$ Enter your aadhaarNumber: ");
			String aadhaarNumber = in.next();
			System.out.print("$ Enter your gstNumber: ");
			String gstNumber = in.next();
			System.out.print("Enter your Password: ");
			String password = in.next();
			User user = new User(1,name,email,"gymOwner",password);
			
			GymOwner owner = new GymOwner(1,name,"NotApproved",aadhaarNumber,mobile,address,user.getUserID());
			
			gymOwnerDao.registerGymOwner(owner,user);
			
		}

	@Override
	public void viewProfile(GymOwner owner) {
		// TODO Auto-generated method stub
		gymOwnerDao.viewProfile(owner);
		
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
		List<Gym> gyms =gymOwnerDao.viewGyms(owner);
		for (Gym gym : gyms) {
            System.out.println("Gym ID: " + gym.getGymID());
            System.out.println("Gym Name: " + gym.getGymName());
            System.out.println("Register Status: " + gym.getRegisterStatus());
            System.out.println("Owner ID: " + gym.getGymOwnerID());
            System.out.println("------------------------------------------------");
        }
		
	}


	@Override
	public void registerGym(Scanner in, GymOwner owner) {
		// TODO Auto-generated method stub
		
		//SlotServicesInterface slotService = new SlotServices();
		
		int gymID = gymOwnerDao.registerGym(in, owner);
		
	
		int gymOwnerId = owner.getId();
	
		
		System.out.println("Enetr Slots details : ");
		
		boolean exit = true;
		
		int slotcnt =  0;
		
		while(exit) {
			
			System.out.println("Options 1: Add a slot  2: Exit");
			
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
