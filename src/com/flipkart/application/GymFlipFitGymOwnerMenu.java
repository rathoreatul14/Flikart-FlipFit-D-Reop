package com.flipkart.application;
/**
 * @author msaikalyan.yadav
 */
import java.util.Scanner;
import com.flipkart.bean.GymOwner;
import com.flipkart.business.GymOwnerServices;
import com.flipkart.business.GymOwnerServicesInterface;

public class GymFlipFitGymOwnerMenu {
        
    	   public void GymOwnerActionPage(Scanner in, GymOwner owner) {
    			System.out.println("\nWelcome to FlipFit GymOwner Application");
    			GymOwnerServicesInterface gymOwnerService = new GymOwnerServices();

    			int choice = 0;
    			while (choice != 10) {
    				System.out.println("\nMenu:-");
    				System.out.println("\t1.View Profile\n" 
    								+ "\t2.Update profile\n" 
    								+ "\t3.View MyGyms\n"
    								+ "\t4.Add Gym\n"
    								+ "\t5.Exit");

    				System.out.print("$ Enter your choice: ");
    				choice = in.nextInt();

    				switch (choice) {
    					// Case statements
    					case 1:
    						gymOwnerService.viewProfile(owner);
    						break;
    					case 2:
    						gymOwnerService.updateProfile(owner);;
    						break;
    					case 3:
    						gymOwnerService.viewGyms(owner);
    						break;
    					case 4:
    					    gymOwnerService.registerGym(in,owner);
    						break;
    					case 5:
    						System.out.println("Exit!!");
    						break;
    					// Default case statement
    					default:
    						System.out.println("Incorrect choice!!! Please try again!!!");
    				}
    			}
    		}

        
    }

