package com.services.request.navWebApp.shipping.add;

public class ShippingInfo {

    public String id;
    public String deliveryMethod;
    public String minDeliveryDate;
    public String maxDeliveryDate;
    public ShippingAddress shippingAddress;


    public ShippingInfo(String deliveryMethod, String minDeliveryDate, String maxDeliveryDate, ShippingAddress shippingAddress) {

        this.id = "1";
        this.deliveryMethod = deliveryMethod;
        this.minDeliveryDate = minDeliveryDate;
        this.maxDeliveryDate = maxDeliveryDate;
        this.shippingAddress = shippingAddress;
    }
}
