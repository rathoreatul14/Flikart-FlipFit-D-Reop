/**
 * @author msaikalyan.yadav
 */
package com.flipkart.dao;

import java.util.List;
import java.util.Scanner;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.bean.User;

/**
 * 
 */
public interface GymOwnerDaoInterface {

	/**
 	* This method is used to get Gymowner details from userId
  	*@param userId
   	*@return gymOwner details 
 	*/
	public GymOwner getGymOwnerFromUserId(int userId);
	/**
 	* This method is used to register Gymowner
  	*@param user
   	*@param owner
 	*/

	public int registerGymOwner(GymOwner owner, User user);
	/**
 	* This method is used to view Gymowner profile
   	*@param ownerId
 	*/
	
	public GymOwner viewProfile(int ownerId);
	/**
 	* This method is used to update Gymowner profile
   	*@param owner
 	*/

	public void updateProfile(GymOwner owner);
	/**
 	* This method is used to view Gymowner profile
   	*@param owner
    	*@return List of all gyms of a particular gymOwner
 	*/

	public List<Gym> viewGyms(GymOwner owner);

	/**
 	* This method is used to register Gym by a GymOwner
   	*@param owner
    	*@param Scanner 
    	*@return GymId after Registration is successfully
 	*/

	public int registerGym(Gym gym);
	
	
}
