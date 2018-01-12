package com.automation.steps.serenity;

import com.services.ApiConfig;
import com.services.baseLayerUtils.TokenUtils;
import com.services.responses.token.SystemTokenResponse;
import com.automation.utils.FormQueryMapBuilder;
import com.automation.utils.HeadersQueryMapBuilder;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import java.util.List;

import static com.automation.Definition_RunnerClass.getServices;
import static com.services.ExternalVendorConfig.*;
import static com.services.RestAssuredConfigurations.*;

public class TokenAuthorizationStepSerenity extends SerenityRest {

    private String TokenURL = ApiConfig.TOKEN_BASE_URL + ApiConfig.TOKEN_SVC_CALL + ApiConfig.TOKEN_OAUTH2_ENDPOINT;
    private StringBuilder stringBuilder = new StringBuilder();

    public void authorizationTokenIsCreatedForGuestUser() {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(ApiConfig.BASIC);

        formQueryMapBuilder = new FormQueryMapBuilder()
                .addGrantType("client_credentials")
                .addScope("openid");

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .formParams(formQueryMapBuilder.build());

        response = executePostMethod(request, TokenURL);
        printResponse(response);

        tokenResponse = response.as(SystemTokenResponse.class);

        assertThis("authorizationTokenIsCreatedForGuestUser()", 200, response.getStatusCode());

        GUEST_TOKEN = tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();

    }

    public void authorizationTokenIsCreatedForSignInUser(String email, String password) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addContentType(ApiConfig.TOKEN_CONTENT_TYPE)
                .addAuthorization(ApiConfig.BASIC);

        formQueryMapBuilder = new FormQueryMapBuilder()
                .addGrantType("password")
                .addScope("openid")
                .addUserName(email)
                .addPassWord(password);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .formParams(formQueryMapBuilder.build());

        response = executePostMethod(request, TokenURL);
        printResponse(response);

        tokenResponse = response.as(SystemTokenResponse.class);

        assertThis("authorizationTokenIsCreatedForSignInUser()", 200, response.getStatusCode());

        USER_TOKEN = tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();

        TokenUtils.getSsoAuthCodeAccessTokenPayload(tokenResponse.getAccessToken()); // Signed In User
    }

    public void authorizationTokenIsCreatedForSSIUser() {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(USER_TOKEN)
                .addAccept(ApiConfig.SSI_ACCEPT)
                .addContentType(ApiConfig.TOKEN_CONTENT_TYPE);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build());

        String ssiTokenURL = ApiConfig.MEIJER_SERVICES_URL + ApiConfig.NAV_WEB_APP_SVC + getTestEnvironment() + ApiConfig.SSI_ENDPOINT;

        response = executePostMethod(request, ssiTokenURL);
        printResponse(response);

        tokenResponse = response.as(SystemTokenResponse.class);

        assertThis("authorizationTokenIsCreatedForSSIUser()", 200, response.getStatusCode());


        SSI_TOKEN = tokenResponse.getAccessToken();

        TokenUtils.getSsoAuthCodeAccessTokenPayload(tokenResponse.getAccessToken()); // SSI User

        isSSI = true;
        authorizationTokenIsCreatedForGuestUser();

    }

    public void testSsiTokenIsValid() {
        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(GUEST_TOKEN)
                .addAccept(ApiConfig.VALID_SSI_ACCEPT)
                .addContentType(ApiConfig.VALID_SSI_CONTENT_TYPE);

        String body = "{\"tokenString\": \"" + SSI_TOKEN + "\"}";

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(body);

        String testSsiTokenURL = NavWebAppSvcStepSerenity.BASE_PATH + "/token/ssi/_services/validate";

        response = executePostMethod(request, testSsiTokenURL);
        printResponse(response);

        tokenResponse = response.as(SystemTokenResponse.class);

        assertThis("testSsiTokenIsValid()", 200, response.getStatusCode());

        Assert.assertEquals("Test SSI Token is valid", "true", tokenResponse.getIsValid());

    }

    public void authorizationTokenCreatedForFlipp(List<String> scopeTypeList) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addContentType(ApiConfig.TOKEN_CONTENT_TYPE)
                .addAuthorization(ApiConfig.FLIPP_BASIC_IntCert);

        for (String scope : scopeTypeList) {
            stringBuilder.append(getScopeForFlipp(scope));
        }

        formQueryMapBuilder = new FormQueryMapBuilder()
                .addGrantType(ApiConfig.CLIENT_CREDENTIALS)
                .addScope("ext:vendor " + String.valueOf(stringBuilder).trim());

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .formParams(formQueryMapBuilder.build());

        response = executePostMethod(request, TokenURL);
        printResponse(response);

        tokenResponse = response.as(SystemTokenResponse.class);

        assertThis("authorizationTokenCreatedForFlipp()", 200, response.getStatusCode());

        EXTERNAL_TOKEN = tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();

    }

    public void authorizationTokenCreatedForKraft(List<String> scopeTypeList) {
        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addContentType(ApiConfig.TOKEN_CONTENT_TYPE)
                .addAuthorization(getVendorEnvironment(getServices(), "kraft"));

        for (String scope : scopeTypeList) {
            stringBuilder.append(getScopeForKraft(scope));
        }

        formQueryMapBuilder = new FormQueryMapBuilder()
                .addGrantType(ApiConfig.CLIENT_CREDENTIALS)
                .addScope("ext:vendor " + String.valueOf(stringBuilder).trim());

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .formParams(formQueryMapBuilder.build());

        response = executePostMethod(request, TokenURL);
        printResponse(response);

        tokenResponse = response.as(SystemTokenResponse.class);

        assertThis("authorizationTokenCreatedForKraft()", 200, response.getStatusCode());

        EXTERNAL_TOKEN = tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();

    }

    public void authorizationTokenCreatedForShipt(List<String> scopeTypeList) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addContentType(ApiConfig.TOKEN_CONTENT_TYPE)
                .addAuthorization(getVendorEnvironment(getServices(), "shipt"));

        for (String scope : scopeTypeList) {
            stringBuilder.append(getScopeForShipt(scope));
        }

        formQueryMapBuilder = new FormQueryMapBuilder()
                .addGrantType(ApiConfig.CLIENT_CREDENTIALS)
                .addScope("ext:vendor " + String.valueOf(stringBuilder).trim());

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .formParams(formQueryMapBuilder.build());

        response = executePostMethod(request, TokenURL);
        printResponse(response);

        tokenResponse = response.as(SystemTokenResponse.class);

        assertThis("authorizationTokenCreatedForShipt()", 200, response.getStatusCode());

        EXTERNAL_TOKEN = tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();

    }

    public void authorizationTokenCreatedForMeijerRestrictedVendors(List<String> scopeTypeList) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addContentType(ApiConfig.TOKEN_CONTENT_TYPE)
                .addAuthorization(getVendorEnvironment(getServices(), "restricted"));

        for (String scope : scopeTypeList) {
            stringBuilder.append(getScopeForRestricted(scope));
        }

        formQueryMapBuilder = new FormQueryMapBuilder()
                .addGrantType(ApiConfig.CLIENT_CREDENTIALS)
                .addScope("ext:vendor " + String.valueOf(stringBuilder).trim());

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .formParams(formQueryMapBuilder.build());

        response = executePostMethod(request, TokenURL);
        printResponse(response);

        tokenResponse = response.as(SystemTokenResponse.class);

        assertThis("authorizationTokenCreatedForRestrictedVendors()", 200, response.getStatusCode());

        EXTERNAL_TOKEN = tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();

    }

    public void authorizationTokenCreatedForMeijerVendors(List<String> scopeTypeList) {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addContentType(ApiConfig.TOKEN_CONTENT_TYPE)
                .addAuthorization(getVendorEnvironment(getServices(), "meijerVendor"));

        for (String scope : scopeTypeList) {
            stringBuilder.append(getScopeForMeijerVendor(scope));
        }

        formQueryMapBuilder = new FormQueryMapBuilder()
                .addGrantType(ApiConfig.CLIENT_CREDENTIALS)
                .addScope("ext:vendor " + String.valueOf(stringBuilder).trim());

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .formParams(formQueryMapBuilder.build());

        response = executePostMethod(request, TokenURL);
        printResponse(response);

        tokenResponse = response.as(SystemTokenResponse.class);

        assertThis("authorizationTokenCreatedForMeijerVendors()", 200, response.getStatusCode());

        EXTERNAL_TOKEN = tokenResponse.getTokenType() + " " + tokenResponse.getAccessToken();

    }
}
