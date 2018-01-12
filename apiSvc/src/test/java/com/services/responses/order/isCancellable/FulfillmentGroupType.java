package com.services.responses.order.isCancellable;

public class FulfillmentGroupType {

    public String id;
    public int fulfillmentChannelTypeId;
    public Boolean isCancellable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFulfillmentChannelTypeId() {
        return fulfillmentChannelTypeId;
    }

    public void setFulfillmentChannelTypeId(int fulfillmentChannelTypeId) {
        this.fulfillmentChannelTypeId = fulfillmentChannelTypeId;
    }

    public Boolean getCancellable() {
        return isCancellable;
    }

    public void setCancellable(Boolean cancellable) {
        isCancellable = cancellable;
    }
}
