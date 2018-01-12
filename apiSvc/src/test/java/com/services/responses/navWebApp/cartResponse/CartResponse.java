package com.services.responses.navWebApp.cartResponse;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class CartResponse {

    public Meta meta;
    public List<Cart> carts = new ArrayList<>();
    public String message;
    public String exceptionMessage;
    public String exceptionType;
    public String stackTrace;

    @JsonIgnore
    public String error;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public Cart getCart(int index) {
        return carts.get(index);
    }

    public Cart getCartInfo() {
        return carts.isEmpty() ? null : carts.get(0);
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }
}
