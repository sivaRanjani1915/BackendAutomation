package com.services.request.navWebApp.submitOrder;

public class SubmitOrder {

    public String id;
    public String cartId;
    public String CVV;
    public String clientAddress;
    public String deviceFingerprint;
    public Boolean requireNonSthPayment;

    public SubmitOrder(String cartId) {

        this.id = "1";
        this.cartId = cartId;
        this.CVV = "222";
        this.clientAddress = "127.0.0.1";
        this.deviceFingerprint = "fingerprint";
        this.requireNonSthPayment = false;

    }
}
