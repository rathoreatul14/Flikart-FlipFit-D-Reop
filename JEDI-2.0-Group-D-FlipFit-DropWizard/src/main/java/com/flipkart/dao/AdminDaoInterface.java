/**
 * 
 */
package com.flipkart.dao;

import com.flipkart.bean.*;

import java.util.ArrayList;


/**
 * 
 */
public interface AdminDaoInterface {


	/**
	 * Method to View all Approved Gyms
	 * 
	 */

	ArrayList<Gym> viewAllGyms();

	/**
	 * Method to View all Approved GymOwners
	 * 
	 */

	ArrayList<GymOwner> viewAllGymOwners();


	ArrayList<GymOwner> viewPendingGymOwner();


	ArrayList<Gym> viewPendingGym();

	void approveGymOwner(int id);



	void approveGym(int id);

	/**
	 * Method to View All Pending GymOwner Request for approval
	 * 
	 */





	boolean wrongGymOwnerId(int id);


	boolean alreadyApprovedGymOwner(int id);




	boolean wrongGymId(int id);

	boolean alreadyApprovedGym(int id);
	
}
