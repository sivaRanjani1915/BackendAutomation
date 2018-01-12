package com.services.responses.order.activeOrderInfo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({"activeOrderInfo"})
@JsonIgnoreProperties({"meta", "linked"})
public class ActiveOrderInfoResponse {

    public static ActiveOrderInfoResponse activeOrderInfoResponse;

    @JsonProperty("activeOrderInfo")
    private List<ActiveOrderInfo> activeOrderInfo = new ArrayList<ActiveOrderInfo>();


    public List<ActiveOrderInfo> getActiveOrderInfo() {
        return activeOrderInfo;
    }

    public void setActiveOrderInfo(List<ActiveOrderInfo> activeOrderInfo) {
        this.activeOrderInfo = activeOrderInfo;
    }
}
