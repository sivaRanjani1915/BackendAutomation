package com.services.request.navWebApp.shipping.add;

public class AddShippingRequest {

    public String id;
    public String cartId;
    public ShippingInfo shippingInfo;

    public AddShippingRequest(String cartId, ShippingInfo shippingInfo) {
        this.id = "1";
        this.cartId = cartId;
        this.shippingInfo = shippingInfo;
    }
}
