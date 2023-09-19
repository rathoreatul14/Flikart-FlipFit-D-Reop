package com.flipkart.bean;

import java.util.ArrayList;
import java.util.List;

public class Gym {

	private int gymID;
	private String gymName;

	private String registerStatus;
	private String address;
	private int gymOwnerID;
	
	
	public Gym(int gymID, String gymName, String address, String registerStatus,int gymOwnerID) {
		super();
		this.gymID = gymID;
		this.gymName = gymName;
		this.registerStatus = registerStatus;
		this.gymOwnerID = gymOwnerID;
		this.address=address;
	}
	
	
	
	public Gym(int gymID, String gymName, String registerStatus) {
		super();
		this.gymID = gymID;
		this.gymName = gymName;
		this.registerStatus = registerStatus;
	}



	public String getGymName() {
		return gymName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGymName(String gymName) {
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
