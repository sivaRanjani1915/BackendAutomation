package com.services.request.navWebApp.submitOrder;

import java.util.ArrayList;
import java.util.List;

public class SubmitOrderBaseRequest {

    public List<SubmitOrder> submitOrderRequest;

    public SubmitOrderBaseRequest(SubmitOrder request) {
        submitOrderRequest = new ArrayList<>();
        submitOrderRequest.add(request);
    }
}
