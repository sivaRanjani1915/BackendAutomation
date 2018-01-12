package com.automation.steps;

import com.automation.steps.serenity.NavWebAppSvcStepSerenity;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.Map;

import static com.services.RestAssuredConfigurations.dataTable;
import static com.services.RestAssuredConfigurations.parameterIsNotNullOrEmpty;

public class NavWebAppSvcStepDefinition {

    private NavWebAppSvcStepSerenity navWebAppSvcStepSerenity = new NavWebAppSvcStepSerenity();

    @Then("create cart for guest user: storeId '(.*)'")
    public void createCartForGuestUser(String storeId) {
        navWebAppSvcStepSerenity.createCartForGuestUser(storeId);
    }

    /**
     * @param table ,
     *              | id | accountId | firstName | lastName | email | customerPostalCode | areaCode | phoneNumber |
     */
    @When("create cart for login user:")
    public void createCartLoginUser(DataTable table) {
        String id = null, accountID = null, firstName = null, lastName = null, email = null,
                customerPostalCode = null, primaryStoreId = null, areaCode = null, phoneNumber = null;

        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            id = map.get("id");
            accountID = map.get("accountId");
            firstName = map.get("firstName");
            lastName = map.get("lastName");
            email = map.get("email");
            customerPostalCode = map.get("customerPostalCode");
            primaryStoreId = map.get("storeId");
            areaCode = map.get("areaCode");
            phoneNumber = map.get("phoneNumber");
        }
        parameterIsNotNullOrEmpty("accountId", accountID);

        navWebAppSvcStepSerenity.createCartForSsiOrFsiUser(id, accountID, firstName, lastName,
                email, customerPostalCode, primaryStoreId, areaCode, phoneNumber);
    }

    /**
     * @param id                 ,
     * @param accountID          , required
     * @param firstName          ,
     * @param lastName           ,
     * @param email              ,
     * @param customerPostalCode ,
     * @param primaryStoreId     , required
     * @param areaCode           ,
     * @param phoneNumber        ,
     */
    @When("create cart for login user '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'")
    public void createCartLoginUser(
            String id, String accountID, String firstName,
            String lastName, String email, String customerPostalCode, String primaryStoreId,
            String areaCode, String phoneNumber) {

        parameterIsNotNullOrEmpty("accountId", accountID);

        navWebAppSvcStepSerenity.createCartForSsiOrFsiUser(id, accountID, firstName, lastName,
                email, customerPostalCode, primaryStoreId, areaCode, phoneNumber);
    }

    /**
     * @param table ,
     *              | id | accountId | firstName | lastName | email | customerPostalCode | storeId | areaCode | phoneNumber |
     */
    @Then("create cart for SSI user:")
    public void createCartForSsiUser(DataTable table) {
        String id = null, accountID = null, firstName = null,
                lastName = null, email = null, customerPostalCode = null, primaryStoreId = null,
                areaCode = null, phoneNumber = null;

        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            id = map.get("id");
            accountID = map.get("accountId");
            firstName = map.get("firstName");
            lastName = map.get("lastName");
            email = map.get("email");
            customerPostalCode = map.get("customerPostalCode");
            primaryStoreId = map.get("storeId");
            areaCode = map.get("areaCode");
            phoneNumber = map.get("phoneNumber");
        }

        parameterIsNotNullOrEmpty("accountId", accountID);

        navWebAppSvcStepSerenity.createCartForSsiOrFsiUser(id, accountID, firstName, lastName,
                email, customerPostalCode, primaryStoreId, areaCode, phoneNumber);
    }

    /**
     * @param id                 ,
     * @param accountID          , required
     * @param firstName          ,
     * @param lastName           ,
     * @param email              ,
     * @param customerPostalCode ,
     * @param primaryStoreId     , required
     * @param areaCode           ,
     * @param phoneNumber        ,
     */
    @When("create cart for SSI user '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'")
    public void createCartForSsiUser(
            String id, String accountID, String firstName, String lastName, String email,
            String customerPostalCode, String primaryStoreId, String areaCode, String phoneNumber) {

        parameterIsNotNullOrEmpty("accountId", accountID);

        navWebAppSvcStepSerenity.createCartForSsiOrFsiUser(id, accountID, firstName, lastName,
                email, customerPostalCode, primaryStoreId, areaCode, phoneNumber);
    }

    /**
     * @param accountId , Optional
     *                  if empty, it will get accountId via Token
     */
    @Then("add customer by account id '(.*)'")
    public void addCustomerByAccountId(String accountId) {
        navWebAppSvcStepSerenity.getCustomerByAccountId(accountId);
        navWebAppSvcStepSerenity.addCustomerInformation();
    }


    /**
     * @param table , | accountId | email | firstName | lastName | areaCode | phoneNumber |
     *              NOTE* : for Guest user, 'accountId' MUST == empty or NULL
     */
    @Then("add customer information:")
    public void addCustomerInformation(DataTable table) {
        String email = null, firstName = null, lastName = null, areaCode = null, phoneNumber = null, accountID = null;

        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            accountID = map.get("accountId");
            email = map.get("email");
            firstName = map.get("firstName");
            lastName = map.get("lastName");
            areaCode = map.get("areaCode");
            phoneNumber = map.get("phoneNumber");

        }

        navWebAppSvcStepSerenity.addCustomerInformation(accountID, email, firstName, lastName, areaCode, phoneNumber);
    }

    @Then("remove customer by cartId '(.*)'")
    public void removeCustomerInformation(String optionalCartId) {
        navWebAppSvcStepSerenity.removeCustomerInformation(optionalCartId);
    }

    /**
     * @param optionalCartId ,
     */
    @Then("delete cartId '(.*)'")
    public void deleteUsersCartByCartId(String optionalCartId) {
        navWebAppSvcStepSerenity.deleteUsersCartByCartId(optionalCartId);
    }

    /**
     * @param optionalCartId ,
     */
    @Then("get users cart by cartId '(.*)'")
    public void getCartByCartId(String optionalCartId) {
        navWebAppSvcStepSerenity.getCartByCartId(optionalCartId);
    }

    /**
     * @param optionalAccountId , Used for signed in sessions only.
     */
    @Then("get cart by accountId '(.*)'")
    public void getCartIdByAccountId(String optionalAccountId) {
        navWebAppSvcStepSerenity.getCartIdByAccountId(optionalAccountId);
    }

    /**
     * @param table ,
     *              | fGroupId | upc | storeId | itemName | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
     */
    @Then("add item to users cart:")
    public void addItemToUsersCart(DataTable table) {
        String upc, storeId, itemDescription, itemQuantity, price, selectedAltWeightEach,
                altUoM, selectedByALtUom, fulfillmentGroupTypeId;
        int index = 1;
        dataTable = new ArrayList<>();
        dataTable = table.asMaps(String.class, String.class);

        for (Map map : dataTable) {
            fulfillmentGroupTypeId = map.get("fGroupId").toString();
            upc = map.get("upc").toString();
            storeId = map.get("storeId").toString();
            itemDescription = map.get("itemName").toString();
            itemQuantity = map.get("itemQty").toString();
            price = map.get("price").toString();
            selectedByALtUom = map.get("selectedByAltUoM").toString();
            selectedAltWeightEach = map.get("selectedAltWeightEach").toString();
            altUoM = map.get("altUoM").toString();

            navWebAppSvcStepSerenity.setItemsToAddList(
                    String.valueOf(index), Integer.valueOf(fulfillmentGroupTypeId), upc, Integer.valueOf(storeId),
                    itemDescription, itemQuantity, price, Boolean.valueOf(selectedByALtUom),
                    selectedAltWeightEach, altUoM);
            index++;
        }

        navWebAppSvcStepSerenity.addItemsToUsersCart();
    }

    @Then("remove ALL items by cartId '(.*)'")
    public void removeAllItems(String optionalCartId) {
        navWebAppSvcStepSerenity.removeAllItems(optionalCartId);
    }

    /**
     * @param table , | firstName | lastName |
     *              NOTE*: 'firstName' And/Or 'lastName' are optional. If empty or  has value of "optional"
     *              firstName = cartResponse.getCart(0).getCustomer().getFirstName();
     *              lastName = cartResponse.getCart(0).getCustomer().getLastName();
     */
    @Then("add payment information:")
    public void addPaymentInformation(DataTable table) {
        String firstName = null, lastName = null;

        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            firstName = map.get("firstName");
            lastName = map.get("lastName");
        }

        navWebAppSvcStepSerenity.addPaymentInformation(firstName, lastName);
    }

    @Then("remove payment information by cartId '(.*)'")
    public void removePaymentInformation(String optionalCartId) {
        navWebAppSvcStepSerenity.removePaymentInformation(optionalCartId);
    }

    @Then("add shipping information")
    public void addShippingInformation() {
        navWebAppSvcStepSerenity.addShippingInformation();
    }

    /**
     * @param storeId ,
     */
    @Then("set store to storeId: '(.*)'")
    public void setCustomersStore(int storeId) {
        navWebAppSvcStepSerenity.setCustomersStore(storeId);
    }

    @Then("submit order")
    public void submitOrder() {
        navWebAppSvcStepSerenity.submitOrder();
    }

}
