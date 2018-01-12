package com.services.responses.timeSlots.addTimeSlot;

public class PickupSlot {

    public Integer slotType;
    public String pickupDate;
    public String pickupStartTime;
    public Object pickupEndTime;
    public String slotTimeZone;

    public Integer getSlotType() {
        return slotType;
    }

    public void setSlotType(Integer slotType) {
        this.slotType = slotType;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getPickupStartTime() {
        return pickupStartTime;
    }

    public void setPickupStartTime(String pickupStartTime) {
        this.pickupStartTime = pickupStartTime;
    }

    public Object getPickupEndTime() {
        return pickupEndTime;
    }

    public void setPickupEndTime(Object pickupEndTime) {
        this.pickupEndTime = pickupEndTime;
    }

    public String getSlotTimeZone() {
        return slotTimeZone;
    }

    public void setSlotTimeZone(String slotTimeZone) {
        this.slotTimeZone = slotTimeZone;
    }
}
