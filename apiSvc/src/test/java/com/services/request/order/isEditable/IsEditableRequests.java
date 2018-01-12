package com.services.request.order.isEditable;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class IsEditableRequests {

    @JsonProperty("isEditableRequests")
    private List<IsEditableRequestDetail> isEditableRequests = new ArrayList<>();


    public IsEditableRequests(IsEditableRequestDetail isEditableRequestDetail) {
        isEditableRequests = new ArrayList<>();
        isEditableRequests.add(isEditableRequestDetail);
    }

}
