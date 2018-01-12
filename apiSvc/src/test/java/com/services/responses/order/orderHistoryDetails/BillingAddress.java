package com.services.responses.order.orderHistoryDetails;

public class BillingAddress {

    public String billingStreetAddress1;
    public String billingStreetAddress2;
    public String billingCity;
    public String billingState;
    public String billingZipCode;

    public String getBillingStreetAddress1() {
        return billingStreetAddress1;
    }

    public void setBillingStreetAddress1(String billingStreetAddress1) {
        this.billingStreetAddress1 = billingStreetAddress1;
    }

    public String getBillingStreetAddress2() {
        return billingStreetAddress2;
    }

    public void setBillingStreetAddress2(String billingStreetAddress2) {
        this.billingStreetAddress2 = billingStreetAddress2;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZipCode() {
        return billingZipCode;
    }

    public void setBillingZipCode(String billingZipCode) {
        this.billingZipCode = billingZipCode;
    }
}
