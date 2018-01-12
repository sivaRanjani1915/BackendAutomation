package com.services.request.pricing.details;

import java.util.List;

public class PricingRequest {

    public String id;
    public String storeId;
    public List<String> upcs;


    public PricingRequest(String id, String storeId, List<String> upcs) {
        this.id = id;
        this.storeId = storeId;
        this.upcs = upcs;
    }
}
