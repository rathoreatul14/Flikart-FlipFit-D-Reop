package com.flipkart.bean;

public class WaitList {
    private int userId;
    private int gymId;
    private int slotId;

    public WaitList(int userId, int gymId, int slotId) {
        this.userId = userId;
        this.gymId = gymId;
        this.slotId = slotId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }
}
