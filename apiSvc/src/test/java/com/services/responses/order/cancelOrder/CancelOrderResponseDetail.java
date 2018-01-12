package com.services.responses.order.cancelOrder;

public class CancelOrderResponseDetail {

    public String id;
    public String orderId;
    public String cancelResult;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCancelResult() {
        return cancelResult;
    }

    public void setCancelResult(String cancelResult) {
        this.cancelResult = cancelResult;
    }
}
