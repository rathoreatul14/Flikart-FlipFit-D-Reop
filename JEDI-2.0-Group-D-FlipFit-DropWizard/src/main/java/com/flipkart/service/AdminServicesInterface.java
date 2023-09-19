/**
 * 
 */
package com.flipkart.service;

import com.flipkart.bean.Gym;
import com.flipkart.exception.AlreadyApprovedGymException;
import com.flipkart.exception.WrongGymIdException;

import java.util.ArrayList;

/**
 * @author arjit.giri
 */
public interface AdminServicesInterface {
	/**
	 * This method is used to fetch the Admin Profile
	 */

	public void viewProfile();

	/**
	 * This is used to update the password of the Admin
	 */

	public void updatePassword();

	/**
	 * This is used to approve the Gym Owner request
	 * 
	 * @throws WrongGymOwnerIdException
	 * @throws AlreadyApprovedGymOwnerException
	 */

	public void approveGymOwner();

	/**
	 * This is used to approve the Gym request made by Gym Owner
	 * 
	 * @throws WrongGymIdException
	 * @throws AlreadyApprovedGymException
	 */

	public void approveGym();

	/**
	 * This is to show all the available Gym
	 *
	 * @return
	 */

	public ArrayList<Gym> viewAllGyms();

	/**
	 * This is to show all the Gym Owners
	 * 
	 */

	public void viewAllGymOwners();

	/**
	 * This is to show pending Gym Owner
	 */

	public void viewPendingGymOwner();

	/**
	 * This is to show all the pending Gym
	 */

	public void viewPendingGym();

}
