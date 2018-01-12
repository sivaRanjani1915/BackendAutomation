package com.services.responses.storeInfo.cache;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CacheResponse {

    public static CacheResponse cacheResponse;

    @JsonProperty("Production")
    private Production Production;

    @JsonProperty("ProdOrStaging")
    private ProdOrStaging ProdOrStaging;
    
    @JsonProperty("Staging")
    private Staging Staging;

    public Production getProduction() {
        return Production;
    }

    public void setProduction(Production production) {
        Production = production;
    }

    public ProdOrStaging getProdOrStaging() {
        return ProdOrStaging;
    }

    public void setProdOrStaging(ProdOrStaging prodOrStaging) {
        ProdOrStaging = prodOrStaging;
    }

    public Staging getStaging() {
        return Staging;
    }

    public void setStaging(Staging staging) {
        Staging = staging;
    }
}
