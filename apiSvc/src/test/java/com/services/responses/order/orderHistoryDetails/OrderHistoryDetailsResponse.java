package com.services.responses.order.orderHistoryDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class OrderHistoryDetailsResponse {

    public static OrderHistoryDetailsResponse orderHistoryDetailsResponse;

    public List<OrderHistoryDetail> orderHistoryDetails = new ArrayList<>();
    @JsonProperty
    public String message;

    public List<OrderHistoryDetail> getOrderHistoryDetails() {
        return orderHistoryDetails;
    }

    public OrderHistoryDetail getOrderHistoryDetailsInfo() {
        return orderHistoryDetails.isEmpty() ? null : orderHistoryDetails.get(0);
    }

    public void setOrderHistoryDetails(List<OrderHistoryDetail> orderHistoryDetails) {
        this.orderHistoryDetails = orderHistoryDetails;
    }
}
