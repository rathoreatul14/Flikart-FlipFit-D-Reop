/**
 * 
 */
package com.flipkart.business;

/**
 * @author arjit.giri
 */
public interface AdminServicesInterface {
	
	public void viewProfile();
	
	public void updateProfile();
	
	public boolean approveGymOwner(String id);
	
	public boolean approveGym(String id);
	
	public void viewPendingGymOwner();
	
	public void viewPendingGym();
	
	public void viewAllGyms();
	
	public void viewAllGymOwners();

}
