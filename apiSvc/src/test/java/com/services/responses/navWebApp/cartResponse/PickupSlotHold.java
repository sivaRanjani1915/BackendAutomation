package com.services.responses.navWebApp.cartResponse;

public class PickupSlotHold {

    public String slotType;
    public String pickupDate;
    public String pickupStartTime;
    public String pickupEndTime;
    public String slotTimeZone;
    public String expirationTime;
    public String holdCreated;

    public String getSlotType() {
        return slotType;
    }

    public void setSlotType(String slotType) {
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

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public String getHoldCreated() {
        return holdCreated;
    }

    public void setHoldCreated(String holdCreated) {
        this.holdCreated = holdCreated;
    }
}
