package com.flipkart.business;

import java.util.HashMap;

import com.flipkart.bean.Booking;

public class BookingServices implements BookingServicesInterface{

	// To book a slot 
	@Override
	public void bookSlot(int userId,int slotId,HashMap<Integer,Booking>hm) {
		// TODO Auto-generated method stub
		int random=(int)(Math.random()*1000);
		Booking booking = new Booking(random,userId,slotId,"Booked");
		hm.put(random,booking);
		System.out.println("Booking successful with Id: "+random);
	}

	// To cancel a booked slot
	@Override
	public void cancelSlot(int bookingId,HashMap<Integer,Booking>hm) {
		// TODO Auto-generated method stub
		hm.remove(bookingId);
		System.out.println("Booking deleted successfully with Id: "+bookingId);
	}
	
}
