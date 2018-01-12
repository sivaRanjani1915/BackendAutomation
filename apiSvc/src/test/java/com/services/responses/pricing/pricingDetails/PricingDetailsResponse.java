package com.services.responses.pricing.pricingDetails;

import java.util.ArrayList;
import java.util.List;

public class PricingDetailsResponse {

    public List<PricingDetail> pricingDetails = new ArrayList<>();

    public List<PricingDetail> getPricingDetails() {
        return pricingDetails;
    }

    public PricingDetail getPricingDetail(int index) {
        return pricingDetails.get(index);
    }

    public void setPricingDetails(List<PricingDetail> pricingDetails) {
        this.pricingDetails = pricingDetails;
    }
}
