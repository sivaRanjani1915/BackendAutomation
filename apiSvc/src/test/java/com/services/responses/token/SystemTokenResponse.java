package com.services.responses.token;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SystemTokenResponse {

    public String token_type;
    public Integer expires_in;
    public String refresh_token;
    public String access_token;
    public String expires_utc;
    public String isValid;

    @JsonIgnore
    public String error;
    @JsonIgnore
    public String error_description;

    public String getTokenType() {
        return token_type;
    }

    public void setTokenType(String token_type) {
        this.token_type = token_type;
    }

    public Integer getExpiresIn() {
        return expires_in;
    }

    public void setExpiresIn(Integer expires_in) {
        this.expires_in = expires_in;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getAccessToken() {
        return access_token;
    }

    public void setAccessToken(String access_token) {
        this.access_token = access_token;
    }

    public String getExpires_utc() {
        return expires_utc;
    }

    public void setExpires_utc(String expires_utc) {
        this.expires_utc = expires_utc;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}
