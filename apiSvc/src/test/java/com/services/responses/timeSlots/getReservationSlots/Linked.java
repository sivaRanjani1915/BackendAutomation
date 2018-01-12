package com.services.responses.timeSlots.getReservationSlots;

import java.util.ArrayList;
import java.util.List;

public class Linked {

    public List<SlotFees> slotFees = new ArrayList<>();

    public List<SlotFees> getSlotFees() {
        return slotFees;
    }

    public SlotFees getSlotFee(int index) {
        return slotFees.get(index);
    }

    public void setSlotFees(List<SlotFees> slotFees) {
        this.slotFees = slotFees;
    }
}
