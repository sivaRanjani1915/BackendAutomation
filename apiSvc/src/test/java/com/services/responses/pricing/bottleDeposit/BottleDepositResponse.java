package com.services.responses.pricing.bottleDeposit;

import java.util.ArrayList;
import java.util.List;

public class BottleDepositResponse {

    public List<BottleDeposits> BottleDeposits = new ArrayList<>();

    public List<BottleDeposits> getBottleDeposits() {
        return BottleDeposits;
    }

    public BottleDeposits getBottleDeposit(int index) {
        return  BottleDeposits.get(index);
    }

    public void setBottleDeposits(List<BottleDeposits> BottleDeposits) {
        this.BottleDeposits = BottleDeposits;
    }
}
