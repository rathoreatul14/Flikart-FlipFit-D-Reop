package com.flipkart.bean;

import java.util.ArrayList;
import java.util.List;

public class Gym {

	private int gymID;
	private int gymName;
	private List<Integer> slotIDs = new ArrayList();
	private String registerStatus;
	private int gymOwnerID;
	
	
	public Gym(int gymID, int gymName, List<Integer> slotIDs, String registerStatus, int gymOwnerID) {
		super();
		this.gymID = gymID;
		this.gymName = gymName;
		this.slotIDs = slotIDs;
		this.registerStatus = registerStatus;
		this.gymOwnerID = gymOwnerID;
	}
	
	
	
	public int getGymName() {
		return gymName;
	}

	public void setGymName(int gymName) {
		this.gymName = gymName;
	}

	public int getGymOwnerID() {
		return gymOwnerID;
	}

	public void setGymOwnerID(int gymOwnerID) {
		this.gymOwnerID = gymOwnerID;
	}

	

	public int getGymID() {
		return gymID;
	}

	public void setGymID(int gymID) {
		this.gymID = gymID;
	}

	public List<Integer> getSlotIDs() {
		return slotIDs;
	}

	public void setSlotIDs(List<Integer> slotIDs) {
		this.slotIDs = slotIDs;
	}

	public String getRegisterStatus() {
		return registerStatus;
	}

	public void setRegisterStatus(String registerStatus) {
		this.registerStatus = registerStatus;
	}

	public int getGymOwner() {
		return gymOwnerID;
	}

	public void setGymOwner(int gymOwnerID) {
		this.gymOwnerID = gymOwnerID;
	}

}
