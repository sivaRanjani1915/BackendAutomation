package com.services.responses.timeSlots.getReservationSlots;

import java.util.ArrayList;
import java.util.List;

public class Schedule {

    public String id;
    public List<PickupDay> pickupDays = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<PickupDay> getPickupDays() {
        return pickupDays;
    }

    public PickupDay getPickupDay(int index) {
        return pickupDays.get(index);
    }

    public void setPickupDays(List<PickupDay> pickupDays) {
        this.pickupDays = pickupDays;
    }
}
