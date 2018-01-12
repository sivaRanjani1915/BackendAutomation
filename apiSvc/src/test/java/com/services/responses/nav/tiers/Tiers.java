package com.services.responses.nav.tiers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Tiers {

    public static Tiers tiersResponse;

    @JsonProperty("tiers")
    List<Tier> tiers;

    @JsonIgnore
    private Linked linked;



    public List<Tier> getTiers() {
        return tiers;
    }

    public void setTiers(List<Tier> tiers) {
        this.tiers = tiers;
    }

    @Override
    public String toString() {
        return "Tiers{" +
                "tiers=" + tiers +
                '}';
    }

    public Linked getLinked() {
        return linked;
    }

    public void setLinked(Linked linked) {
        this.linked = linked;
    }


}
