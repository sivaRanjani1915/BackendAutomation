package com.services.responses.order.orderHistoryDetails;

public class PickupSlot {

    public Integer slotType;
    public String pickupDate;
    public String pickupStartTime;
    public String pickupEndTime;
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

    public String getPickupEndTime() {
        return pickupEndTime;
    }

    public void setPickupEndTime(String pickupEndTime) {
        this.pickupEndTime = pickupEndTime;
    }

    public String getSlotTimeZone() {
        return slotTimeZone;
    }

    public void setSlotTimeZone(String slotTimeZone) {
        this.slotTimeZone = slotTimeZone;
    }
}
