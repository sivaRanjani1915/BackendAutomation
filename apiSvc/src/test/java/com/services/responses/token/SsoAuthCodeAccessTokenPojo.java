package com.services.responses.token;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonPropertyOrder({
        "client_id",
        "digital_id",
        "eguest_id",
        "exp",
        "has_digital",
        "has_mperks",
        "iss",
        "mperks_ext_shopper_id",
        "mperks_shopper_id",
        "scope"
})
public class SsoAuthCodeAccessTokenPojo {

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("digital_id")
    private String digitalId;

    @JsonProperty("eguest_id")
    private String eguestId;

    @JsonProperty("exp")
    private Double exp;

    @JsonProperty("has_digital")
    private String hasDigital;

    @JsonProperty("has_mperks")
    private String hasMperks;

    @JsonProperty("iss")
    private String iss;

    @JsonProperty("mperks_ext_shopper_id")
    private String mperksExtShopperId;

    @JsonProperty("mperks_shopper_id")
    private String mperksShopperId;

    @JsonProperty("scope")
    private List<String> scope = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @JsonProperty("client_id")
    public String getClientId() {
        return clientId;
    }


    @JsonProperty("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("digital_id")
    public String getDigitalId() {
        return digitalId;
    }

    @JsonProperty("digital_id")
    public void setDigitalId(String digitalId) {
        this.digitalId = digitalId;
    }

    @JsonProperty("eguest_id")
    public String getEguestId() {
        return eguestId;
    }

    @JsonProperty("eguest_id")
    public void setEguestId(String eguestId) {
        this.eguestId = eguestId;
    }

    @JsonProperty("exp")
    public Double getExp() {
        return exp;
    }

    @JsonProperty("exp")
    public void setExp(Double exp) {
        this.exp = exp;
    }

    @JsonProperty("has_digital")
    public String getHasDigital() {
        return hasDigital;
    }

    @JsonProperty("has_digital")
    public void setHasDigital(String hasDigital) {
        this.hasDigital = hasDigital;
    }

    @JsonProperty("has_mperks")
    public String getHasMperks() {
        return hasMperks;
    }

    @JsonProperty("has_mperks")
    public void setHasMperks(String hasMperks) {
        this.hasMperks = hasMperks;
    }

    @JsonProperty("iss")
    public String getIss() {
        return iss;
    }

    @JsonProperty("iss")
    public void setIss(String iss) {
        this.iss = iss;
    }

    @JsonProperty("mperks_ext_shopper_id")
    public String getMperksExtShopperId() {
        return mperksExtShopperId;
    }

    @JsonProperty("mperks_ext_shopper_id")
    public void setMperksExtShopperId(String mperksExtShopperId) {
        this.mperksExtShopperId = mperksExtShopperId;
    }

    @JsonProperty("mperks_shopper_id")
    public String getMperksShopperId() {
        return mperksShopperId;
    }

    @JsonProperty("mperks_shopper_id")
    public void setMperksShopperId(String mperksShopperId) {
        this.mperksShopperId = mperksShopperId;
    }

    @JsonProperty("scope")
    public List<String> getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
