package com.services.request.navWebApp.createCart.signIn;

import java.util.ArrayList;
import java.util.List;

public class CreateCartBaseRequest {

    public List<CreateCartRequest> createCartRequests;

    public CreateCartBaseRequest(CreateCartRequest request) {
        createCartRequests = new ArrayList<>();
        createCartRequests.add(request);
    }
}
