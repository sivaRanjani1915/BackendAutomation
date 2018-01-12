package com.services.request.navWebApp.createCart.guest;

import java.util.ArrayList;
import java.util.List;

public class CreateCartGuestBaseRequest {

    public List<CreateCartGuestRequest> createCartRequests;

    public CreateCartGuestBaseRequest(CreateCartGuestRequest request) {
        createCartRequests = new ArrayList<>();
        createCartRequests.add(request);
    }
}
