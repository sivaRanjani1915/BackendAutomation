package com.services.responses.order.isCancellable;

import java.util.List;

public class IsCancellableResponseDetail {

    public static IsCancellableResponseDetail isCancellableResponseDetail;

    public String id;
    public Boolean isCancellable;
    public List<FulfillmentGroupType> fulfillmentGroups;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getCancellable() {
        return isCancellable;
    }

    public void setCancellable(Boolean cancellable) {
        isCancellable = cancellable;
    }

    public List<FulfillmentGroupType> getFulfillmentGroups() {
        return fulfillmentGroups;
    }

    public FulfillmentGroupType getFulfillmentGroupsInfo() {
        return fulfillmentGroups.get(0);
    }

    public void setFulfillmentGroups(List<FulfillmentGroupType> fulfillmentGroups) {
        this.fulfillmentGroups = fulfillmentGroups;
    }
}
