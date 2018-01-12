package com.services.responses.order.activeOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActiveOrderInfo {


    @JsonProperty("id")
    private String id;

    @JsonProperty("hasRecentOrders")
    private Boolean hasRecentOrders;

    @JsonProperty("activeOrder")
    private ActiveOrder activeOrder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getHasRecentOrders() {
        return hasRecentOrders;
    }

    public void setHasRecentOrders(Boolean hasRecentOrders) {
        this.hasRecentOrders = hasRecentOrders;
    }

    public ActiveOrder getActiveOrder() {
        return activeOrder;
    }

    public void setActiveOrder(ActiveOrder activeOrder) {
        this.activeOrder = activeOrder;
    }
}
