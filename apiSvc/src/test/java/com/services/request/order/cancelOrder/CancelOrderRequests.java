package com.services.request.order.cancelOrder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class CancelOrderRequests {

    @JsonProperty("cancelOrderRequests")
    public List<CancelOrderRequestDetail> cancelOrderRequests = new ArrayList<>();

    public CancelOrderRequests(CancelOrderRequestDetail cancelOrderRequestDetail) {
        cancelOrderRequests = new ArrayList<>();
        cancelOrderRequests.add(cancelOrderRequestDetail);
    }

}
