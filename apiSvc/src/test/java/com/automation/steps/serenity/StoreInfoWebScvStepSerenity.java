package com.automation.steps.serenity;

import com.services.ApiConfig;
import com.services.responses.storeInfo.cache.CacheResponse;
import com.services.responses.storeInfo.StoreInfoResponse;
import com.services.responses.storeInfo.mobile.MobileStoreInfoResponse;
import com.automation.utils.HeadersQueryMapBuilder;
import com.automation.utils.PathParamsMapBuilder;
import net.serenitybdd.rest.SerenityRest;

import static com.services.RestAssuredConfigurations.*;
import static com.services.responses.storeInfo.cache.CacheResponse.cacheResponse;
import static com.services.responses.storeInfo.mobile.MobileStoreInfoResponse.mobileStoreInfoResponse;

public class StoreInfoWebScvStepSerenity extends SerenityRest {

    private StoreInfoResponse storeInfoResponse = null;

    private String BASE_PATH = ApiConfig.MEIJER_SERVICES_URL + getBaseLayerURL(ApiConfig.STORE_INFO_SVC);

    public void getStoreInfoByStoreId(String version, String storeId) {

        if (isNullOrOptional(version)) {
            // v4 by default if one isn't given
            version = "4";
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addVersion(version);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build());

        String storeInfoULI = BASE_PATH + ApiConfig.STORES_ENDPOINT;

        if (!isNullOrOptional(storeId)) {
            pathParamsMapBuilder = new PathParamsMapBuilder()
                    .addStoreId(storeId);

            request.pathParams(pathParamsMapBuilder.build());

            storeInfoULI += ApiConfig.STORE_ID_ENDPOINT;
        }

        response = executeGetMethod(request, storeInfoULI);
        printResponse(response);

        storeInfoResponse = response.as(StoreInfoResponse.class);

        assertThis("getStoreInfoByStoreId()", 200, response.getStatusCode());

    }

    public void getStoreInfoViaExternalVendorLayer(String storeId) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.STORE_VENDOR_ACCEPT);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build());

        String storeInfoURL = BASE_PATH + getTestEnvironment() + ApiConfig.STORES_ENDPOINT;

        if (!isNullOrOptional(storeId)) {
            pathParamsMapBuilder = new PathParamsMapBuilder()
                    .addStoreId(storeId);

            request.pathParams(pathParamsMapBuilder.build());

            storeInfoURL += ApiConfig.STORE_ID_ENDPOINT;
        }

        response = executeGetMethod(request, storeInfoURL);
        printResponse(response);

        storeInfoResponse = response.as(StoreInfoResponse.class);

        assertThis("getStoreInfoViaExternalVendorLayer()", 200, response.getStatusCode());
    }

    public void returnStoresNearLatAndLong(String latitude, String longitude, String milesRadius, String numOfReturn) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addVersion("4");

        if (isNullOrOptional(latitude)) {
            queryParamsMapBuilder.addLatitude(storeInfoResponse.getStore(0).getLatitude());
        } else {
            queryParamsMapBuilder.addLatitude(latitude);
        }

        if (isNullOrOptional(longitude)) {
            queryParamsMapBuilder.addLongitude(storeInfoResponse.getStore(0).getLongitude());
        } else {
            queryParamsMapBuilder.addLongitude(longitude);
        }

        if (!isNullOrOptional(numOfReturn)) {
            queryParamsMapBuilder.addNumOfReturns(numOfReturn);
        }

        if (!isNullOrOptional(milesRadius)) {
            queryParamsMapBuilder.addMileRadius(milesRadius);
        }

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .queryParams(queryParamsMapBuilder.build());

        String storeInfoULI = BASE_PATH + ApiConfig.STORES_ENDPOINT + ApiConfig.NEAR_ENDPOINT;

        response = executeGetMethod(request, storeInfoULI);
        printResponse(response);

        storeInfoResponse = response.as(StoreInfoResponse.class);

        assertThis("returnStoresNearLatAndLong()", 200, response.getStatusCode());

    }

    public void getStoreInfoCache(String version) {
        CacheResponse.cacheResponse = null;

        if (isNullOrOptional(version)) {
            // v4 by default if one isn't given
            version = "4";
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addVersion(version);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build());

        String storeInfoGetCacheURL = BASE_PATH + ApiConfig.CACHE_ENDPOINT + ApiConfig.STORES_ENDPOINT;

        response = executeGetMethod(request, storeInfoGetCacheURL);
        printResponse(response);

        assertThis("returnStoresNearLatAndLong()", 200, response.getStatusCode());

        cacheResponse = response.as(CacheResponse.class);

    }

    public void clearStoreInfoCache() {
        //TODO: jPalma: clearStoreInfoCache() method
    }

    public void getMobileStores(String version) {
        MobileStoreInfoResponse.mobileStoreInfoResponse = null;

        if (isNullOrOptional(version)) {
            // v4 by default if one isn't given
            version = "4";
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addVersion(version);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build());

        String mobileStoreInfoURL = BASE_PATH + ApiConfig.MOBILE_ENDPOINT + ApiConfig.STORES_ENDPOINT;

        response = executeGetMethod(request, mobileStoreInfoURL);
        printResponse(response);
        assertThis("getMobileStoreInfo()", 200, response.getStatusCode());

        mobileStoreInfoResponse = response.as(MobileStoreInfoResponse.class);

        mobileStoreInfoResponse.getStores().size();
    }

    public void getMobileStoreInfoByStoreId(String version, String storeId) {
        MobileStoreInfoResponse.mobileStoreInfoResponse = null;

        if (isNullOrOptional(version)) {
            // v4 by default if one isn't given
            version = "4";
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addVersion(version);

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addStoreId(storeId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String mobileStoreInfoByStoreIdURL = BASE_PATH + ApiConfig.MOBILE_ENDPOINT + ApiConfig.STORES_ENDPOINT + ApiConfig.STORE_ID_ENDPOINT;

        response = executeGetMethod(request, mobileStoreInfoByStoreIdURL);
        printResponse(response);

        mobileStoreInfoResponse = response.as(MobileStoreInfoResponse.class);

    }
}
