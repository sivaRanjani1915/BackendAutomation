package com.services.request.navWebApp.customer.remove;

import java.util.ArrayList;
import java.util.List;

public class RemoveCustomerBaseRequest {


    public List<RemoveCustomerRequest> removeCustomerRequest;

    public RemoveCustomerBaseRequest(RemoveCustomerRequest request) {
        removeCustomerRequest = new ArrayList<>();
        removeCustomerRequest.add(request);
    }

}
