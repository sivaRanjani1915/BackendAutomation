package com.services.request.order.isCancellable;

import java.util.ArrayList;
import java.util.List;

public class IsCancellableRequests {

    public List<IsCancellableRequestDetail> isCancellableRequests = new ArrayList<>();

    public IsCancellableRequests(IsCancellableRequestDetail isCancellableRequestDetail) {
        isCancellableRequests = new ArrayList<>();
        isCancellableRequests.add(isCancellableRequestDetail);
    }

}
