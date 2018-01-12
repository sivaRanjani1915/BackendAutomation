package com.services.responses.order.activeOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActiveOrder {

    @JsonProperty("id")
    private String id;

    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("submittedDate")
    private String submittedDate;

    @JsonProperty("isEditable")
    private Boolean isEditable;

    @JsonProperty("pickupSlot")
    private PickupSlot pickupSlot;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setEditable(Boolean editable) {
        isEditable = editable;
    }

    public PickupSlot getPickupSlot() {
        return pickupSlot;
    }

    public void setPickupSlot(PickupSlot pickupSlot) {
        this.pickupSlot = pickupSlot;
    }
}
