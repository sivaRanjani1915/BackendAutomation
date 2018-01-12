package com.services.responses.order.orderHistoryDetails;

public class Item {

    public String id;
    public String upcType;
    public String imageUrl;
    public String description;
    public String regularPrice;
    public String salePrice;
    public Integer saleIndicator;
    public String savings;
    public String priceValidThrough;
    public String priceTypeDisplayText;
    public String regularPriceDisplayText;
    public String savingsDisplayText;
    public String priceGoodThroughDisplayText;
    public Float quantity;
    public String uom;
    public Boolean sellByAltUom;
    public String altUomType;
    public String altUom;
    public Float altUomWeightEach;
    public String altUomWeightEachText;
    public String altUnitPrice;
    public String altSellingDisplayText;
    public Integer statusCodeId;
    public String statusCodeName;
    public Integer fGroupTypeId;
    public Boolean isAvailable;
    public Boolean isAlcohol;
    public Boolean hasDeposit;
    public String depositEachAmount;
    public String totalItemDeposit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpcType() {
        return upcType;
    }

    public void setUpcType(String upcType) {
        this.upcType = upcType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(String regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getSaleIndicator() {
        return saleIndicator;
    }

    public void setSaleIndicator(Integer saleIndicator) {
        this.saleIndicator = saleIndicator;
    }

    public String getSavings() {
        return savings;
    }

    public void setSavings(String savings) {
        this.savings = savings;
    }

    public String getPriceValidThrough() {
        return priceValidThrough;
    }

    public void setPriceValidThrough(String priceValidThrough) {
        this.priceValidThrough = priceValidThrough;
    }

    public String getPriceTypeDisplayText() {
        return priceTypeDisplayText;
    }

    public void setPriceTypeDisplayText(String priceTypeDisplayText) {
        this.priceTypeDisplayText = priceTypeDisplayText;
    }

    public String getRegularPriceDisplayText() {
        return regularPriceDisplayText;
    }

    public void setRegularPriceDisplayText(String regularPriceDisplayText) {
        this.regularPriceDisplayText = regularPriceDisplayText;
    }

    public String getSavingsDisplayText() {
        return savingsDisplayText;
    }

    public void setSavingsDisplayText(String savingsDisplayText) {
        this.savingsDisplayText = savingsDisplayText;
    }

    public String getPriceGoodThroughDisplayText() {
        return priceGoodThroughDisplayText;
    }

    public void setPriceGoodThroughDisplayText(String priceGoodThroughDisplayText) {
        this.priceGoodThroughDisplayText = priceGoodThroughDisplayText;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public Boolean getSellByAltUom() {
        return sellByAltUom;
    }

    public void setSellByAltUom(Boolean sellByAltUom) {
        this.sellByAltUom = sellByAltUom;
    }

    public String getAltUomType() {
        return altUomType;
    }

    public void setAltUomType(String altUomType) {
        this.altUomType = altUomType;
    }

    public String getAltUnitPrice() {
        return altUnitPrice;
    }

    public void setAltUnitPrice(String altUnitPrice) {
        this.altUnitPrice = altUnitPrice;
    }

    public String getAltSellingDisplayText() {
        return altSellingDisplayText;
    }

    public void setAltSellingDisplayText(String altSellingDisplayText) {
        this.altSellingDisplayText = altSellingDisplayText;
    }

    public Integer getStatusCodeId() {
        return statusCodeId;
    }

    public String getAltUom() {
        return altUom;
    }

    public void setAltUom(String altUom) {
        this.altUom = altUom;
    }

    public Float getAltUomWeightEach() {
        return altUomWeightEach;
    }

    public void setAltUomWeightEach(Float altUomWeightEach) {
        this.altUomWeightEach = altUomWeightEach;
    }

    public String getAltUomWeightEachText() {
        return altUomWeightEachText;
    }

    public void setAltUomWeightEachText(String altUomWeightEachText) {
        this.altUomWeightEachText = altUomWeightEachText;
    }


    public void setStatusCodeId(Integer statusCodeId) {
        this.statusCodeId = statusCodeId;
    }

    public String getStatusCodeName() {
        return statusCodeName;
    }

    public void setStatusCodeName(String statusCodeName) {
        this.statusCodeName = statusCodeName;
    }

    public Integer getfGroupTypeId() {
        return fGroupTypeId;
    }

    public void setfGroupTypeId(Integer fGroupTypeId) {
        this.fGroupTypeId = fGroupTypeId;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Boolean getAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(Boolean alcohol) {
        isAlcohol = alcohol;
    }

    public Boolean getHasDeposit() {
        return hasDeposit;
    }

    public void setHasDeposit(Boolean hasDeposit) {
        this.hasDeposit = hasDeposit;
    }
}
