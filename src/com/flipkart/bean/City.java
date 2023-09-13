package com.flipkart.bean;

import java.util.ArrayList;
import java.util.List;

public class City {
	private int cityID;
	private String cityName;
	private List<Integer> gymIDs = new ArrayList<>();

	public int getCityID() {
		return cityID;
	}

	public void setCityID(int cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public List<Integer> getGymIDs() {
		return gymIDs;
	}

	public void setGymIDs(List<Integer> gymIDs) {
		this.gymIDs = gymIDs;
	}

}
