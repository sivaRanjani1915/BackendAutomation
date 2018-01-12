package com.services.request.navWebApp.shipping.add;

import java.util.ArrayList;
import java.util.List;

public class AddShippingBaseRequest {

    public List<AddShippingRequest> addShippingRequest = null;

    public AddShippingBaseRequest(AddShippingRequest request) {
        addShippingRequest = new ArrayList<>();
        addShippingRequest.add(request);
    }

}
