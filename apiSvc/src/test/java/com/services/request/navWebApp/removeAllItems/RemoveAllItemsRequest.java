package com.services.request.navWebApp.removeAllItems;

public class RemoveAllItemsRequest {

    public String id;
    public String cartId;

    public RemoveAllItemsRequest(String id, String cartId) {
        this.id = id;
        this.cartId = cartId;
    }


}
