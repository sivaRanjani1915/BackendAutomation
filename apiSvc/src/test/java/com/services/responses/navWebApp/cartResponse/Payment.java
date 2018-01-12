
package com.services.responses.navWebApp.cartResponse;

public class Payment {

    public Object id;
    public Object threatMetrixDeviceFingerprint;
    public String firstName;
    public String lastName;
    public String addressLine1;
    public String addressLine2;
    public String city;
    public String state;
    public String zipCode;
    public String countryCode;
    public CreditCard creditCard;
    public String giftCards;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getThreatMetrixDeviceFingerprint() {
        return threatMetrixDeviceFingerprint;
    }

    public void setThreatMetrixDeviceFingerprint(Object threatMetrixDeviceFingerprint) {
        this.threatMetrixDeviceFingerprint = threatMetrixDeviceFingerprint;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getGiftCards() {
        return giftCards;
    }

    public void setGiftCards(String giftCards) {
        this.giftCards = giftCards;
    }

}
