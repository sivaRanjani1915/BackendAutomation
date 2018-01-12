package com.services.request.order.isCancellable;

public class IsCancellableRequestDetail {

    public String id;
    public int ruleSet;

    public IsCancellableRequestDetail(String id, int ruleSet) {
        this.id = id;
        this.ruleSet = ruleSet;
    }
}
