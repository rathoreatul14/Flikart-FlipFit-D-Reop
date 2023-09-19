/**
 * 
 */
package com.flipkart.service;

import java.util.Scanner;

import com.flipkart.bean.GymOwner;

/**
 * 
 */
public interface GymOwnerServicesInterface {

	// This method is used to view profile details of gym owner
	// @params owner
	public void viewProfile(GymOwner owner);

	// This method is used to update gym owner profile
	// @params owner
	public void updateProfile(GymOwner owner);

	// This method is used to register a gym owner
	// @params in
	public void registerGymOwner(Scanner in);

	// This method is used to view all gyms of a particular owner
	// @params owner
	public void viewGyms(GymOwner owner);

	// This method is used to register a new gym
	// @params in
	// @params owner
	public void registerGym(Scanner in, GymOwner owner);
}
