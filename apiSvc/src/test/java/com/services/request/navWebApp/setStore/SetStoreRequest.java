package com.services.request.navWebApp.setStore;

public class SetStoreRequest {

    public String id;
    public String cartId;
    public Integer storeId;


    public SetStoreRequest(String id, String cartId, Integer storeId) {
        this.id = id;
        this.cartId = cartId;
        this.storeId = storeId;
    }

}
