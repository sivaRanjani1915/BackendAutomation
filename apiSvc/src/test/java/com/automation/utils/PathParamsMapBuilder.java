package com.automation.utils;

public class PathParamsMapBuilder extends BaseQueryMapBuilder {

    public PathParamsMapBuilder() {
        super();
    }

    public PathParamsMapBuilder addStoreId(String storeId) {
        putString("storeId", storeId);
        return this;
    }

    public PathParamsMapBuilder addAccountId(String accountId) {
        putString("accountId", accountId);
        return this;
    }

    public PathParamsMapBuilder addOrderId(String orderId) {
        putString("orderId", orderId);
        return this;
    }

    public PathParamsMapBuilder addCartId(String cartId) {
        putString("cartId", cartId);
        return this;
    }

    public PathParamsMapBuilder addTierId(String tierId) {
        putString("tierId", tierId);
        return this;
    }

}
