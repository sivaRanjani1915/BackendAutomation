package com.services.request.navWebApp.shipping.add;

public class ShippingAddress {
    public String id;
    public String firstName;
    public String lastName;
    public String email;
    public String addressLine1;
    public String addressLine2;
    public String city;
    public String state;
    public String zipCode;
    public String countryCode;
    public String companyName;

    public ShippingAddress(String firstName, String lastName, String email, String address,
                           String city, String state, String zipCode, String countryCode) {

        this.id = "1";
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressLine1 = address;
        this.addressLine2 = "";
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.countryCode = countryCode;
        this.companyName = "";
    }
}
