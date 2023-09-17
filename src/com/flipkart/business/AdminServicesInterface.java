/**
 * 
 */
package com.flipkart.business;

/**
 * @author arjit.giri
 */
public interface AdminServicesInterface {
	
	public void viewProfile();
	
	void updatePassword();

	void approveGymOwner();

	void approveGym();

	public void viewAllGyms();
	
	public void viewAllGymOwners();
	
	
	public void viewPendingGymOwner();
	
	public void viewPendingGym();
	

}
