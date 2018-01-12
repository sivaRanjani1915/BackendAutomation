package com.services.responses.search.productSearch;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class SearchResponse {

    private Meta meta;
    private List<Upc> upcs = new ArrayList<>();
    @JsonIgnore
    public String linked;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Upc> getUpcs() {
        return upcs;
    }

    public Upc getUpc(int index) {
        return upcs.get(index);
    }

    public void setUpcs(List<Upc> upcs) {
        this.upcs = upcs;
    }

    public String getLinked() {
        return linked;
    }

    public void setLinked(String linked) {
        this.linked = linked;
    }
}
