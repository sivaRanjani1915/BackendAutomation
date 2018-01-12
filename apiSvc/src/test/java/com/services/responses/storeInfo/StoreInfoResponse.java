package com.services.responses.storeInfo;

import java.util.ArrayList;
import java.util.List;

public class StoreInfoResponse {

    public List<Store> store = new ArrayList<>();

    public List<Store> getStores() {
        return store;
    }

    public Store getStore(int index) {
        return store.get(index);
    }

    public void setStore(List<Store> store) {
        this.store = store;
    }
}
