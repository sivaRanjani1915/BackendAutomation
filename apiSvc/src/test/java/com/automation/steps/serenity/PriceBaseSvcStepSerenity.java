package com.automation.steps.serenity;

import com.services.ApiConfig;
import com.services.request.pricing.details.PricingBaseRequest;
import com.services.request.pricing.details.PricingRequest;
import com.services.responses.pricing.bottleDeposit.BottleDepositResponse;
import com.services.responses.pricing.pricingDetails.PricingDetailsResponse;
import com.automation.utils.HeadersQueryMapBuilder;
import com.automation.utils.QueryParamsMapBuilder;
import net.serenitybdd.rest.SerenityRest;

import java.util.ArrayList;
import java.util.List;

import static com.services.RestAssuredConfigurations.*;

public class PriceBaseSvcStepSerenity extends SerenityRest {

    private String BASE_PATH = ApiConfig.MEIJER_SERVICES_URL + getBaseLayerURL(ApiConfig.PRICING_BASE_SVC) + getTestEnvironment();
    private List<String> upcList = new ArrayList<>();

    public void getPricingDetailsByStoreIdAndUpc(String storeId, List<String> upcs) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.PRICING_DETAILS_ACCEPT)
                .addContentType(ApiConfig.PRICING_CONTENT_TYPE);

        for (String upc : upcs) {
            if (upc.equals("upcList")) {
                continue;
            }
            upcList.add(upc);
        }

        PricingRequest pricingRequest = new PricingRequest("0", storeId, upcList);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new PricingBaseRequest(pricingRequest));

        String pricingDetailsURL = BASE_PATH + ApiConfig.PRICING_SVC_CALL + ApiConfig.PRICING_DETAILS_ENDPOINT;

        response = executePostMethod(request, pricingDetailsURL);
        printResponse(response);

        response.as(PricingDetailsResponse.class);

        assertThis("getPricingDetailsByStoreIdAndUpc()", 200, response.getStatusCode());
    }

    public void getSimplePricingByStoreIdAndUpc(String storeId, String upc) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.SIMPLE_PRICING_ACCEPT)
                .addContentType(ApiConfig.PRICING_CONTENT_TYPE);

        upcList.add(upc);

        PricingRequest pricingRequest = new PricingRequest("0", storeId, upcList);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new PricingBaseRequest(pricingRequest));

        String pricingDetailsURL = BASE_PATH + ApiConfig.PRICING_SVC_CALL + ApiConfig.SIMPLE_PRICING_ENDPOINT;

        response = executePostMethod(request, pricingDetailsURL);
        printResponse(response);

        assertThis("getSimplePricingByStoreIdAndUpc()", 200, response.getStatusCode());

    }

    public void getBottleDepositByStoreIdAndUpc(String storeId, String upc) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.BOTTLE_DEPOSIT_ACCEPT);

        queryParamsMapBuilder = new QueryParamsMapBuilder();

        if (!isNullOrOptional(storeId)) {
            queryParamsMapBuilder.addStore(storeId);
        }

        if (!isNullOrOptional(upc)) {
            queryParamsMapBuilder.addUpc(upc);
        }


        request = givenConfig()
                .headers(headersQueryMapBuilder.build());

        if (queryParamsMapBuilder.build().size() != 0) {
            request.queryParams(queryParamsMapBuilder.build());
        }

        String bottleDepositURL = BASE_PATH + ApiConfig.BOTTLE_DEPOSIT_SVC_CALL;

        response = executeGetMethod(request, bottleDepositURL);
        printResponse(response);

        BottleDepositResponse bottleDepositResponse = response.as(BottleDepositResponse.class);

        assertThis("getBottleDepositByStoreIdAndUpc()", 200, response.getStatusCode());
    }

}
