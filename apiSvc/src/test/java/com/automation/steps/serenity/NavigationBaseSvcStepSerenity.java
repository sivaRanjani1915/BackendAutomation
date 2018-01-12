package com.automation.steps.serenity;

import com.services.ApiConfig;
import com.services.baseLayerUtils.NavBaseUtils;
import com.services.responses.nav.tiers.Tiers;
import com.automation.utils.HeadersQueryMapBuilder;
import com.automation.utils.PathParamsMapBuilder;
import com.automation.utils.QueryParamsMapBuilder;

import static com.services.RestAssuredConfigurations.*;
import static com.services.responses.nav.tiers.Tiers.tiersResponse;

public class NavigationBaseSvcStepSerenity {

    private String BASE_PATH = ApiConfig.MEIJER_SERVICES_URL + getBaseLayerURL(ApiConfig.NAV_BASE_SVC) + getTestEnvironment();

    public Tiers getTiers(String depth) {
        Tiers.tiersResponse = null;

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.TIERS_ACCEPT);

        queryParamsMapBuilder = new QueryParamsMapBuilder()
                .addDataStore("Production");

        if (!isNullOrOptional(depth)) {
            queryParamsMapBuilder.addDepth(depth);
        }

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .queryParams(queryParamsMapBuilder.build());

        String getTiersURL = BASE_PATH + ApiConfig.TIERS_ENDPOINT;

        response = executeGetMethod(request, getTiersURL);
        printResponse(response);

        assertThis("getTiers()", 200, response.getStatusCode());

        return tiersResponse = response.as(Tiers.class);
    }

    public void getTierByTierId(String tierId, String depth) {
        Tiers.tiersResponse = null;

        tierId = NavBaseUtils.getRandomTier(tierId);

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.TIERS_ACCEPT);

        queryParamsMapBuilder = new QueryParamsMapBuilder()
                .addDataStore("Production");

        if (!isNullOrOptional(depth)) {
            queryParamsMapBuilder.addDepth(depth);
        }

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addTierId(tierId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .queryParams(queryParamsMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String getTiersByTierIdURL = BASE_PATH + ApiConfig.TIERS_ENDPOINT + ApiConfig.TIER_ID_ENDPOINT;

        response = executeGetMethod(request, getTiersByTierIdURL);
        printResponse(response);

        assertThis("getTierByTierId()", 200, response.getStatusCode());

        tiersResponse = response.as(Tiers.class);

    }
}
