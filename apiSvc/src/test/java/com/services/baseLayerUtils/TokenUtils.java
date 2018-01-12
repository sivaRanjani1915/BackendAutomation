package com.services.baseLayerUtils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.services.responses.token.SsoAuthCodeAccessTokenPojo;
import org.apache.commons.codec.binary.Base64;

import static com.services.RestAssuredConfigurations.accessTokenPojo;

    public class TokenUtils {

    public static void getSsoAuthCodeAccessTokenPayload(String accessToken) {
        int indx1 = accessToken.indexOf(".");
        int indx2 = accessToken.lastIndexOf(".");

        String payload = accessToken;

        if (!(indx1 < 0 || indx2 < 0)) {
            payload = accessToken.substring(indx1, indx2);
        }
        while (payload.length() % 4 != 0) {
            payload += "=";
        }

        accessTokenPojo = new SsoAuthCodeAccessTokenPojo();

        accessTokenPojo = (SsoAuthCodeAccessTokenPojo) importJsonString(new String(Base64.decodeBase64(payload.getBytes())));
    }

    private static Object importJsonString(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            if (accessTokenPojo == null) {
                accessTokenPojo = new SsoAuthCodeAccessTokenPojo();
            }
            accessTokenPojo = mapper.readValue(jsonString, accessTokenPojo.getClass());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return accessTokenPojo;
    }
}
