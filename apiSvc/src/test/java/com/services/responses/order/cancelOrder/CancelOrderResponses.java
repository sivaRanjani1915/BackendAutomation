package com.services.responses.order.cancelOrder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class CancelOrderResponses {

    public static CancelOrderResponses cancelOrderResponse;

    @JsonProperty("cancelOrderResponses")
    public List<CancelOrderResponseDetail> cancelOrderResponses = new ArrayList<>();

    public List<CancelOrderResponseDetail> getCancelOrderResponses() {
        return cancelOrderResponses;
    }

    public CancelOrderResponseDetail getCancelOrderResponseInfo() {
        return cancelOrderResponses.isEmpty() ? null : cancelOrderResponses.get(0);
    }

    public void setCancelOrderResponses(List<CancelOrderResponseDetail> cancelOrderResponses) {
        this.cancelOrderResponses = cancelOrderResponses;
    }
}
