package com.flipkart.bean;

import jdk.jfr.Timestamp;

public class Slot {
    private int slotId;
    private int gymId;
    private Timestamp startTime;
    private int numberOfSeats;
    private int availableSeats;

    public Slot(int slotId, int gymId, Timestamp startTime, int numberOfSeats, int availableSeats) {
        this.slotId = slotId;
        this.gymId = gymId;
        this.startTime = startTime;
        this.numberOfSeats = numberOfSeats;
        this.availableSeats = availableSeats;
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

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
