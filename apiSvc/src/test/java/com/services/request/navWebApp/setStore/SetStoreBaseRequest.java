package com.services.request.navWebApp.setStore;

import java.util.ArrayList;
import java.util.List;

public class SetStoreBaseRequest {

    public List<SetStoreRequest> setStoreRequests;

    public SetStoreBaseRequest(SetStoreRequest request) {
        setStoreRequests = new ArrayList<>();
        setStoreRequests.add(request);
    }
}
