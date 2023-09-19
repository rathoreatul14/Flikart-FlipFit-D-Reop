/**
 * 
 */
package com.flipkart.service;

import com.flipkart.exception.AlreadyApprovedGymException;
import com.flipkart.exception.WrongGymIdException;
import com.flipkart.bean.*;
import java.util.ArrayList;

/**
 * @author arjit.giri
 */
public interface AdminServicesInterface {



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
	 */

	public ArrayList<Gym> viewAllGyms();

	/**
	 * This is to show all the Gym Owners
	 * 
	 */

	public ArrayList<GymOwner> viewAllGymOwners();

	/**
	 * This is to show pending Gym Owner
	 */

	public ArrayList<GymOwner> viewPendingGymOwner();

	/**
	 * This is to show all the pending Gym
	 */

	public ArrayList<Gym> viewPendingGym();

}
