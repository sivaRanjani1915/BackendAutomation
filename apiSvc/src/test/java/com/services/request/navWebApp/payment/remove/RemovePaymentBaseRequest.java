package com.services.request.navWebApp.payment.remove;

import java.util.ArrayList;
import java.util.List;

public class RemovePaymentBaseRequest {


    public List<RemovePaymentRequest> removePaymentRequests;

    public RemovePaymentBaseRequest(RemovePaymentRequest request) {
        removePaymentRequests = new ArrayList<>();
        removePaymentRequests.add(request);
    }

}
