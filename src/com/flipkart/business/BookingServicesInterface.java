/**
 * 
 */
package com.flipkart.business;

import java.util.HashMap;

import com.flipkart.bean.Booking;

/**
 * @author arjit.giri
 */
public interface BookingServicesInterface {

	void bookSlot(int userId, int slotId, HashMap<Integer, Booking> hm);

	void cancelSlot(int bookingId, HashMap<Integer, Booking> hm);

}
