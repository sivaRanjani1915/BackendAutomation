package com.services.request.order.setPickupSlot;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class SetPickupSlotRequests {

    @JsonProperty("setpickupslot")
    private List<Setpickupslot> setpickupslot = new ArrayList<Setpickupslot>();

    public SetPickupSlotRequests(Setpickupslot setpickup) {
        setpickupslot = new ArrayList<>();
        setpickupslot.add(setpickup);
    }

    public List<Setpickupslot> getSetpickupslot() {
        return setpickupslot;
    }

    public void setSetpickupslot(List<Setpickupslot> setpickupslot) {
        this.setpickupslot = setpickupslot;
    }
}
