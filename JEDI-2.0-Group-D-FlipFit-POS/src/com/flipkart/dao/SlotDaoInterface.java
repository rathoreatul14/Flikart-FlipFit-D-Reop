package com.flipkart.dao;

import com.flipkart.bean.Slot;

public interface SlotDaoInterface {
	/**
	 * This method is used to add new slot by gymOnwer
	 * 
	 * @param slot
	 */
	public void addSlot(Slot slot);

	/**
	 * This method is used to delete existing slot by gymOnwer
	 * 
	 * @param slotId
	 */

	public void deleteSlot(int SlotId);

}
