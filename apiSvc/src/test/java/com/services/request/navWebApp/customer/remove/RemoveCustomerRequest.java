package com.services.request.navWebApp.customer.remove;

public class RemoveCustomerRequest {

    public String id;
    public String cartId;

    public RemoveCustomerRequest(String id, String cartId) {
        this.id = id;
        this.cartId = cartId;
    }


}
