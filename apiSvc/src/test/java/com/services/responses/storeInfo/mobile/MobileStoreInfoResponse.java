package com.services.responses.storeInfo.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobileStoreInfoResponse {

    public static MobileStoreInfoResponse mobileStoreInfoResponse;

    public List<StoreMobile> store = new ArrayList<>();

    public List<StoreMobile> getStores() {
        return store;
    }

    public StoreMobile getStore(int index) {
        return store.get(index);
    }

    public void setStore(List<StoreMobile> store) {
        this.store = store;
    }
}
