
package com.services.responses.navWebApp.cartResponse;

public class Pagination {

    public Integer page;
    public Integer pageSize;
    public Integer totalItems;
    public Integer pageCount;
    public Integer firstItem;
    public Integer lastItem;
    public Integer page_size;
    public Integer page_count;
    public Integer total_count;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(Integer firstItem) {
        this.firstItem = firstItem;
    }

    public Integer getLastItem() {
        return lastItem;
    }

    public void setLastItem(Integer lastItem) {
        this.lastItem = lastItem;
    }

}
