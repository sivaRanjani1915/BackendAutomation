package com.services.responses.order.orderHistorySummaries;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {

    @JsonProperty("page")
    protected int page;

    @JsonProperty("pageSize")
    protected int pageSize;

    @JsonProperty("totalItems")
    protected int totalItems;

    @JsonProperty("firstItem")
    protected int firstItem;

    @JsonProperty("lastItem")
    protected int lastItem;

    @JsonProperty("pageCount")
    protected int pageCount;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public int getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(int firstItem) {
        this.firstItem = firstItem;
    }

    public int getLastItem() {
        return lastItem;
    }

    public void setLastItem(int lastItem) {
        this.lastItem = lastItem;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
