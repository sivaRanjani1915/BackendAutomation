package com.services.request.navWebApp.addItem;

public class AddItemRequest {

    public String id;
    public String cartId;
    public AddItem item;

    public AddItemRequest(String id, String cartId, AddItem item) {
        this.id = id;
        this.cartId = cartId;
        this.item = item;
    }

}
