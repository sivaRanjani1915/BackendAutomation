package com.services.responses.nav.tiers;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Linked {

    @JsonProperty("productTemplates")
    private List<ProductTemplate> productTemplates = new ArrayList<ProductTemplate>();

    @JsonProperty("limitedAssortmentStoreIds")
    private List<String> limitedAssortmentStoreIds = new ArrayList<String>();

    @JsonProperty("productTemplates")
    public List<ProductTemplate> getProductTemplates() {
        return productTemplates;
    }

    @JsonProperty("productTemplates")
    public void setProductTemplates(List<ProductTemplate> productTemplates) {
        this.productTemplates = productTemplates;
    }

    @JsonProperty("limitedAssortmentStoreIds")
    public List<String> getLimitedAssortmentStoreIds() {
        return limitedAssortmentStoreIds;
    }

    @JsonProperty("limitedAssortmentStoreIds")
    public void setLimitedAssortmentStoreIds(List<String> limitedAssortmentStoreIds) {
        this.limitedAssortmentStoreIds = limitedAssortmentStoreIds;
    }


}
