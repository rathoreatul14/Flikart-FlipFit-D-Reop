/**
 * 
 */
package com.flipkart.dao;

/**
 * 
 */
public interface AdminDaoInterface {
	/**
	 * Method to get Admin Details
	 * @param userName
	 * 
	 */

	void fetchProfile(String userName);
	/**
	 * Method to Update Admin Password
	 * @param userName
	 * @param Password
	 */

	void updatePassword(String userName, String Password);

	/**
	 * Method to View all Approved Gyms
	 * 
	 */

	void viewAllGyms();

	/**
	 * Method to View all Approved GymOwners
	 * 
	 */

	void viewAllGymOwners();

	/**
	 * Method to Approve new GymOwner 
	 * @param GymOwnerId
	 * 
	 */

	void approveGymOwner(int id);

	/**
	 * Method to Approve new Gym
	 * @param GymId
	 * 
	 */

	void approveGym(int id);

	/**
	 * Method to View All Pending GymOwner Request for approval
	 * 
	 */

	void viewPendingGymOwner();

	/**
	 * Method to View all pending gyms for approval 
	 * @param GymOwnerId
	 * 
	 */

	void viewPendingGym();
	/**
	 * Method to handle wrongGymownerId
	 * @param GymOwnerId
	 * @return True or False
	 */

	boolean wrongGymOwnerId(int id);
	/**
	 * Method to view all approved gyms
	 * @param AdminId
	 * @return True or False
	 */

	boolean alreadyApprovedGymOwner(int id);

	/**
	 * Method to view all approved gyms
	 * @param GymId
	 * @return True or False
	 */


	boolean wrongGymId(int id);
	/**
	 * Method to view all approved gyms
	 * @param GymId
	 * @return True or False
	 */
	boolean alreadyApprovedGym(int id);
	
}
