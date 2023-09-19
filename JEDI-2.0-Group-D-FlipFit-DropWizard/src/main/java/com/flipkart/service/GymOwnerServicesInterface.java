/**
 * 
 */
package com.flipkart.service;

import java.util.Scanner;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;

/**
 * 
 */
public interface GymOwnerServicesInterface {

	// This method is used to view profile details of gym owner
	// @params owner
	public GymOwner viewProfile(int gymOwnerId);

	// This method is used to update gym owner profile
	// @params owner
	public void updateProfile(GymOwner owner);

	// This method is used to register a gym owner
	// @params in
	public String registerGymOwner(GymOwner gymOwner);

	// This method is used to view all gyms of a particular owner
	// @params owner
	public void viewGyms(GymOwner owner);

	// This method is used to register a new gym
	// @params in
	// @params owner

}
