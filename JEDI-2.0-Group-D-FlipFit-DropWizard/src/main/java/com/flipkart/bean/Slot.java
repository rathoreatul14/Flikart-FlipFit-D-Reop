package com.flipkart.bean;

import java.sql.Time;
import java.time.LocalTime;

import jdk.jfr.Timestamp;

public class Slot {
    private int slotId;
    private int gymId;
    private LocalTime slotTime;
    private int numberOfSeats;
    private String slotDate;
    private int capacity;

    public Slot(int slotId, int gymId, LocalTime slotTime, int numberOfSeats, String slotDate, int capacity) {
        this.slotId = slotId;
        this.gymId = gymId;
        this.slotTime = slotTime;
        this.slotDate =slotDate;
        this.numberOfSeats = numberOfSeats;
        this.capacity = capacity;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }



	public LocalTime getSlotTime() {
		return slotTime;
	}

	public void setSlotTime(LocalTime slotTime) {
		this.slotTime = slotTime;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getSlotDate() {
		return slotDate;
	}

	public void setSlotDate(String slotDate) {
		this.slotDate = slotDate;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Slot() {
		super();
	}


}
