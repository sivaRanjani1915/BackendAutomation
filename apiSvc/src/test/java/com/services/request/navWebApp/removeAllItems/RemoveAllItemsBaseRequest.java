package com.services.request.navWebApp.removeAllItems;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllItemsBaseRequest {

    public List<RemoveAllItemsRequest> removeAllItemsRequest;

    public RemoveAllItemsBaseRequest(RemoveAllItemsRequest removeAllItems) {
        removeAllItemsRequest = new ArrayList<>();
        removeAllItemsRequest.add(removeAllItems);

    }
}
