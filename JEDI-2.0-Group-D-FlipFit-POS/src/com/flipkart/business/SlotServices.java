/**
 * 
 */
package com.flipkart.business;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

import com.flipkart.bean.Slot;
import com.flipkart.dao.SlotDao;
import com.flipkart.dao.SlotDaoInterface;

/**
 * 
 */

public class SlotServices implements SlotServicesInterface {
	Scanner sc = new Scanner(System.in);
	SlotDaoInterface slotDao = new SlotDao();
	@Override
	public void addSlot(int gymId) {
		// TODO Auto-generated method stub
		System.out.println("Enter Slot Details ");
		System.out.println("Enter SlotTime in this format (hh:mm:ss)");
		String time=sc.next();   
		LocalTime lt=LocalTime.parse(time); 
		System.out.println("Enter Slot Date");
		String date =sc.next();
		System.out.println("Capacity");
		int capacity =sc.nextInt();
		Slot slot=new Slot(1,gymId,lt,0,date,capacity);
		 
		slotDao.addSlot(slot);
	}

	@Override
	public void deleteSlot(int slotId) {
		// TODO Auto-generated method stub
		slotDao.deleteSlot(slotId);

	}

}