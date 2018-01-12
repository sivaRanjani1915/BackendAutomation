package com.automation.steps;

import com.automation.steps.serenity.PriceBaseSvcStepSerenity;
import cucumber.api.java.en.Then;

import java.util.List;

public class PriceBaseSvcStepDefinition {

    private PriceBaseSvcStepSerenity priceBaseSvcStepSerenity = new PriceBaseSvcStepSerenity();

    /**
     * Call Web Svc application/vnd.meijer.pricingdetails
     * @param storeId ,
     * @param upc     ,
     */
    @Then("get pricing details by storeId '(.*)' and Upc")
    public void getPricingDetailsByStoreIdAndUpc(String storeId, List<String> upc) {
        priceBaseSvcStepSerenity.getPricingDetailsByStoreIdAndUpc(storeId, upc);

    }

    /**
     * @param storeId ,
     * @param upc     ,
     */
    @Then("get simple pricing by storeId '(.*)' and Upc '(.*)'")
    public void getSimplePricingByStoreIdAndUpc(String storeId, String upc) {
        priceBaseSvcStepSerenity.getSimplePricingByStoreIdAndUpc(storeId, upc);
    }

    /**
     * Call Web Service application\vnd.meijer.pricing.bottledeposit
     * to get bottle deposit info by upc and storeId
     *
     * @param storeId To obtain a given storeId
     * @param upc     To obtain a given upc
     *
     *         If storeId == null && upc == null
     * @return: all upc and all storeId with bottle deposit
     *         If storeId != null && upc == null
     * @return: all upc at given storeId with bottle deposit
     *         If storeId == null && upc != mull
     * @return: one upc at all storeId with bottle deposit
     *         If storeId != null && upc != null
     * @return: one upc at one storeId with bottle deposit
     */
    @Then("get bottle deposit by storeId '(.*)' and Upc '(.*)'")
    public void getBottleDepositByStoreIdAndUpc(String storeId, String upc) {
        priceBaseSvcStepSerenity.getBottleDepositByStoreIdAndUpc(storeId, upc);
    }
}
