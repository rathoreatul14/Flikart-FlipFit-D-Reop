/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.Slot;

/**
 * @author arjit.giri
 */
public interface SlotServicesInterface {

	// This method is used to add a new slot
	//@params gymOwnerId
	public void addSlot(int gymOwnerId);

	// This method is used to delete a slot
	// @params slotId
	public void deleteSlot(int slotId);
	

}
