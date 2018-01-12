package com.services.responses.order.isEditable;

import java.util.ArrayList;
import java.util.List;

public class IsEditableResponses {

    public static IsEditableResponses isEditableResponse;

    public List<IsEditableResponseDetail> isEditableResponses = new ArrayList<>();

    public List<IsEditableResponseDetail> getIsEditableResponses() {
        return isEditableResponses;
    }

    public IsEditableResponseDetail getIsEditableResponseInfo() {
        return isEditableResponses.isEmpty() ? null : isEditableResponses.get(0);
    }

    public void setIsEditableResponses(List<IsEditableResponseDetail> isEditableResponses) {
        this.isEditableResponses = isEditableResponses;
    }
}
