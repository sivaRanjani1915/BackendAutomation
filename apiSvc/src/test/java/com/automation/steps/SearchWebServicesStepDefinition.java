package com.automation.steps;

import com.automation.steps.serenity.SearchWebServicesStepSerenity;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.services.RestAssuredConfigurations.parameterIsNotNullOrEmpty;

public class SearchWebServicesStepDefinition {

    private SearchWebServicesStepSerenity searchWebServicesStepSerenity = new SearchWebServicesStepSerenity();

    /**
     * @param UPC     ,
     * @param storeId ,
     */
    @Given("a product exists with an UPC of '(.*)' at store '(.*)'")
    public void productExistsWithGivenUpcAndStoreId(String UPC, String storeId) {
        parameterIsNotNullOrEmpty("UPC", UPC);
        parameterIsNotNullOrEmpty("storeId", storeId);

        searchWebServicesStepSerenity.productExistsWithGivenUpcAndStoreId(UPC, storeId);
    }

    /**
     * @param UPC ,
     */
    @Then("add UPC query parameter '(.*)'")
    public void provideGivenUpcQueryParam(String UPC) {
        parameterIsNotNullOrEmpty("UPC", UPC);
        searchWebServicesStepSerenity.provideGivenUpcQueryParam(UPC);
    }

    /**
     * @param storeId ,
     */
    @Then("add store id query parameter '(.*)'")
    public void provideStoreQueryParam(String storeId) {
        parameterIsNotNullOrEmpty("storeId", storeId);
        searchWebServicesStepSerenity.provideStoreQueryParam(storeId);
    }

    /**
     * @param isClickAndCollect ,
     */
    @Then("add isClickAndCollect query parameter '(.*)'")
    public void addIsClickAndCollectQueryParam(Boolean isClickAndCollect) {
        parameterIsNotNullOrEmpty("isClickAndCollect", isClickAndCollect);
        searchWebServicesStepSerenity.addIsClickAndCollectQueryParam(isClickAndCollect);
    }

    @When("a user executes search/products api call")
    public void userGetsResponseFromSearchProductsApiCall() {
        searchWebServicesStepSerenity.userGetsResponseFromSearchProductsApiCall();
    }

    /**
     * @param expectedStatusCode ,
     */
    @Then("the status code is '(.*)'")
    public void verifyStatusCodeIsCorrect(int expectedStatusCode) {
        searchWebServicesStepSerenity.verifyStatusCodeIsCorrect(expectedStatusCode);
    }

    /**
     * @param UPC ,
     */
    @Then("verify UPC: '(.*)' exists in response")
    public void verifyGivenUpcExistsInResponse(String UPC) {
        searchWebServicesStepSerenity.verifyGivenUpcExistsInResponse(UPC);
    }

}
