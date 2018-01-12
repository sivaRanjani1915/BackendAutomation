package com.services.request.navWebApp.customer.add;

public class AddCustomerRequest {

    public String id;
    public String cartId;
    public AddCustomer customer;

    public AddCustomerRequest(String id, String cartId, AddCustomer customer) {
        this.id = id;
        this.cartId = cartId;
        this.customer = customer;
    }

}
