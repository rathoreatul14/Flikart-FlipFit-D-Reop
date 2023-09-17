/**
 * 
 */
package com.flipkart.dao;

/**
 * 
 */
public interface AdminDaoInterface {

	void fetchProfile(String userName);

	void updatePassword(String userName, String Password);

	void viewAllGyms();

	void viewAllGymOwners();

	void approveGymOwner(int id);

	void approveGym(int id);

	void viewPendingGymOwner();

	void viewPendingGym();

	boolean wrongGymOwnerId(int id);

	boolean alreadyApprovedGymOwner(int id);

	boolean wrongGymId(int id);

	boolean alreadyApprovedGym(int id);
	
}
