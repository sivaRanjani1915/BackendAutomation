package com.services.request.navWebApp.payment.add;

public class Payment {

    public CreditCard creditCard;
    public String id;
    public String lastName;
    public String threatMetrixDeviceFingerprint;
    public String email;
    public String zipCode;
    public String state;
    public String countryCode;
    public String firstName;
    public String addressLine1;
    public String city;

    public Payment(String id, String firstName, String lastName, CreditCard creditCard) {

        this.creditCard = creditCard;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.threatMetrixDeviceFingerprint = "fingerprint";
        this.zipCode = "45209";
        this.state = "OH";
        this.countryCode = "USA";
        this.addressLine1 = "3874 Paxton Ave";
        this.city = "Cincinnati";
    }

}
