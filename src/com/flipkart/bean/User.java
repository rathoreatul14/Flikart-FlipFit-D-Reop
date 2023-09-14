package com.flipkart.bean;

public class User {
	
	
	private int userID;
	private String name;
	private String address;
	private String email;
	private String role;
	private String password;
	
	
	public User(int userID, String name, String address, String email, String role, String password) {
		super();
		this.userID = userID;
		this.name = name;
		this.address = address;
		this.email = email;
		this.role = role;
		this.password = password;
	}

	

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
