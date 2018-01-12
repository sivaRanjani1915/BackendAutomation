package com.automation.steps.serenity;


import com.automation.utils.HeadersQueryMapBuilder;
import com.automation.utils.PathParamsMapBuilder;
import com.automation.utils.QueryParamsMapBuilder;
import com.services.ApiConfig;
import com.services.request.navWebApp.addItem.AddItem;
import com.services.request.navWebApp.addItem.AddItemBaseRequest;
import com.services.request.navWebApp.addItem.AddItemRequest;
import com.services.request.navWebApp.createCart.guest.CreateCartGuestBaseRequest;
import com.services.request.navWebApp.createCart.guest.CreateCartGuestRequest;
import com.services.request.navWebApp.createCart.signIn.CreateCartBaseRequest;
import com.services.request.navWebApp.createCart.signIn.CreateCartRequest;
import com.services.request.navWebApp.customer.add.AddCustomer;
import com.services.request.navWebApp.customer.add.AddCustomerBaseRequest;
import com.services.request.navWebApp.customer.add.AddCustomerRequest;
import com.services.request.navWebApp.customer.remove.RemoveCustomerBaseRequest;
import com.services.request.navWebApp.customer.remove.RemoveCustomerRequest;
import com.services.request.navWebApp.payment.add.AddPaymentBaseRequest;
import com.services.request.navWebApp.payment.add.AddPaymentRequest;
import com.services.request.navWebApp.payment.add.CreditCard;
import com.services.request.navWebApp.payment.add.Payment;
import com.services.request.navWebApp.payment.remove.RemovePaymentBaseRequest;
import com.services.request.navWebApp.payment.remove.RemovePaymentRequest;
import com.services.request.navWebApp.removeAllItems.RemoveAllItemsBaseRequest;
import com.services.request.navWebApp.removeAllItems.RemoveAllItemsRequest;
import com.services.request.navWebApp.setStore.SetStoreBaseRequest;
import com.services.request.navWebApp.setStore.SetStoreRequest;
import com.services.request.navWebApp.shipping.add.AddShippingBaseRequest;
import com.services.request.navWebApp.shipping.add.AddShippingRequest;
import com.services.request.navWebApp.shipping.add.ShippingAddress;
import com.services.request.navWebApp.shipping.add.ShippingInfo;
import com.services.request.navWebApp.submitOrder.SubmitOrder;
import com.services.request.navWebApp.submitOrder.SubmitOrderBaseRequest;
import com.services.responses.navWebApp.accounts.Account;
import com.services.responses.navWebApp.accounts.AccountsResponse;
import com.services.responses.navWebApp.cartResponse.CartResponse;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static com.services.ApiConfig.ADD_ITEM_CONTENT_TYPE;
import static com.services.ApiConfig.CART_ACCEPT;
import static com.services.RestAssuredConfigurations.*;
import static com.services.baseLayerUtils.OrderBaseUtils.getValidAccountId;

public class NavWebAppSvcStepSerenity extends SerenityRest {

    private String givenCartId;
    private List<AddItemRequest> addItemRequestList = new ArrayList<>();

    static String BASE_PATH = ApiConfig.MEIJER_SERVICES_URL + getBaseLayerURL(ApiConfig.NAV_WEB_APP_SVC) + getTestEnvironment();

    public void createCartForGuestUser(String storeId) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addContentType(ApiConfig.CREATE_CART_CONTENT_TYPE)
                .addAccept(ApiConfig.CART_ACCEPT);

        CreateCartGuestRequest createCartRequest = new CreateCartGuestRequest(
                "123455679", Integer.valueOf(storeId));

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new CreateCartGuestBaseRequest(createCartRequest));

        String createCartURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.CREATE_CART_ENDPOINT;

        response = executePostMethod(request, createCartURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("createCartForGuestUser()", 200, response.getStatusCode());

    }

    public void createCartForSsiOrFsiUser(
            String id, String accountID, String firstName, String lastName, String email,
            String customerPostalCode, String primaryStoreId, String areaCode, String phoneNumber) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.CREATE_CART_CONTENT_TYPE);

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        CreateCartRequest createCartRequest = new CreateCartRequest(
                id, accountID, firstName, lastName, email, customerPostalCode,
                Integer.valueOf(primaryStoreId), areaCode, phoneNumber);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new CreateCartBaseRequest(createCartRequest));

        String createCartURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.CREATE_CART_ENDPOINT;

        response = executePostMethod(request, createCartURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("createCartForSsiOrFsiUser()", 200, response.getStatusCode());

    }

    public void getCustomerByAccountId(String accountId) {
        AccountsResponse.accountsResponse = null;

        accountId = getValidAccountId(accountId);

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CUSTOMER_ACCOUNT_ACCEPT);

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addAccountId(accountId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String getCustomerAccountURI = BASE_PATH + ApiConfig.CUSTOMER_ACCOUNT_ENDPOINT + ApiConfig.ACCOUNT_ID_ENDPOINT;

        response = executeGetMethod(request, getCustomerAccountURI);
        printResponse(response);

        AccountsResponse.accountsResponse = response.as(AccountsResponse.class);

        assertThis("getCustomerByAccountId()", 200, response.getStatusCode());

    }

    /**
     * This is dependent on getCustomerByAccountId(String)
     */
    public void addCustomerInformation() {
        if (AccountsResponse.accountsResponse.getAccountInfo() != null) {
            Account user = AccountsResponse.accountsResponse.getAccountInfo();

            String accountId, email, firstName, lastName, areaCode, phoneNumber, storeId;
            headersQueryMapBuilder = new HeadersQueryMapBuilder()
                    .addAuthorization(getToken())
                    .addAccept(ApiConfig.CART_ACCEPT)
                    .addContentType(ApiConfig.ADD_CUSTOMER_CONTENT_TYPE);

            accountId = String.valueOf(user.getId());
            email = user.getEmail();
            firstName = user.getFirstName();
            lastName = user.getLastName();
            areaCode = user.getZip();
            phoneNumber = String.valueOf(user.getMPerksPhone());
            storeId = String.valueOf(user.getStoreId());

            AddCustomer addCustomer = new AddCustomer(accountId, firstName,
                    lastName, areaCode, phoneNumber, email, storeId);

            AddCustomerRequest addCustomerRequest = new AddCustomerRequest(
                    "1", cartResponse.getCartInfo().getCartId(), addCustomer);

            request = givenConfig()
                    .headers(headersQueryMapBuilder.build())
                    .body(new AddCustomerBaseRequest(addCustomerRequest));

            String addCustomerURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.ADD_CUSTOMER_ENDPOINT;

            response = executePostMethod(request, addCustomerURL);
            printResponse(response);

            cartResponse = response.as(CartResponse.class);
            assertThis("addCustomerInformation()", 200, response.getStatusCode());

        } else {
            assertFail("addCustomerInformation()", "AccountsResponse.accountsResponse != null");
        }
    }

    public void addCustomerInformation(String accountID, String email, String firstName,
                                       String lastName, String areaCode, String phoneNumber) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.ADD_CUSTOMER_CONTENT_TYPE);

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        AddCustomer addCustomer = new AddCustomer(accountID, firstName, lastName, areaCode, phoneNumber, email);

        AddCustomerRequest addRequest = new AddCustomerRequest(
                "1", cartResponse.getCartInfo().getCartId(), addCustomer);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new AddCustomerBaseRequest(addRequest));
        String addCustomerURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.ADD_CUSTOMER_ENDPOINT;

        response = executePostMethod(request, addCustomerURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("addCustomerInformation()", 200, response.getStatusCode());

    }

    public void removeCustomerInformation(String optionalCartId) {

        if (isNullOrOptional(optionalCartId)) {
            givenCartId = cartResponse.getCartInfo().getCartId();
        } else {
            givenCartId = optionalCartId;
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.REMOVE_CUSTOMER_CONTENT_TYPE);

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        RemoveCustomerRequest removeCustomer = new RemoveCustomerRequest("1", givenCartId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new RemoveCustomerBaseRequest(removeCustomer));

        String removeCustomerURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.REMOVE_CUSTOMER_ENDPOINT;

        response = executePostMethod(request, removeCustomerURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("removeCustomerInformation()", 200, response.getStatusCode());

    }

    public void deleteUsersCartByCartId(String optionalCartId) {

        if (isNullOrOptional(optionalCartId)) {
            givenCartId = cartResponse.getCartInfo().getCartId();
        } else {
            givenCartId = optionalCartId;
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken());

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addCartId(givenCartId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String deleteCartURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.CART_ID_ENDPOINT;

        response = executeDeleteMethod(request, deleteCartURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("deleteUsersCartByCartId()", 200, response.getStatusCode());

    }

    public void getCartByCartId(String optionalCartId) {

        if (isNullOrOptional(optionalCartId)) {
            givenCartId = cartResponse.getCartInfo().getCartId();
        } else {
            givenCartId = optionalCartId;
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAccept(CART_ACCEPT)
                .addAuthorization(getToken());

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addCartId(givenCartId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String getUserCartURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.CART_ID_ENDPOINT;

        response = executeGetMethod(request, getUserCartURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("getCartByCartId()", 200, response.getStatusCode());

    }

    public void getCartIdByAccountId(String optionalAccountId) {
        String accountId = null;

        optionalAccountId = getValidAccountId(optionalAccountId);
        if (isNullOrOptional(optionalAccountId)) {
            accountId = optionalAccountId;
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAccept(CART_ACCEPT)
                .addAuthorization(getToken());

        queryParamsMapBuilder = new QueryParamsMapBuilder()
                .addAccountId(accountId);

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .queryParams(queryParamsMapBuilder.build());

        String getCartByAccountIdURL = BASE_PATH + ApiConfig.CART_SVC_CALL;

        response = executeGetMethod(request, getCartByAccountIdURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("getCartIdByAccountId()", 200, response.getStatusCode());

    }

    public void setItemsToAddList(
            String id, Integer fulfillmentGroupTypeId, String upc, Integer storeId,
            String itemDescription, String itemQuantity, String price, Boolean selectedByALtUom,
            String selectedAltWeightEach, String altUoM) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(CART_ACCEPT)
                .addContentType(ADD_ITEM_CONTENT_TYPE);

        AddItem addItem = new AddItem(
                id, fulfillmentGroupTypeId, "", upc, storeId, itemDescription, itemQuantity, price,
                false, selectedByALtUom, selectedAltWeightEach, altUoM);

        AddItemRequest addItemRequest = new AddItemRequest(
                "1", cartResponse.getCartInfo().getCartId(), addItem);

        addItemRequestList.add(addItemRequest);

    }

    public void addItemsToUsersCart() {

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new AddItemBaseRequest(addItemRequestList));
        addItemRequestList = new ArrayList<>();

        String addItemToCartURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.ADD_ITEM_ENDPOINT;

        response = executePostMethod(request, addItemToCartURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("addItemsToUsersCart()", 200, response.getStatusCode());

    }

    public void removeAllItems(String optionalCartId) {

        if (isNullOrOptional(optionalCartId)) {
            givenCartId = cartResponse.getCartInfo().getCartId();
        } else {
            givenCartId = optionalCartId;
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken2())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.REMOVE_ALL_ITEMS_CONTENT_TYPE);

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        RemoveAllItemsRequest removeAllItems = new RemoveAllItemsRequest("123455679", givenCartId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new RemoveAllItemsBaseRequest(removeAllItems));

        String removeAllItemsURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.REMOVE_ALL_ITEMS_ENDPOINT;

        response = executePostMethod(request, removeAllItemsURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("removeAllItems()", 200, response.getStatusCode());

    }

    public void addPaymentInformation(String firstName, String lastName) {
        String customerFirstName, customerLastName;

        if (isNullOrOptional(firstName)) {
            customerFirstName = cartResponse.getCartInfo().getCustomer().getFirstName();
        } else {
            customerFirstName = firstName;
        }

        if (isNullOrOptional(lastName)) {
            customerLastName = cartResponse.getCartInfo().getCustomer().getLastName();
        } else {
            customerLastName = lastName;
        }
        String cartId = cartResponse.getCartInfo().getCartId();

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.ADD_PAYMENT_CONTENT_TYPE);

        CreditCard addThisCreditCard = new CreditCard().addVisa();

        Payment addThisPaymentInfo = new Payment("1", customerFirstName, customerLastName, addThisCreditCard);

        AddPaymentRequest paymentRequest = new AddPaymentRequest(
                "1", cartId, addThisPaymentInfo);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new AddPaymentBaseRequest(paymentRequest));

        String addPaymentURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.ADD_PAYMENT_ENDPOINT;

        response = executePostMethod(request, addPaymentURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("addPaymentInformation()", 200, response.getStatusCode());

    }

    public void addShippingInformation() {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.ADD_SHIPPING_INFO_CONTENT_TYPE);

        //shippingAddress
        String firstName, lastName, email, address, city, state, zipCode, countryCode;

        firstName = cartResponse.getCartInfo().getCustomer().getFirstName();
        lastName = cartResponse.getCartInfo().getCustomer().getLastName();
        address = cartResponse.getCartInfo().getPayment().getAddressLine1();
        email = cartResponse.getCartInfo().getCustomer().getEmail();
        city = cartResponse.getCartInfo().getPayment().getCity();
        state = cartResponse.getCartInfo().getPayment().getState();
        zipCode = cartResponse.getCartInfo().getPayment().getZipCode();
        countryCode = cartResponse.getCartInfo().getPayment().getCountryCode();

        ShippingAddress shippingAddress = new ShippingAddress(
                firstName, lastName, email, address, city, state, zipCode, countryCode);

        //shippingInfo
        String deliveryMethod, minDate, maxDate;

        deliveryMethod = "NEXTDAY";
        // TODO: get Min and Max date in java
        minDate = "01/01/2017";
        maxDate = "12/31/2017";

        ShippingInfo shippingInfo = new ShippingInfo(
                deliveryMethod, minDate, maxDate, shippingAddress);

        //addShippingRequest
        String cartId = cartResponse.getCartInfo().getCartId();

        AddShippingRequest addShippingRequest = new AddShippingRequest(
                cartId, shippingInfo);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new AddShippingBaseRequest(addShippingRequest));


        String addShippingInfoURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.ADD_SHIPPING_INFO_ENDPOINT;

        response = executePostMethod(request, addShippingInfoURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("addShippingInformation()", 200, response.getStatusCode());


    }

    public void removePaymentInformation(String optionalCartId) {

        if (isNullOrOptional(optionalCartId)) {
            givenCartId = cartResponse.getCartInfo().getCartId();
        } else {
            givenCartId = optionalCartId;
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.REMOVE_PAYMENT_CONTENT_TYPE);

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        RemovePaymentRequest removePayment = new RemovePaymentRequest("1", givenCartId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new RemovePaymentBaseRequest(removePayment));

        String removePaymentURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.REMOVE_PAYMENT_ENDPOINT;

        response = executePostMethod(request, removePaymentURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);


        assertThis("removePaymentInformation()", 200, response.getStatusCode());


    }

    public void setCustomersStore(int storeId) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.SET_STORE_CONTENT_TYPE);

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        SetStoreRequest storeRequest = new SetStoreRequest(
                "123455679", cartResponse.getCartInfo().getCartId(), storeId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new SetStoreBaseRequest(storeRequest));

        String setStoreURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.SET_STORE_ENDPOINT;

        response = executePostMethod(request, setStoreURL);
        printResponse(response);

        cartResponse = response.as(CartResponse.class);

        assertThis("setCustomerStore()", 200, response.getStatusCode());


    }

    public void submitOrder() {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.SUBMIT_ORDER_CONTENT_TYPE);

        if (isSSI) {
            headersQueryMapBuilder.addSsiToken(SSI_TOKEN);
        }

        SubmitOrder submitOrder = new SubmitOrder(cartResponse.getCartInfo().getCartId());

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new SubmitOrderBaseRequest(submitOrder));

        String submitOrderURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.SUBMIT_ORDER_ENDPOINT;

        response = executePostMethod(request, submitOrderURL);
        printResponse(response);

        Assert.assertEquals(200, response.getStatusCode());

        cartResponse = response.as(CartResponse.class);

        assertThis("submitOrder()", 200, response.getStatusCode());

        ORDER_ID = cartResponse.getCartInfo().getOrderNumber();
    }

}
