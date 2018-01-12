package com.services.request.navWebApp.timeSlots.add;

public class PickupSlot {

    public String slotType;
    public String pickupDate;
    public String pickupStartTime;
    public String pickupEntTime;
    public String slotTimeZone;

    public PickupSlot(String pickupDate, String pickupStartTime) {
        this.slotType = null;
        this.pickupDate = pickupDate;
        this.pickupStartTime = pickupStartTime;
        this.pickupEntTime = null;
        this.slotTimeZone = null;
    }

}
