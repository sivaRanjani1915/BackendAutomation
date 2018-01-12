package com.services.request.navWebApp.timeSlots.remove;

public class RemovePickupSlotRequest {

    public String id;
    public String cartId;

    public RemovePickupSlotRequest(String id, String cartId) {
        this.id = id;
        this.cartId = cartId;
    }
}
