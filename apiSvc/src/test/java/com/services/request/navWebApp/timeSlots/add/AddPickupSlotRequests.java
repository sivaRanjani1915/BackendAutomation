package com.services.request.navWebApp.timeSlots.add;

import java.util.ArrayList;
import java.util.List;

public class AddPickupSlotRequests {

    public List<AddPickupSlot> addPickupSlotRequests = null;

    public AddPickupSlotRequests(AddPickupSlot request) {
        addPickupSlotRequests = new ArrayList<>();
        addPickupSlotRequests.add(request);
    }

}
