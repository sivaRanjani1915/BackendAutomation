package com.services.responses.order.orderHistorySummaries;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PickupSlot {

    @JsonProperty("slotType")
    private String slotType;

    @JsonProperty("pickupDate")
    private String pickupDate;

    @JsonProperty("pickupStartTime")
    private String pickupStartTime;

    @JsonProperty("pickupEndTime")
    private String pickupEndTime;

    @JsonProperty("slotTimeZone")
    private String slotTimeZone;

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
}
