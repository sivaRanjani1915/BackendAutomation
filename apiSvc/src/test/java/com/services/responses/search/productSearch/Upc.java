package com.services.responses.search.productSearch;

import java.util.ArrayList;
import java.util.List;

public class Upc {

    public String id;
    public Float score;
    public Integer storeId;
    public String upc;
    public String upc_type;
    public String productId;
    public String shortName;
    public String longName;
    public String description;
    public String uom;
    public String sellingSize;
    public Boolean isRandomWeight;
    public List<Image> images = new ArrayList<>();
    public String brandName;
    public Boolean brandIsMeijer;
    public Boolean isActive;
    public Boolean isSellable;
    public Boolean isKilled;
    public Boolean isClickAndCollect;
    public Boolean isShipToHome;
    public Boolean isQuickShop;
    public Boolean isAlcohol;
    public Boolean hasDeposit;
    public Boolean isTobacco;
    public Boolean isAgeRestricted;
    public Boolean isHazardousMaterial;
    public Boolean isPreparedItem;
    public Boolean isOrganic;
    public Boolean isLocal;
    public Boolean isPrimaryUPC;
    public List<Integer> tier1Ids = new ArrayList<>();
    public List<Integer> tier2Ids = new ArrayList<>();
    public List<Integer> tier3Ids = new ArrayList<>();
    public List<Integer> tier4Ids = new ArrayList<>();
    public List<String> tier1Names = new ArrayList<>();
    public List<String> tier2Names = new ArrayList<>();
    public List<String> tier3Names = new ArrayList<>();
    public List<String> tier4Names = new ArrayList<>();
    public List<String> tier1Facet = new ArrayList<>();
    public List<String> tier2Facet = new ArrayList<>();
    public List<String> tier3Facet = new ArrayList<>();
    public List<String> tier4Facet = new ArrayList<>();
    public String priceText;
    public Float priceValue;
    public String salePriceText;
    public String salePriceValue;
    public String salePriceType;
    public String savingsValueText;
    public Double savingsValue;
    public Boolean hasMPerksOffers;
    public String calories;
    public String protein;
    public String carbohydrates;
    public String fat;
    public String altUomMethod;
    public Boolean hasAltUomMethod;
    public String altUomType;
    public Double altUomWeightEach;
    public String altUomWeightEachText;
    public String altUom;
    public Double altUnitPrice;
    public String updatedTimeStamp;
    public String updatedProcessId;
    public List<CfdField> cfdFields =  new ArrayList<>();
    public Links links;
    public Double weightEach;
    public Boolean isSubstitutable;
    public Boolean isHotItem;
    public String waysToSave;
    public String availability;
    public String priceGoodThrough;
    public Boolean isHomeDeliverable;
    public Boolean priceLessThanMap;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getUpc_type() {
        return upc_type;
    }

    public void setUpc_type(String upc_type) {
        this.upc_type = upc_type;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getSellingSize() {
        return sellingSize;
    }

    public void setSellingSize(String sellingSize) {
        this.sellingSize = sellingSize;
    }

    public Boolean getRandomWeight() {
        return isRandomWeight;
    }

    public void setRandomWeight(Boolean isRandomWeight) {
        this.isRandomWeight = isRandomWeight;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Boolean getBrandIsMeijer() {
        return brandIsMeijer;
    }

    public void setBrandIsMeijer(Boolean brandIsMeijer) {
        this.brandIsMeijer = brandIsMeijer;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getSellable() {
        return isSellable;
    }

    public void setSellable(Boolean isSellable) {
        this.isSellable = isSellable;
    }

    public Boolean getKilled() {
        return isKilled;
    }

    public void setKilled(Boolean isKilled) {
        this.isKilled = isKilled;
    }

    public Boolean getClickAndCollect() {
        return isClickAndCollect;
    }

    public void setClickAndCollect(Boolean isClickAndCollect) {
        this.isClickAndCollect = isClickAndCollect;
    }

    public Boolean getShipToHome() {
        return isShipToHome;
    }

    public void setShipToHome(Boolean isShipToHome) {
        this.isShipToHome = isShipToHome;
    }

    public Boolean getQuickShop() {
        return isQuickShop;
    }

    public void setQuickShop(Boolean isQuickShop) {
        this.isQuickShop = isQuickShop;
    }

    public Boolean getAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(Boolean isAlcohol) {
        this.isAlcohol = isAlcohol;
    }

    public Boolean getHasDeposit() {
        return hasDeposit;
    }

    public void setHasDeposit(Boolean hasDeposit) {
        this.hasDeposit = hasDeposit;
    }

    public Boolean getTobacco() {
        return isTobacco;
    }

    public void setTobacco(Boolean tobacco) {
        isTobacco = tobacco;
    }

    public Boolean getAgeRestricted() {
        return isAgeRestricted;
    }

    public void setAgeRestricted(Boolean ageRestricted) {
        isAgeRestricted = ageRestricted;
    }

    public Boolean getHazardousMaterial() {
        return isHazardousMaterial;
    }

    public void setHazardousMaterial(Boolean hazardousMaterial) {
        isHazardousMaterial = hazardousMaterial;
    }

    public Boolean getPreparedItem() {
        return isPreparedItem;
    }

    public void setPreparedItem(Boolean preparedItem) {
        isPreparedItem = preparedItem;
    }

    public Boolean getOrganic() {
        return isOrganic;
    }

    public void setOrganic(Boolean organic) {
        isOrganic = organic;
    }

    public Boolean getLocal() {
        return isLocal;
    }

    public void setLocal(Boolean local) {
        isLocal = local;
    }

    public Boolean getPrimaryUPC() {
        return isPrimaryUPC;
    }

    public void setPrimaryUPC(Boolean primaryUPC) {
        isPrimaryUPC = primaryUPC;
    }

    public List<Integer> getTier1Ids() {
        return tier1Ids;
    }

    public void setTier1Ids(List<Integer> tier1Ids) {
        this.tier1Ids = tier1Ids;
    }

    public List<Integer> getTier2Ids() {
        return tier2Ids;
    }

    public void setTier2Ids(List<Integer> tier2Ids) {
        this.tier2Ids = tier2Ids;
    }

    public List<Integer> getTier3Ids() {
        return tier3Ids;
    }

    public void setTier3Ids(List<Integer> tier3Ids) {
        this.tier3Ids = tier3Ids;
    }

    public List<Integer> getTier4Ids() {
        return tier4Ids;
    }

    public void setTier4Ids(List<Integer> tier4Ids) {
        this.tier4Ids = tier4Ids;
    }

    public List<String> getTier1Names() {
        return tier1Names;
    }

    public void setTier1Names(List<String> tier1Names) {
        this.tier1Names = tier1Names;
    }

    public List<String> getTier2Names() {
        return tier2Names;
    }

    public void setTier2Names(List<String> tier2Names) {
        this.tier2Names = tier2Names;
    }

    public List<String> getTier3Names() {
        return tier3Names;
    }

    public void setTier3Names(List<String> tier3Names) {
        this.tier3Names = tier3Names;
    }

    public List<String> getTier4Names() {
        return tier4Names;
    }

    public void setTier4Names(List<String> tier4Names) {
        this.tier4Names = tier4Names;
    }

    public List<String> getTier1Facet() {
        return tier1Facet;
    }

    public void setTier1Facet(List<String> tier1Facet) {
        this.tier1Facet = tier1Facet;
    }

    public List<String> getTier2Facet() {
        return tier2Facet;
    }

    public void setTier2Facet(List<String> tier2Facet) {
        this.tier2Facet = tier2Facet;
    }

    public List<String> getTier3Facet() {
        return tier3Facet;
    }

    public void setTier3Facet(List<String> tier3Facet) {
        this.tier3Facet = tier3Facet;
    }

    public List<String> getTier4Facet() {
        return tier4Facet;
    }

    public void setTier4Facet(List<String> tier4Facet) {
        this.tier4Facet = tier4Facet;
    }

    public String getPriceText() {
        return priceText;
    }

    public void setPriceText(String priceText) {
        this.priceText = priceText;
    }

    public Float getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(Float priceValue) {
        this.priceValue = priceValue;
    }

    public String getSalePriceText() {
        return salePriceText;
    }

    public void setSalePriceText(String salePriceText) {
        this.salePriceText = salePriceText;
    }


    public String getSalePriceValue() {
        return salePriceValue;
    }

    public void setSalePriceValue(String salePriceValue) {
        this.salePriceValue = salePriceValue;
    }

    public String getSalePriceType() {
        return salePriceType;
    }

    public void setSalePriceType(String salePriceType) {
        this.salePriceType = salePriceType;
    }

    public String getSavingsValueText() {
        return savingsValueText;
    }

    public void setSavingsValueText(String savingsValueText) {
        this.savingsValueText = savingsValueText;
    }

    public Double getSavingsValue() {
        return savingsValue;
    }

    public void setSavingsValue(Double savingsValue) {
        this.savingsValue = savingsValue;
    }

    public Boolean getHasMPerksOffers() {
        return hasMPerksOffers;
    }

    public void setHasMPerksOffers(Boolean hasMPerksOffers) {
        this.hasMPerksOffers = hasMPerksOffers;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getAltUomMethod() {
        return altUomMethod;
    }

    public void setAltUomMethod(String altUomMethod) {
        this.altUomMethod = altUomMethod;
    }

    public Boolean getHasAltUomMethod() {
        return hasAltUomMethod;
    }

    public void setHasAltUomMethod(Boolean hasAltUomMethod) {
        this.hasAltUomMethod = hasAltUomMethod;
    }

    public String getAltUomType() {
        return altUomType;
    }

    public void setAltUomType(String altUomType) {
        this.altUomType = altUomType;
    }

    public Double getAltUomWeightEach() {
        return altUomWeightEach;
    }

    public void setAltUomWeightEach(Double altUomWeightEach) {
        this.altUomWeightEach = altUomWeightEach;
    }

    public String getAltUomWeightEachText() {
        return altUomWeightEachText;
    }

    public void setAltUomWeightEachText(String altUomWeightEachText) {
        this.altUomWeightEachText = altUomWeightEachText;
    }

    public String getAltUom() {
        return altUom;
    }

    public void setAltUom(String altUom) {
        this.altUom = altUom;
    }

    public Double getAltUnitPrice() {
        return altUnitPrice;
    }

    public void setAltUnitPrice(Double altUnitPrice) {
        this.altUnitPrice = altUnitPrice;
    }

    public String getUpdatedTimeStamp() {
        return updatedTimeStamp;
    }

    public void setUpdatedTimeStamp(String updatedTimeStamp) {
        this.updatedTimeStamp = updatedTimeStamp;
    }

    public String getUpdatedProcessId() {
        return updatedProcessId;
    }

    public void setUpdatedProcessId(String updatedProcessId) {
        this.updatedProcessId = updatedProcessId;
    }

    public List<CfdField> getCfdFields() {
        return cfdFields;
    }

    public void setCfdFields(List<CfdField> cfdFields) {
        this.cfdFields = cfdFields;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Double getWeightEach() {
        return weightEach;
    }

    public void setWeightEach(Double weightEach) {
        this.weightEach = weightEach;
    }

    public Boolean getSubstitutable() {
        return isSubstitutable;
    }

    public void setSubstitutable(Boolean substitutable) {
        isSubstitutable = substitutable;
    }

    public Boolean getHotItem() {
        return isHotItem;
    }

    public void setHotItem(Boolean hotItem) {
        isHotItem = hotItem;
    }

    public String getWaysToSave() {
        return waysToSave;
    }

    public void setWaysToSave(String waysToSave) {
        this.waysToSave = waysToSave;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getPriceGoodThrough() {
        return priceGoodThrough;
    }

    public void setPriceGoodThrough(String priceGoodThrough) {
        this.priceGoodThrough = priceGoodThrough;
    }

    public Boolean getHomeDeliverable() {
        return isHomeDeliverable;
    }

    public void setHomeDeliverable(Boolean homeDeliverable) {
        isHomeDeliverable = homeDeliverable;
    }

    public Boolean getPriceLessThanMap() {
        return priceLessThanMap;
    }

    public void setPriceLessThanMap(Boolean priceLessThanMap) {
        this.priceLessThanMap = priceLessThanMap;
    }
}
