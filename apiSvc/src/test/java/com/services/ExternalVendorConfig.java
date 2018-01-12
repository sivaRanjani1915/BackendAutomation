package com.services;

public class ExternalVendorConfig {

    private static String VENDOR_AUTH;

    private static String product = "ds:product ";
    private static String price = "ds:product:price ";
    private static String ilc = "ds:product:ilc ";
    private static String facet = "ds:product:facet ";
    private static String cfd = "ds:product:cfd ";
    private static String osa = "ds:product:osa ";
    private static String storeInfo = "ds:storeinfo ";
    private static String mperks = "ds:product:mperks ";
    private static String hw = "ds:product:hw ";


    public static String getScopeForFlipp(String scopeType) {
        String SCOPE_TYPE = "";
        switch (scopeType) {
            case "product":
                SCOPE_TYPE = product;
                break;
            case "price":
                SCOPE_TYPE = price;
                break;
            case "storeInfo":
                SCOPE_TYPE = storeInfo;
                break;
            case "all":
                SCOPE_TYPE = product + price + storeInfo;
                break;
        }
        return SCOPE_TYPE;
    }

    public static String getScopeForShipt(String scopeType) {
        String SCOPE_TYPE = "";
        switch (scopeType) {
            case "product":
                SCOPE_TYPE = product;
                break;
            case "price":
                SCOPE_TYPE = price;
                break;
            case "ilc":
                SCOPE_TYPE = ilc;
                break;
            case "facet":
                SCOPE_TYPE = facet;
                break;
            case "cfd":
                SCOPE_TYPE = cfd;
                break;
            case "osa":
                SCOPE_TYPE = osa;
                break;
            case "storeInfo":
                SCOPE_TYPE = storeInfo;
                break;
            case "all":
                SCOPE_TYPE = product + price + ilc + facet + cfd + osa + storeInfo;
                break;
        }
        return SCOPE_TYPE;
    }

    public static String getScopeForKraft(String scopeType) {
        String SCOPE_TYPE = "";
        switch (scopeType) {
            case "product":
                SCOPE_TYPE = product;
                break;
            case "price":
                SCOPE_TYPE = price;
                break;
            case "ilc":
                SCOPE_TYPE = ilc;
                break;
            case "facet":
                SCOPE_TYPE = facet;
                break;
            case "cfd":
                SCOPE_TYPE = cfd;
                break;
            case "storeInfo":
                SCOPE_TYPE = storeInfo;
                break;
            case "all":
                SCOPE_TYPE = product + price + ilc + facet + cfd + storeInfo;
                break;
        }
        return SCOPE_TYPE;
    }

    public static String getScopeForMeijerVendor(String scopeType) {
        String SCOPE_TYPE = "";
        switch (scopeType) {
            case "product":
                SCOPE_TYPE = product;
                break;
            case "price":
                SCOPE_TYPE = price;
                break;
            case "ilc":
                SCOPE_TYPE = ilc;
                break;
            case "facet":
                SCOPE_TYPE = facet;
                break;
            case "cfd":
                SCOPE_TYPE = cfd;
                break;
            case "osa":
                SCOPE_TYPE = osa;
                break;
            case "storeInfo":
                SCOPE_TYPE = storeInfo;
                break;
            case "mperks":
                SCOPE_TYPE = mperks;
                break;
            case "hw":
                SCOPE_TYPE = hw;
                break;
            case "all":
                SCOPE_TYPE = product + price + ilc + facet + cfd + osa + storeInfo + mperks + hw;
                break;
        }
        return SCOPE_TYPE;
    }

    public static String getScopeForRestricted(String scopeType) {
        String SCOPE_TYPE = "";
        switch (scopeType) {
            case "product":
                SCOPE_TYPE = product;
                break;
            case "price":
                SCOPE_TYPE = price;
                break;
            case "storeInfo":
                SCOPE_TYPE = storeInfo;
                break;
            case "all":
                SCOPE_TYPE = product + price + storeInfo;
        }
        return SCOPE_TYPE;
    }

    public static String getBaseTokenUrl(String e) {
        String baseUrl = "https://";
        if(e.toUpperCase().equals("INT")) {
            baseUrl += "ilogin.meijer.com";
        } else if (e.toUpperCase().equals("CERT")) {
            baseUrl += "clogin.meijer.com";
        }

        return baseUrl;
    }

    public static String getVendorEnvironment(String environment, String vendor) {

        if (environment.equals("cert") && vendor.equals("shipt")) {
            VENDOR_AUTH = ApiConfig.SHIPT_BASIC_Cert;

        } else if (environment.equals("int") && vendor.equals("shipt")) {
            VENDOR_AUTH = ApiConfig.SHIPT_BASIC_Int;

        } else if (environment.equals("cert") && vendor.equals("kraft")) {
            VENDOR_AUTH = ApiConfig.KRAFT_BASIC_Cert;

        } else if (environment.equals("int") && vendor.equals("kraft")) {
            VENDOR_AUTH = ApiConfig.KRAFT_BASIC_Int;

        } else if (environment.equals("cert") && vendor.equals("restricted")) {
            VENDOR_AUTH = ApiConfig.RESTRICTED_BASIC_Cert;

        } else if (environment.equals("int") && vendor.equals("restricted")) {
            VENDOR_AUTH = ApiConfig.RESTRICTED_BASIC_Int;

        } else if (environment.equals("cert") && vendor.equals("meijerVendor")) {
            VENDOR_AUTH = ApiConfig.MEIJER_EXTERNAL_BASIC_Cert;

        } else if (environment.equals("int") && vendor.equals("meijerVendor")) {
            VENDOR_AUTH = ApiConfig.MEIJER_EXTERNAL_BASIC_Int;

        }

        return VENDOR_AUTH;
    }

}
