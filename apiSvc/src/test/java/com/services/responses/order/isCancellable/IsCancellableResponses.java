package com.services.responses.order.isCancellable;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class IsCancellableResponses {

    public static IsCancellableResponses isCancellableResponse;

    @JsonProperty("isCancellableResponses")
    public List<IsCancellableResponseDetail> isCancellableResponses = new ArrayList<>();

    public List<IsCancellableResponseDetail> isCancellableResponses() {
        return isCancellableResponses;
    }

    public IsCancellableResponseDetail getIsCancellableResponseInfo() {
        return isCancellableResponses.isEmpty() ? null : isCancellableResponses.get(0);
    }

}
