package com.services.request.order.cancelOrder;

public class CancelOrderRequestDetail {

    public String id;
    public String orderId;

    public CancelOrderRequestDetail(String id, String orderId) {
        this.id = id;
        this.orderId = orderId;
    }
}
