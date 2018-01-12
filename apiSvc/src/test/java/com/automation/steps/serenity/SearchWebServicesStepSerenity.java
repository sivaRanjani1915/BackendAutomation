package com.automation.steps.serenity;

import com.services.ApiConfig;
import com.services.responses.search.productSearch.SearchResponse;
import com.services.responses.search.productSearch.Upc;
import com.automation.utils.HeadersQueryMapBuilder;
import com.automation.utils.QueryParamsMapBuilder;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import static com.services.RestAssuredConfigurations.*;

public class SearchWebServicesStepSerenity extends SerenityRest {

    private String BASE_PATH = ApiConfig.MEIJER_SERVICES_URL + getBaseLayerURL(ApiConfig.NAV_WEB_APP_SVC) + getTestEnvironment();

    public void productExistsWithGivenUpcAndStoreId(String UPC, String storeId) {

        queryParamsMapBuilder = new QueryParamsMapBuilder()
                .add_q_Upc(UPC)
                .addStore(storeId)
                .addSort(QueryParamsMapBuilder.Sort.ASC);

    }

    public void provideGivenUpcQueryParam(String UPC) {
        queryParamsMapBuilder.add_q_Upc(UPC);
    }

    public void provideStoreQueryParam(String storeId) {
        queryParamsMapBuilder.addStore(storeId);
    }

    public void addIsClickAndCollectQueryParam(Boolean isClickAndCollect) {
        queryParamsMapBuilder.addIsClickAndCollect(isClickAndCollect);
    }

    public void userGetsResponseFromSearchProductsApiCall() {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.SEARCH_ACCEPT);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .queryParams(queryParamsMapBuilder.build());

        String searchSvcCall = BASE_PATH + ApiConfig.SEARCH_SVC_CALL + ApiConfig.PRODUCTS_ENDPOINT;

        response = executeGetMethod(request, searchSvcCall);
        printResponse(response);

        searchResponse = response.as(SearchResponse.class);


        assertThis("userGetsResponseFromSearchProductsApiCall()", 200, response.getStatusCode());

    }

    public void verifyStatusCodeIsCorrect(int expectedStatusCode) {
        Assert.assertEquals("Status Code: ", expectedStatusCode, response.statusCode());
    }

    public void verifyGivenUpcExistsInResponse(String UPC) {

        if (searchResponse != null) {
            System.out.println("searchResponse.upcs.size() " + searchResponse.getUpcs().size());
            for (Upc upc : searchResponse.getUpcs()) {
                System.out.println("\nupc.shortName     ::: " + upc.getShortName());
                System.out.println("upc.upc           ::: " + upc.getUpc());
                System.out.println("upc.storeid       ::: " + upc.getStoreId());
                Assert.assertEquals("Verify UPC [" + UPC + "] exists: ", UPC, upc.getUpc());
            }
        }

    }


}
