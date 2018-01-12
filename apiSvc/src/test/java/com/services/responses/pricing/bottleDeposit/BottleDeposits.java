package com.services.responses.pricing.bottleDeposit;

public class BottleDeposits {

    public String storeId;
    public String upc;
    public String bottleDepositAmount;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getBottleDepositAmount() {
        return bottleDepositAmount;
    }

    public void setBottleDepositAmount(String bottleDepositAmount) {
        this.bottleDepositAmount = bottleDepositAmount;
    }
}
