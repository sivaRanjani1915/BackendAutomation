package com.services.request.navWebApp.timeSlots.remove;

import java.util.ArrayList;
import java.util.List;

public class RemovePickupSlotBaseRequest {

    public List<RemovePickupSlotRequest> removePickupSlotRequests;

    public RemovePickupSlotBaseRequest(RemovePickupSlotRequest request) {
        removePickupSlotRequests = new ArrayList<>();
        removePickupSlotRequests.add(request);
    }

}
