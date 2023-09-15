package com.flipkart.bean;

public class Customer {
	
	
	private int customerID;
	
	
	public Customer(int customerID, String name, String address) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.address = address;
	}

	private String name;
	private String address;
	
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
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

	
}
