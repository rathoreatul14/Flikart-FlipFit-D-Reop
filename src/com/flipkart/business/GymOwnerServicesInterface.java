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

	// This method is used to view profile details of gym owner
	// @params GymOwner
	public void viewProfile(GymOwner owner);

	// This method is used to update gym owner profile
	// @params GymOwner
	public void updateProfile(GymOwner owner);

	// This method is used to register a gym owner
	// @params Scanner
	public void registerGymOwner(Scanner in);

	// This method is used to view all gyms of a particular owner
	// @params GymOwner
	public void viewGyms(GymOwner owner);

	// This method is used to register a new gym
	// @params Scanner
	// @params GymOwner
	public void registerGym(Scanner in, GymOwner owner);
}
