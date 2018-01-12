package com.services.responses.order.orderHistorySummaries;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonIgnoreProperties({"message", "exceptionMessage", "exceptionType", "stackTrace"})
public class OrderSummariesDetail {

    public static OrderSummariesDetail orderSummariesDetail;

    public OrderSummariesDetail() {

    }

    @JsonProperty("meta")
    private OrderMeta meta;

    @JsonProperty("orderSummaries")
    private List<OrderSummary> orderSummaries = new ArrayList<OrderSummary>();

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public OrderMeta getMeta() {
        return meta;
    }

    public void setMeta(OrderMeta meta) {
        this.meta = meta;
    }

    public List<OrderSummary> getOrderSummaries() {
        return orderSummaries;
    }

    public void setOrderSummaries(List<OrderSummary> orderSummaries) {
        this.orderSummaries = orderSummaries;
    }
}
