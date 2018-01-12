package com.services.responses.navWebApp.cartResponse;


public class CreditCard {

    public Object id;
    public Object accountCardId;
    public String cardType;
    public String cardNumber;
    public String expirationDate;
    public Float paymentAmount;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getAccountCardId() {
        return accountCardId;
    }

    public void setAccountCardId(Object accountCardId) {
        this.accountCardId = accountCardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Float getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
