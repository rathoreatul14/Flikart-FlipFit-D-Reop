package com.flipkart.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Customer {

	private int customerID;
	@JsonProperty("name")
	private String name;
	@JsonProperty("address")
	private String address;

	private int userID;
	@JsonProperty("mobile")
	private String mobile;
	@JsonProperty("email")
	private String email;
	@JsonProperty("password")
	private String password;


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Customer(int customerID, String name, String address) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.address = address;
	}



	public Customer(int customerID, String name, String address, int userID, String mobile, String email, String password) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.address = address;
		this.userID = userID;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}

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

	public String getMobile() {
		// TODO Auto-generated method stub
		return mobile;
	}

}
