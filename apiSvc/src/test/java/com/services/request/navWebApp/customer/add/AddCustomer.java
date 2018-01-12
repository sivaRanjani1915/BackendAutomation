package com.services.request.navWebApp.customer.add;

public class AddCustomer {

    public String id;
    public String accountID;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String areaCode;
    public String email;
    public String primaryStoreId;

    public AddCustomer(String accountID, String firstName, String lastName, String areaCode,
                       String phoneNumber, String email) {
        this.id = "1";
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.primaryStoreId = "158";
    }

    public AddCustomer(String accountID, String firstName, String lastName, String areaCode,
                       String phoneNumber, String email, String primaryStoreId) {
        this.id = "1";
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.primaryStoreId = primaryStoreId;
    }

}
