package com.services.responses.storeInfo;

public class MarketAndRegion {

    public Integer MarketId;
    public Integer RegionId;
    public String MarketDescription;
    public String RegionDescription;

    public Integer getMarketId() {
        return MarketId;
    }

    public void setMarketId(Integer marketId) {
        this.MarketId = marketId;
    }

    public Integer getRegionId() {
        return RegionId;
    }

    public void setRegionId(Integer regionId) {
        this.RegionId = regionId;
    }

    public String getMarketDescription() {
        return MarketDescription;
    }

    public void setMarketDescription(String marketDescription) {
        this.MarketDescription = marketDescription;
    }

    public String getRegionDescription() {
        return RegionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.RegionDescription = regionDescription;
    }
}
