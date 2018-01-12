package com.services.responses.timeSlots.getReservationSlots;

import java.util.ArrayList;
import java.util.List;

public class GetSlotReservationResponse {

    public static GetSlotReservationResponse getSlotReservationResponse;

    public List<Schedule> schedules = new ArrayList<>();
    public Linked linked;

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public Schedule getSchedule(int index) {
        return schedules.get(index);
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Linked getLinked() {
        return linked;
    }

    public void setLinked(Linked linked) {
        this.linked = linked;
    }
}
