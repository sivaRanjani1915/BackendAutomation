package com.services.request.navWebApp.payment.add;

public class AddPaymentRequest {

    public String id;
    public Payment payment;
    public String cartId;

    public AddPaymentRequest(String id, String cartId, Payment payment) {
        this.id = id;
        this.payment = payment;
        this.cartId = cartId;
    }
}
