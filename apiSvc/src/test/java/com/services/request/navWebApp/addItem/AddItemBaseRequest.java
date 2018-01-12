package com.services.request.navWebApp.addItem;

import java.util.ArrayList;
import java.util.List;

public class AddItemBaseRequest {

    public List<AddItemRequest> addItemRequests = null;

    public AddItemBaseRequest(List<AddItemRequest> addItemRequest) {
        addItemRequests = new ArrayList<>();
        addItemRequests.addAll(addItemRequest);
    }
}
