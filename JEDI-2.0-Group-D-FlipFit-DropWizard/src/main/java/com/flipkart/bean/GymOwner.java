package com.flipkart.bean;

/**
 * @author msaikalyan.yadav
 */
public class GymOwner {
	private int id;
	private String name;
	private String status;
	private String aadharNumber;
	private String contactNumber;
	private String address;
	private int userId;

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public GymOwner(int id, String name, String status, String aadharNumber, String contactNumber, String address,int userId,String password) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.aadharNumber = aadharNumber;
		this.contactNumber = contactNumber;
		this.address = address;
		this.userId = userId;
		this.password=password;
	}
	public GymOwner(String name, String aadharNumber, String contactNumber, String address,String password) {
		super();
		this.id = id;
		this.name = name;
		this.status = "Not Registered";
		this.aadharNumber = aadharNumber;
		this.contactNumber = contactNumber;
		this.address = address;
		this.password=password;
	}


	public GymOwner() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
