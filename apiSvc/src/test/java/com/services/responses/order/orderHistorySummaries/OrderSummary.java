package com.services.responses.order.orderHistorySummaries;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class OrderSummary {

    @JsonProperty("id")
    private String id;

    @JsonProperty("totalNumberOfItems")
    private Integer totalNumberOfItems;

    @JsonProperty("submittedDate")
    private String submittedDate;

    @JsonProperty("orderTotal")
    private Double orderTotal;

    @JsonProperty("orderStatus")
    private String orderStatus;

    @JsonProperty("isActive")
    private Boolean isActive;

    @JsonProperty("isEditable")
    private Boolean isEditable;

    @JsonProperty("isHomeDelivery")
    private Boolean isHomeDelivery;

    @JsonProperty("pickupSlot")
    private PickupSlot pickupSlot;

    @JsonProperty("isSameDay")
    private Boolean isSameDay;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonIgnore
    private String orderTotalinDollar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    public void setTotalNumberOfItems(Integer totalNumberOfItems) {
        this.totalNumberOfItems = totalNumberOfItems;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }

    public Double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setEditable(Boolean editable) {
        isEditable = editable;
    }

    public Boolean getHomeDelivery() {
        return isHomeDelivery;
    }

    public void setHomeDelivery(Boolean homeDelivery) {
        isHomeDelivery = homeDelivery;
    }

    public PickupSlot getPickupSlot() {
        return pickupSlot;
    }

    public void setPickupSlot(PickupSlot pickupSlot) {
        this.pickupSlot = pickupSlot;
    }

    public Boolean getSameDay() {
        return isSameDay;
    }

    public void setSameDay(Boolean sameDay) {
        isSameDay = sameDay;
    }
}
