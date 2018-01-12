package com.services.responses.order.editableOrders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EditableOrder {


    @JsonProperty("id")
    private String id;

    @JsonProperty("totalNumberOfItems")
    private int totalNumberOfItems;

    @JsonProperty("submittedDate")
    private String submittedDate;

    @JsonProperty("orderTotal")
    private double orderTotal;

    @JsonProperty("orderStatus")
    private String orderStatus;

    @JsonProperty("pickupSlot")
    private PickupSlot pickupSlot;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    public void setTotalNumberOfItems(int totalNumberOfItems) {
        this.totalNumberOfItems = totalNumberOfItems;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PickupSlot getPickupSlot() {
        return pickupSlot;
    }

    public void setPickupSlot(PickupSlot pickupSlot) {
        this.pickupSlot = pickupSlot;
    }
}
