/**
 * 
 */
package com.flipkart.dao;

import java.util.List;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.User;

/**
 * 
 */
public interface GymOwnerDaoInterface {

	public GymOwner getGymOwnerFromUserId(int userId);

	public void registerGymOwner(GymOwner owner, User user);
	
	public void viewProfile(GymOwner owner);

	public void updateProfile(GymOwner owner);

	public List<Gym> viewGyms(GymOwner owner);
	
	
	
}
