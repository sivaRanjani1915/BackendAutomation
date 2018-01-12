package com.services.request.navWebApp.createCart.guest;

public class CreateCartGuestRequest {

    public String id;
    public Integer primaryStoreId;

    public CreateCartGuestRequest(String id, int primaryStoreId) {
        this.id = id;
        this.primaryStoreId = primaryStoreId;
    }
}
