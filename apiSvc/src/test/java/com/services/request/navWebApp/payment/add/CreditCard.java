package com.services.request.navWebApp.payment.add;

public class CreditCard {

    public String securityCode;
    public Object id;
    public String expirationDate;
    public String cardType;
    public String cardNumber;

    public CreditCard addVisa() {
        this.securityCode = "222";
        this.id = "2";
        this.expirationDate = "12/18";
        this.cardType = "VISA";
        this.cardNumber = "4055060000000000";
        return this;
    }

    public CreditCard addMasterCart() {
        this.securityCode = "222";
        this.id = "3";
        this.expirationDate = "12/18";
        this.cardType = "MASTER CARD";
        this.cardNumber = "5444009999222205";
        return this;
    }

    public CreditCard addAmax() {
        this.securityCode = "1154";
        this.id = "5";
        this.expirationDate = "12/18";
        this.cardType = "AMEX";
        this.cardNumber = "341111597242000";
        return this;
    }

}
