/**
 * 
 */
package com.flipkart.business;

import java.util.Scanner;

import com.flipkart.bean.GymOwner;

/**
 * 
 */
public interface GymOwnerServicesInterface {
	
	public void viewProfile(GymOwner owner);
	
	public void updateProfile(GymOwner owner);
	
	public void registerGymOwner(Scanner in);
	
	public void viewGyms(GymOwner owner);

	public void registerGym(Scanner in, GymOwner owner);
}
