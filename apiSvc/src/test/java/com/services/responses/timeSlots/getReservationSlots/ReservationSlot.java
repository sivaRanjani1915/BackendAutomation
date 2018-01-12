package com.services.responses.timeSlots.getReservationSlots;

public class ReservationSlot {

    public String id;
    public Object activeSlotId;
    public String startTime;
    public String endTime;
    public String slotTimeZone;
    public Integer maxActiveSlotsCount;
    public Integer activeSlotsCount;
    public Boolean isAvailable;
    public String reservationSlotTransactionId;
    public String activeSlotTransactionId;
    public Object mustOrderBy;
    public Object mustHoldBy;
    public Boolean isHoldable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getActiveSlotId() {
        return activeSlotId;
    }

    public void setActiveSlotId(Object activeSlotId) {
        this.activeSlotId = activeSlotId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSlotTimeZone() {
        return slotTimeZone;
    }

    public void setSlotTimeZone(String slotTimeZone) {
        this.slotTimeZone = slotTimeZone;
    }

    public Integer getMaxActiveSlotsCount() {
        return maxActiveSlotsCount;
    }

    public void setMaxActiveSlotsCount(Integer maxActiveSlotsCount) {
        this.maxActiveSlotsCount = maxActiveSlotsCount;
    }

    public Integer getActiveSlotsCount() {
        return activeSlotsCount;
    }

    public void setActiveSlotsCount(Integer activeSlotsCount) {
        this.activeSlotsCount = activeSlotsCount;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getReservationSlotTransactionId() {
        return reservationSlotTransactionId;
    }

    public void setReservationSlotTransactionId(String reservationSlotTransactionId) {
        this.reservationSlotTransactionId = reservationSlotTransactionId;
    }

    public String getActiveSlotTransactionId() {
        return activeSlotTransactionId;
    }

    public void setActiveSlotTransactionId(String activeSlotTransactionId) {
        this.activeSlotTransactionId = activeSlotTransactionId;
    }

    public Object getMustOrderBy() {
        return mustOrderBy;
    }

    public void setMustOrderBy(Object mustOrderBy) {
        this.mustOrderBy = mustOrderBy;
    }

    public Object getMustHoldBy() {
        return mustHoldBy;
    }

    public void setMustHoldBy(Object mustHoldBy) {
        this.mustHoldBy = mustHoldBy;
    }

    public Boolean getIsHoldable() {
        return isHoldable;
    }

    public void setIsHoldable(Boolean isHoldable) {
        this.isHoldable = isHoldable;
    }
}
