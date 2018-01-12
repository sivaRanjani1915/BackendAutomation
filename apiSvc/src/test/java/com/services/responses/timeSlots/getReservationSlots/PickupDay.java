package com.services.responses.timeSlots.getReservationSlots;

import java.util.ArrayList;
import java.util.List;

public class PickupDay {

    public Object id;
    public String date;
    public Integer scheduleType;
    public List<ReservationSlot> reservationSlots = new ArrayList<>();

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
    }

    public List<ReservationSlot> getReservationSlots() {
        return reservationSlots;
    }

    public ReservationSlot getReservationSlot(int index) {
        return reservationSlots.get(index);
    }

    public void setReservationSlots(List<ReservationSlot> reservationSlots) {
        this.reservationSlots = reservationSlots;
    }
}
