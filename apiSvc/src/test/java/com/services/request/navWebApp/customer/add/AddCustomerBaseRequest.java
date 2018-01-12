package com.services.request.navWebApp.customer.add;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerBaseRequest {

    public List<AddCustomerRequest> addCustomerRequest;

    public AddCustomerBaseRequest(AddCustomerRequest request) {
        addCustomerRequest = new ArrayList<>();
        addCustomerRequest.add(request);
    }
}
