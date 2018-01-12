package com.services;

import com.automation.utils.FormQueryMapBuilder;
import com.automation.utils.HeadersQueryMapBuilder;
import com.automation.utils.PathParamsMapBuilder;
import com.automation.utils.QueryParamsMapBuilder;
import com.services.responses.navWebApp.cartResponse.CartResponse;
import com.services.responses.search.productSearch.SearchResponse;
import com.services.responses.token.SsoAuthCodeAccessTokenPojo;
import com.services.responses.token.SystemTokenResponse;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;
import org.testng.util.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.automation.Definition_RunnerClass.*;

public class RestAssuredConfigurations extends SerenityRest {

    public static String USER_TOKEN = null;
    public static String GUEST_TOKEN = null;
    public static String EXTERNAL_TOKEN = null;
    public static String SSI_TOKEN = null;
    public static String ORDER_ID = null;
    public static Boolean isSSI = false;

    public static Response response = null;
    public static RequestSpecification request = null;

    public static SystemTokenResponse tokenResponse = null;
    public static SsoAuthCodeAccessTokenPojo accessTokenPojo = null;
    public static CartResponse cartResponse = null;
    public static SearchResponse searchResponse = null;

    public static List<Map<String, String>> dataTable = new ArrayList<>();
    public static FormQueryMapBuilder formQueryMapBuilder = new FormQueryMapBuilder();
    public static HeadersQueryMapBuilder headersQueryMapBuilder = new HeadersQueryMapBuilder();
    public static QueryParamsMapBuilder queryParamsMapBuilder = new QueryParamsMapBuilder();
    public static PathParamsMapBuilder pathParamsMapBuilder = new PathParamsMapBuilder();

    /**
     * To reset variables
     */
    public static void resetSvcConfigs() {
        isSSI = false;
        dataTable = new ArrayList<>();
        SSI_TOKEN = null;
        USER_TOKEN = null;
        GUEST_TOKEN = null;
        EXTERNAL_TOKEN = null;
        accessTokenPojo = null;
        headersQueryMapBuilder = new HeadersQueryMapBuilder();
        queryParamsMapBuilder = new QueryParamsMapBuilder();
        formQueryMapBuilder = new FormQueryMapBuilder();
        pathParamsMapBuilder = new PathParamsMapBuilder();
    }

    /**
     * By default REST Assured adds the charset header automatically.
     * To disable this completely you can configure the EncoderConfig like this:
     */
    private static RestAssuredConfig disableEncoder = new RestAssuredConfig().encoderConfig(EncoderConfig
            .encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false));

    public static RequestSpecification givenConfig() {
        return given().log().all()
                .relaxedHTTPSValidation()
                .accept("application/json")
                .config(disableEncoder);
    }

    public static Response executePostMethod(RequestSpecification request, String requestUrl) {
        return request.post(requestUrl);
    }

    public static Response executeGetMethod(RequestSpecification request, String requestUrl) {
        return request.get(requestUrl);
    }

    public static Response executeDeleteMethod(RequestSpecification request, String requestUrl) {
        return request.delete(requestUrl);
    }

    /**
     * To console print the response depending on debuggerMode in Definition_RunnerClass.java
     *
     * @param response ,
     */
    public static void printResponse(Response response) {
        if (isDebuggerModeOn()) {
            System.out.println("Response is ===============>");
            response.prettyPrint();
        } else
            response.then().log().ifError();
    }

    public static void assertThis(String method, Object expected, Object actual) {
        Assert.assertEquals(method + " - Status Code: ", expected, actual);
    }

    public static void assertFail(String method, String expected) {
        Assert.fail("Script failed at method ::: " + method + " ::: Expected ::: " + expected);
    }

    /**
     * Used to determine the service connection. DEV (sprint) or UAT or UAT-QA (Qa)
     */
    public static String getTestEnvironment() {
        String append = "";
        if (getEnvironment().contains("dev")) {
            append = "Sprint";
        }
        if (getEnvironment().contains("uat")) {
            append = "";
        }
        if (getEnvironment().contains("qa")) {
            append = "Qa";
        }
        return append;
    }

    static String getTokenServicesEnvironment() {
        String tokenService = "https://";
        if (getServices().contains("int")) {
            tokenService = tokenService + "ilogin.meijer.com";
        }
        else if (getServices().contains("cert")) {
            tokenService = tokenService + "clogin.meijer.com";
        }

        return tokenService;
    }

    static String getServicesEnvironment() {
        String service = "https://";

        if (getServices().contains("int")) {
            service = service + "imservices.meijer.com";
        }
        else if (getServices().contains("cert")) {
            service = service + "cmservices.meijer.com";
        }

        return service;
    }

    /**
     * Used to get the base layer.
     *
     * @return DRPartnerAppSvc Coordination layer if EXTERNAL_TOKEN is != null.
     */
    public static String getBaseLayerURL(String base) {
        String baseLayer;
        if (EXTERNAL_TOKEN != null) {
            baseLayer = ApiConfig.PARTNER_BASE_SVC;
        } else {
            baseLayer = base;
        }
        return baseLayer;
    }

    public static String getToken() {
        if (EXTERNAL_TOKEN != null) {
            return EXTERNAL_TOKEN;
        } else if (GUEST_TOKEN == null) {
            return USER_TOKEN;
        } else {
            return GUEST_TOKEN;
        }
    }

    public static String getToken2() {
        if (USER_TOKEN == null) {
            return GUEST_TOKEN;
        } else {
            return USER_TOKEN;
        }
    }

    public static void parameterIsNotNullOrEmpty(String parameter, Object value) {
        if (org.assertj.core.util.Strings.isNullOrEmpty(String.valueOf(value))) {
            Assert.fail("Parameter [" + parameter + "] CAN NOT be null or empty");
        }
    }

    public static Boolean isNullOrOptional(Object value) {
        return (Strings.isNullOrEmpty(String.valueOf(value)) || value.equals("optional"));
    }

}
