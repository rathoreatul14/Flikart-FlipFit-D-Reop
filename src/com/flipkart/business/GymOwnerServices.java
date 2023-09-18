package com.flipkart.business;

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

import com.flipkart.validator.GymOwnerValidator;
import com.flipkart.validator.UserValidator;


public class GymOwnerServices implements GymOwnerServicesInterface{
	GymOwnerDaoInterface gymOwnerDao = new GymOwnerDao();
	UserValidator userValidator = new UserValidator();
	GymOwnerValidator gymOwnerValidation = new GymOwnerValidator();
	@Override
	public void registerGymOwner(Scanner in) {
		// TODO Auto-generated method stub
			System.out.println("Please Enter your Details:-");
			System.out.print("$ Enter your Name: ");
			String name = in.next();
			System.out.print("$ Enter your email: ");
			String email = in.next();
			
			while(!UserValidator.isValidEmail(email)) {
				
				System.out.println("Invalid Email : ");
				System.out.print("$ Enter your email again: ");
			    email = in.next();
				
			}
			
			System.out.print("$ Enter your mobile: ");
			String mobile = in.next();
			System.out.print("$ Enter your address: ");
			String address = in.next();
			System.out.print("$ Enter your aadhaarNumber: ");
			String aadhaarNumber = in.next();
			
			
			while(!GymOwnerValidator.isValidAadharNumber(aadhaarNumber)) {
				
				System.out.println(("Invalid Aadhar Number : Please Register Again"));
				System.out.print("$ Enter your aadhaarNumber again: ");
			    aadhaarNumber = in.next();
				
			}
			
			System.out.print("$ Enter your gstNumber: ");
			String gstNumber = in.next();

			
			
			while(!GymOwnerValidator.isValidGST(gstNumber)) {
				
				System.out.println("Invalid GST Number : Please Register Again");
				System.out.print("$ Enter your gstNumber: ");
			    gstNumber = in.next();
	
			}
			
			
			System.out.print("$ Enter your role: ");
			String role = in.next();

			System.out.print("Enter your Password: ");
			String password = in.next();
			User user = new User(1,name,email,"gymOwner",password);
			
			GymOwner owner = new GymOwner(1,name,"NotApproved",aadhaarNumber,mobile,address,user.getUserID());
			
			gymOwnerDao.registerGymOwner(owner,user);
			System.out.println("$ Gym Owner Registered Successfully ");
			
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
		try {
		List<Gym> gyms =gymOwnerDao.viewGyms(owner);
		if(gyms.size()==0) {
			System.out.println("No gyms added!");
			return ;
		}
		List<String> headers = new ArrayList<>();
        headers.add("GymID");
        headers.add("Name");
        headers.add("Register Status");
        headers.add("Owner ID");

        List<List> data = new ArrayList<>();
		for (Gym gym : gyms) {
			String registrationStatus = "Not Approved";
			if(gym.getRegisterStatus()=="1") {
				registrationStatus = "Approved";
			}
            data.add(List.of(gym.getGymID(), gym.getGymName(), registrationStatus, gym.getGymOwnerID()));
        }
		OutputFormatter.outputData(headers, data);
		}
		catch(Exception Ex) {
			System.out.println(Ex.getMessage());
		}
		return;

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
