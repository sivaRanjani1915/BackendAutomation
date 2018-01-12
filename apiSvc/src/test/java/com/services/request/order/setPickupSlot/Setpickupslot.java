package com.services.request.order.setPickupSlot;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Setpickupslot {

    @JsonProperty("id")
    private String id;
    @JsonProperty("date")
    private String date;
    @JsonProperty("startTime")
    private String startTime;
    @JsonProperty("transactionId")
    private String transactionId;

    public Setpickupslot(String id, String date, String startTime, String transactionId) {
        this.id = id;
        this.date = date;
        this.startTime = startTime;
        this.transactionId = transactionId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
