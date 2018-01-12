package com.services.request.pricing.details;

import java.util.ArrayList;
import java.util.List;

public class PricingBaseRequest {

    public List<PricingRequest> simplePricingRequests;

    public PricingBaseRequest(PricingRequest request) {
        simplePricingRequests = new ArrayList<>();
        simplePricingRequests.add(request);
    }


}
