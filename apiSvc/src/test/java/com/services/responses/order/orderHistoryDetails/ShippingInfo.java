package com.services.responses.order.orderHistoryDetails;

public class ShippingInfo {

    public Object trackingNumber;
    public String shippingMethod;
    public String etaMin;
    public String etaMax;
    public String streetAddressLine1;
    public String streetAddressLine2;
    public String city;
    public String state;
    public String zipCode;

    public Object getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Object trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getEtaMin() {
        return etaMin;
    }

    public void setEtaMin(String etaMin) {
        this.etaMin = etaMin;
    }

    public String getEtaMax() {
        return etaMax;
    }

    public void setEtaMax(String etaMax) {
        this.etaMax = etaMax;
    }

    public String getStreetAddressLine1() {
        return streetAddressLine1;
    }

    public void setStreetAddressLine1(String streetAddressLine1) {
        this.streetAddressLine1 = streetAddressLine1;
    }

    public String getStreetAddressLine2() {
        return streetAddressLine2;
    }

    public void setStreetAddressLine2(String streetAddressLine2) {
        this.streetAddressLine2 = streetAddressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
