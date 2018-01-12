package com.automation.steps;

import com.automation.steps.serenity.TokenAuthorizationStepSerenity;
import com.services.RestAssuredConfigurations;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;
import java.util.Map;


public class TokenAuthorizationStepDefinition extends SerenityRest {

    private TokenAuthorizationStepSerenity tokenAuthorizationStepSerenity = new TokenAuthorizationStepSerenity();

    @Then("reset Service configs")
    public void resetServiceConfigs() {
        RestAssuredConfigurations.resetSvcConfigs();
    }

    @When("authorization token is created for guest user")
    public void authorizationTokenIsCreatedForGuestUser() {
        tokenAuthorizationStepSerenity.authorizationTokenIsCreatedForGuestUser();
    }

    /**
     * @param table , | email | password |
     */
    @Given("^authorization token is created for Sign in user:$")
    public void authorizationTokenIsCreatedForSignInUser(DataTable table) {
        String email = null, password = null;

        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            email = map.get("email");
            password = map.get("password");
        }
        tokenAuthorizationStepSerenity.authorizationTokenIsCreatedForSignInUser(email, password);
    }

    /**
     * @param email ,
     * @param password ,
     */
    @Given("^authorization token is created for Sign in user: '(.*)' '(.*)'$")
    public void authorizationTokenIsCreatedForSignInUser(String email, String password) {
        tokenAuthorizationStepSerenity.authorizationTokenIsCreatedForSignInUser(email, password);
    }

    /**
     * @param table , | email | password |
     */
    @Then("^authorization token is created for SSI user:$")
    public void authorizationTokenIsCreatedForSSIUser(DataTable table) {
        String email = null, password = null;

        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            email = map.get("email");
            password = map.get("password");
        }

        tokenAuthorizationStepSerenity.authorizationTokenIsCreatedForSignInUser(email, password);
        tokenAuthorizationStepSerenity.authorizationTokenIsCreatedForSSIUser();
    }

    /**
     * @param email    ,
     * @param password ,
     */
    @Then("^authorization token is created for SSI user: '(.*)' '(.*)'$")
    public void authorizationTokenIsCreatedForSSIUser(String email, String password) {
        tokenAuthorizationStepSerenity.authorizationTokenIsCreatedForSignInUser(email, password);
        tokenAuthorizationStepSerenity.authorizationTokenIsCreatedForSSIUser();
    }

    @Then("test ssi token is valid")
    public void testSsiTokenIsValid() {
        tokenAuthorizationStepSerenity.testSsiTokenIsValid();
    }

    /**
     * @param scopeTypeList product = ds:product,
     *                        price = ds:product:price,
     *                    storeInfo = ds:storeinfo
     */
    @Then("authorization token is created for Flipp with ScopeType:")
    public void authorizationTokenCreatedForFlipp(List<String> scopeTypeList) {
        tokenAuthorizationStepSerenity.authorizationTokenCreatedForFlipp(scopeTypeList);
    }

    /**
     * @param scopeTypeList product = ds:product,
     *                        price = ds:product:price,
     *                          ilc = ds:product:ilc,
     *                        facet = ds:product:facet,
     *                          cfd = ds:product:cfd,
     *                    storeInfo = ds:storeinfo
     */
    @Then("authorization token is created for Kraft with ScopeType:")
    public void authorizationTokenCreatedForKraft(List<String> scopeTypeList) {
        tokenAuthorizationStepSerenity.authorizationTokenCreatedForKraft(scopeTypeList);
    }

    /**
     * @param scopeTypeList product = ds:product,
     *                        price = ds:product:price,
     *                          ilc = ds:product:ilc,
     *                        facet = ds:product:facet,
     *                          cfd = ds:product:cfd,
     *                          osa = ds:product:osa,
     *                    storeInfo = ds:storeinfo
     */
    @Then("authorization token is created for Shipt with ScopeType:")
    public void authorizationTokenCreatedForShipt(List<String> scopeTypeList) {
        tokenAuthorizationStepSerenity.authorizationTokenCreatedForShipt(scopeTypeList);
    }

    /**
     * @param scopeTypeList product = ds:product,
     *                        price = ds:product:price,
     *                    storeInfo = ds:storeinfo
     */
    @Then("authorization token is created for Meijer restricted vendors with ScopeType:")
    public void authorizationTokenCreatedForMeijerRestrictedVendors(List<String> scopeTypeList) {
        tokenAuthorizationStepSerenity.authorizationTokenCreatedForMeijerRestrictedVendors(scopeTypeList);
    }

    /**
     * @param scopeTypeList product = ds:product,
     *                        price = ds:product:price,
     *                          ilc = ds:product:ilc,
     *                        facet = ds:product:facet,
     *                          cfd = ds:product:cfd,
     *                          osa = ds:product:osa,
     *                    storeInfo = ds:storeinfo,
     *                       mperks = ds:product:mperk,
     *                           hw = ds:product:hw
     */
    @Then("authorization token is created for Meijer vendors with ScopeType:")
    public void authorizationTokenCreatedForMeijerVendors(List<String> scopeTypeList) {
        tokenAuthorizationStepSerenity.authorizationTokenCreatedForMeijerVendors(scopeTypeList);
    }

}
