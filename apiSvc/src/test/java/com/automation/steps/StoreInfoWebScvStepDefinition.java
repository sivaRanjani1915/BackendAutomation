package com.automation.steps;

import com.automation.steps.serenity.StoreInfoWebScvStepSerenity;
import cucumber.api.java.en.Then;

public class StoreInfoWebScvStepDefinition {

    private StoreInfoWebScvStepSerenity storeInfoWebScvStepSerenity = new StoreInfoWebScvStepSerenity();


    /**
     * @param version ,
     * @param storeId , optional
     */
    @Then("get storeInfo, version '(.*)' by store id '(.*)'")
    public void getStoreInfoByStoreId(String version, String storeId) {
        storeInfoWebScvStepSerenity.getStoreInfoByStoreId(version, storeId);
    }

    @Then("get storeInfo by store Id '(.*)' - External Vendor")
    public void getStoreInfoViaExternalVendorLayer(String storeId) {
        storeInfoWebScvStepSerenity.getStoreInfoViaExternalVendorLayer(storeId);
    }

    /**
     * @param latitude    , if null value will be storeInfoResponse.getStore(0).getLatitude()
     * @param longitude   , if null value will be storeInfoResponse.getStore(0).getLongitude()
     * @param milesRadius , required
     * @param numOfReturn , required
     */
    @Then("^return stores near latitude '(.*)', longitude '(.*)', miles '(.*)', number of stores '(.*)'$")
    public void returnStoresNearLatAndLong(String latitude, String longitude, String milesRadius, String numOfReturn) {
        storeInfoWebScvStepSerenity.returnStoresNearLatAndLong(latitude, longitude, milesRadius, numOfReturn);
    }

    @Then("get storeInfo cache Version: '(.*)'")
    public void getStoreInfoCache(String version) {
        storeInfoWebScvStepSerenity.getStoreInfoCache(version);
    }

    @Then("clear storeInfo cache")
    public void clearStoreInfoCache() {
        storeInfoWebScvStepSerenity.clearStoreInfoCache();
    }

    @Then("get mobile storeInfo Version: '(.*)'")
    public void getMobileStores(String version) {
        storeInfoWebScvStepSerenity.getMobileStores(version);
    }

    @Then("get mobile storeInfo, version '(.*)' by store id '(.*)'")
    public void getMobileStoreInfoByStoreId(String version, String storeId) {
        storeInfoWebScvStepSerenity.getMobileStoreInfoByStoreId(version, storeId);
    }
}
