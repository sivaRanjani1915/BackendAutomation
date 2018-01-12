package com.services.request.navWebApp.createCart.signIn;

public class CreateCartRequest {

    public String id;
    public String accountID;
    public String firstName;
    public String lastName;
    public String email;
    public String customerPostalCode;
    public Integer primaryStoreId;
    public String areaCode;
    public String phoneNumber;

    public CreateCartRequest(String id, String accountId, String firstName, String lastName, String email,
                             String customerPostalCode, int primaryStoreId, String areaCode, String phoneNumber) {
        this.id = id;
        this.accountID = accountId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.customerPostalCode = customerPostalCode;
        this.primaryStoreId = primaryStoreId;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }
}
