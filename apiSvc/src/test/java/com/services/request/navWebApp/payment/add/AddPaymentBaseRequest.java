package com.services.request.navWebApp.payment.add;

import java.util.ArrayList;
import java.util.List;

public class AddPaymentBaseRequest {

    public List<AddPaymentRequest> addPaymentRequest = null;

    public AddPaymentBaseRequest(AddPaymentRequest request) {
        addPaymentRequest = new ArrayList<>();
        addPaymentRequest.add(request);
    }

}
