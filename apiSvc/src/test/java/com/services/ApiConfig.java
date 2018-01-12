package com.services;

import static com.services.RestAssuredConfigurations.getTokenServicesEnvironment;
import static com.services.RestAssuredConfigurations.getServicesEnvironment;

public class ApiConfig {

    /**
     * COMMON
     */
    public static String MEIJER_SERVICES_URL = getServicesEnvironment();
    // base path
    public static String NAV_WEB_APP_SVC = "/DRNavWebAppSvc";
    static String PARTNER_BASE_SVC = "/DRPartnerAppSvc";
    public static String PRICING_BASE_SVC = "/DRPricingBaseSvc";
    public static String ORDER_BASE_SVC = "/DROrderBaseSvc";
    public static String NAV_BASE_SVC = "/DRNavBaseSvc";

    /**
     * External Vendors
     */
    // FLIPP
    public static String FLIPP_BASIC_IntCert = "Basic ZmxpcHA6ZHVyQWdhdGh1cDZhZHJBU3RBS0VkNEFQQXlhdjdHZWM=";

    // SHIPT
    static String SHIPT_BASIC_Int = "Basic c2hpcHQ6RjN0cnVndWN1V2VnZXl1U2FTYTg2czd1WWV5YTg1WGE=";
    static String SHIPT_BASIC_Cert = "Basic c2hpcHQ6ZGE4d1VrZTV1ZnJlY3JlZnJhc3d1a3VkcmViNXJhc3A=";

    // KRAFT
    static String KRAFT_BASIC_Int = "Basic a3JhZnQ6NHJBc3dhd3J1c2U2dUZldmVrdXdhZGFwaGFzdGVqYWI=";
    static String KRAFT_BASIC_Cert = "Basic a3JhZnQ6VlVTdFVHZURBa2FTNnVrQWZSdXRyZXFhM3U3YVZ1ZkU=";

    // Meijer Restricted Vendors
    static String RESTRICTED_BASIC_Int = "Basic bWVpamVyX2V4dGVybmFsX3Rlc3RfdmVuZG9yX3Jlc3RyaWN0ZWQ6YmVXYWR1MndhM3BheWVzdDY1VXAzYVdVMmVjaDdOZW4=";
    static String RESTRICTED_BASIC_Cert = "Basic bWVpamVyX2V4dGVybmFsX3Rlc3RfdmVuZG9yX3Jlc3RyaWN0ZWQ6dmF3ZWNhZDNlV3VjaFVkcmVjaGVrdWNlOHJ1ZDZ5dWM=";

    // Meijer External Vendor
    static String MEIJER_EXTERNAL_BASIC_Int = "Basic bWVpamVyX2V4dGVybmFsX3Rlc3RfdmVuZG9yOnRyYTNlcGhlY2FzZXFBa1VwcmVwYWJyYXRodWZyYUpl";
    static String MEIJER_EXTERNAL_BASIC_Cert = "Basic bWVpamVyX2V4dGVybmFsX3Rlc3RfdmVuZG9yOjg3c2FUNnFlQ1IybXVzV2FwRWRhVHJ1UzhhZnJhZEVX";

    /**
     * TOKEN BASE
     */
    public static String BASIC = "Basic bWFnZW5pY2xvY2FsOkswRHlHQ2RB";
    public static String CLIENT_CREDENTIALS = "client_credentials";
    // url
    public static String TOKEN_BASE_URL = getTokenServicesEnvironment();
    // Service Calls
    public static String TOKEN_SVC_CALL = "/as";
    // End Points
    public static String TOKEN_OAUTH2_ENDPOINT = "/token.oauth2";
    public static String SSI_ENDPOINT = "/token/ssi/";
    // Accept
    public static String SSI_ACCEPT = "application/vnd.meijer.tokens.ssitoken-v1.0+json";
    public static String VALID_SSI_ACCEPT = "application/vnd.meijer.tokens.ssivalidationtoken-v1.0+json";
    // Content Type
    public static String TOKEN_CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static String VALID_SSI_CONTENT_TYPE = "application/vnd.meijer.tokens.ssivalidationresponse-v1.0+json";


    /**
     * NAV_WEB_APP_SVC LAYER
     */
    // Service Calls
    public static String CART_SVC_CALL = "/carts";
    // Accept
    public static String CART_ACCEPT = "application/vnd.meijer.cart.cart-v3.0+json";
    public static String CUSTOMER_ACCOUNT_ACCEPT = "application/vnd.meijer.account.account-v1.0+json";
    // End Points
    public static String CART_ID_ENDPOINT = "/{cartId}";
    public static String ACCOUNT_ID_ENDPOINT = "/{accountId}";
    public static String CREATE_CART_ENDPOINT = "/_services/createCart";
    public static String ADD_ITEM_ENDPOINT = "/_services/addItem";
    public static String SET_STORE_ENDPOINT = "/_services/setStore";
    public static String REMOVE_ALL_ITEMS_ENDPOINT = "/_services/removeAllItems";
    public static String ADD_PAYMENT_ENDPOINT = "/_services/addPayment";
    public static String ADD_SHIPPING_INFO_ENDPOINT = "/_services/addShipping";
    public static String ADD_CUSTOMER_ENDPOINT = "/_services/addCustomer";
    public static String REMOVE_CUSTOMER_ENDPOINT = "/_services/removeCustomer";
    public static String REMOVE_PAYMENT_ENDPOINT = "/_services/removePayment";
    public static String SUBMIT_ORDER_ENDPOINT = "/_services/submitOrder";
    public static String CUSTOMER_ACCOUNT_ENDPOINT = "/customer/accounts";
    // Content Type
    public static String SET_STORE_CONTENT_TYPE = "application/vnd.meijer.cart.setstore-v1.0+json";
    public static String CREATE_CART_CONTENT_TYPE = "application/vnd.meijer.cart.createcart-v1.0+json";
    public static String ADD_ITEM_CONTENT_TYPE = "application/vnd.meijer.cart.additem-v1.0+json";
    public static String REMOVE_ALL_ITEMS_CONTENT_TYPE = "application/vnd.meijer.cart.removeallitems-v1.0+json";
    public static String ADD_PICKUP_SLOT_CONTENT_TYPE = "application/vnd.meijer.cart.addpickupslot-v1.0+json";
    public static String REMOVE_PICKUP_SLOT_CONTENT_TYPE = "application/vnd.meijer.cart.removepickupslot-v1.0+json";
    public static String ADD_PAYMENT_CONTENT_TYPE = "application/vnd.meijer.cart.addpayment-v1.0+json";
    public static String ADD_SHIPPING_INFO_CONTENT_TYPE = "application/vnd.meijer.cart.addshipping-v1.0+json";
    public static String REMOVE_PAYMENT_CONTENT_TYPE = "application/vnd.meijer.cart.removepayment-v1.0+json";
    public static String ADD_CUSTOMER_CONTENT_TYPE = "application/vnd.meijer.cart.addcustomer-v1.0+json";
    public static String REMOVE_CUSTOMER_CONTENT_TYPE = "application/vnd.meijer.cart.removecustomer-v1.0+json";
    public static String SUBMIT_ORDER_CONTENT_TYPE = "application/vnd.meijer.cart.submitorder-v2.0+json";


    /**
     * SEARCH BASE
     */
    // Service Calls
    public static String SEARCH_SVC_CALL = "/search";
    // End Points
    public static String PRODUCTS_ENDPOINT = "/products";
    // Accept
    public static String SEARCH_ACCEPT = "application/vnd.meijer.search.product-v1.2+json";


    /**
     * RESERVATION SLOTS
     */
    // End Points
    public static String ADD_PICKUP_TIME_ENDPOINT = "/_services/addPickupSlot";
    public static String REMOVE_PICKUP_TIME_ENDPOINT = "/_services/removePickupSlot";
    public static String GET_RESERVATION_SLOTS_ENDPOINT = "/fulfillment/reservationslots";
    // Accept
    public static String TIME_SLOTS_ACCEPT = "application/vnd.meijer.fulfillment.schedule.reservationslots-v1.2+json";


    /**
     * STORE INFO
     */
    // Service Calls
    public static String STORE_INFO_SVC = "/storeinfo/api";
    // End Points
    public static String STORE_ID_ENDPOINT = "/{storeId}";
    public static String STORES_ENDPOINT = "/stores";
    public static String CACHE_ENDPOINT = "/cache";
    public static String CLEAR_ENDPOINT = "/clear";
    public static String MOBILE_ENDPOINT = "/mobile";
    public static String NEAR_ENDPOINT = "/near";
    // Accept
    public static String STORE_VENDOR_ACCEPT = "application/vnd.meijer.dr.store-v2.0+json";

    /**
     * NAVIGATION BASE
     */
    // Service Calls
    // Accept
    public static String TIERS_ACCEPT = "application/vnd.meijer.dr.tier-v1.0+json";
    // End Points
    public static String TIER_ID_ENDPOINT = "/{tierId}";
    public static String TIERS_ENDPOINT = "/tiers";
    // Content Types


    /**
     * PRICING BASE
     */
    // Service Call
    public static String PRICING_SVC_CALL = "/pricing";
    public static String BOTTLE_DEPOSIT_SVC_CALL = "/bottleDeposit";
    // Accept
    public static String PRICING_DETAILS_ACCEPT = "application/vnd.meijer.pricingdetails-v1.0+json";
    public static String SIMPLE_PRICING_ACCEPT = "application/vnd.meijer.pricing.simplepricing-v1.0+json";
    public static String BOTTLE_DEPOSIT_ACCEPT = "application/vnd.meijer.pricing.bottledeposit-v1.0+json";
    // End Points
    public static String PRICING_DETAILS_ENDPOINT = "/_services/pricingdetails";
    public static String SIMPLE_PRICING_ENDPOINT = "/_services/simplepricing";
    // Content Types
    public static String PRICING_CONTENT_TYPE = "application/vnd.meijer.pricing.simplepricingrequest-v1.0+json";


    /**
     * ORDER BASE
     */
    // Service Call
    public static String ORDER_SVC_CALL = "/order";
    public static String ORDERS_SVC_CALL = "/orders";
    // Accept
    public static String ORDER_ACCEPT = "application/vnd.meijer.order.order-v3.1+json";
    public static String ORDER_IS_EDITABLE_ACCEPT = "application/vnd.meijer.order.iseditable-v1.0+json";
    public static String ORDER_IS_CANCELLABLE_ACCEPT = "application/vnd.meijer.order.iscancellableresponse-v1.0+json";
    public static String CANCEL_ORDER_ACCEPT = "application/vnd.meijer.order.cancelorderresponse-v1.0+json";
    public static String ORDER_HISTORY_DETAIL_ACCEPT = "application/vnd.meijer.order.historyDetail-v1.0+json";
    public static String ORDER_HISTORY_SUMMARY_ACCEPT = "application/vnd.meijer.order.historySummary-v1.0+json";
    public static String ACTIVE_ORDER_INF0_ACCEPT = "application/vnd.meijer.order.activeorderinfo-v1.0+json";
    public static String EDITABLE_ORDERS_ACCEPT = "application/vnd.meijer.order.editableorders-v1.0+json";
    // End Points
    public static String ORDER_ID_ENDPOINT = "/{orderId}";
    public static String ORDER_IS_EDITABLE_ENDPOINT = "/_services/isEditable";
    public static String ORDER_IS_CANCELLABLE_ENDPOINT = "/_services/isCancellable";
    public static String CANCEL_ORDER_ENDPOINT = "/_services/cancelOrder";
    public static String ORDER_SET_PICKUP_SLOT_ENDPOINT = "/_services/setPickupSlot";
    public static String ORDER_HISTORY_DETAIL_ENDPOINT = "/orderHistoryDetails";
    public static String ORDER_HISTORY_SUMMARY_ENDPOINT = "/orderHistorySummaries";
    public static String ACTIVE_ORDER_INFO_ENDPOINT = "/activeOrderInfo";
    public static String EDITABLE_ORDERS_ENDPOINT = "/editableOrders";
    // Content Types
    public static String ORDER_IS_EDITABLE_CONTENT_TYPE = "application/vnd.meijer.order.iseditableresponse-v1.0+json";
    public static String ORDER_IS_CANCELLABLE_CONTENT_TYPE = "application/vnd.meijer.order.iscancellable-v1.0+json";
    public static String CANCEL_ORDER_CONTENT_TYPE = "application/vnd.meijer.order.cancelorder-v1.0+json";
    public static String ORDER_HISTORY_DETAIL_CONTENT_TYPE = "application/vnd.meijer.order.historyDetail-v1.0+json";
    public static String ORDER_SET_PICKUP_SLOT_CONTENT_TYPE = "application/vnd.meijer.order.setpickupslot-v1.1+json";

}