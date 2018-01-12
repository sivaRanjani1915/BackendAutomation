package com.services.responses.order.orderHistorySummaries;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OrderMeta {

    @JsonProperty("pagination")
    protected Pagination pagination;

    @JsonProperty("errors")
    protected List<Errors> errors;

    public OrderMeta() {
    }


    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
