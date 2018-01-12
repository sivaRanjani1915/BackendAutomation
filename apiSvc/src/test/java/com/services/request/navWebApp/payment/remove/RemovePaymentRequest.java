package com.services.request.navWebApp.payment.remove;

public class RemovePaymentRequest {

    public String id;
    public String cartId;

    public RemovePaymentRequest(String id, String cartId) {
        this.id = id;
        this.cartId = cartId;
    }
}
