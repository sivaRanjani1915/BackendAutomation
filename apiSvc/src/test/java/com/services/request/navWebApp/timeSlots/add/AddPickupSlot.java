package com.services.request.navWebApp.timeSlots.add;

public class AddPickupSlot {

    public String id;
    public String cartId;
    public PickupSlot pickupSlot;
    public Integer pickupLocation;
    public String vehicleDescription;
    public String alternatePickupPerson;
    public Boolean placeHold;
    public Boolean inCheckOut;


    public AddPickupSlot(String id, String cartId, PickupSlot pickupSlot, Boolean placeHold) {
        this.id = id;
        this.cartId = cartId;
        this.pickupSlot = pickupSlot;
        this.pickupLocation = 0;
        this.vehicleDescription = null;
        this.alternatePickupPerson = null;
        this.placeHold = placeHold;
        this.inCheckOut = false;
    }

}
