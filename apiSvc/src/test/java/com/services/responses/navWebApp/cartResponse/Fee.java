package com.services.responses.navWebApp.cartResponse;

public class Fee {

    public String id;
    public Integer feeId;
    public String addedTimeStamp;
    public String upc;
    public String upcType;
    public String productId;
    public String feeName;
    public String feeDescription;
    public Float feeQuantity;
    public Integer unitId;
    public String imageUrl;
    public Prices__ prices;
    public com.services.responses.navWebApp.cartResponse.PriceRules priceRules;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getFeeId() {
        return feeId;
    }

    public void setFeeId(Integer feeId) {
        this.feeId = feeId;
    }

    public String getAddedTimeStamp() {
        return addedTimeStamp;
    }

    public void setAddedTimeStamp(String addedTimeStamp) {
        this.addedTimeStamp = addedTimeStamp;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getUpcType() {
        return upcType;
    }

    public void setUpcType(String upcType) {
        this.upcType = upcType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public String getFeeDescription() {
        return feeDescription;
    }

    public void setFeeDescription(String feeDescription) {
        this.feeDescription = feeDescription;
    }

    public Float getFeeQuantity() {
        return feeQuantity;
    }

    public void setFeeQuantity(Float feeQuantity) {
        this.feeQuantity = feeQuantity;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Prices__ getPrices() {
        return prices;
    }

    public void setPrices(Prices__ prices) {
        this.prices = prices;
    }

    public com.services.responses.navWebApp.cartResponse.PriceRules getPriceRules() {
        return priceRules;
    }

    public void setPriceRules(com.services.responses.navWebApp.cartResponse.PriceRules priceRules) {
        this.priceRules = priceRules;
    }
}
