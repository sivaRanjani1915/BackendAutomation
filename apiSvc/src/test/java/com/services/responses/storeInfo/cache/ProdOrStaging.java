package com.services.responses.storeInfo.cache;

import com.services.responses.storeInfo.Store;

import java.util.ArrayList;
import java.util.List;

public class ProdOrStaging {

    private List<Store> store = new ArrayList<>();

    public List<Store> getStore() {
        return store;
    }

    public void setStore(List<Store> store) {
        this.store = store;
    }
}
