package com.services.responses.order.orderHistoryDetails;

import java.util.ArrayList;
import java.util.List;

public class OrderHistoryDetail {

    public String id;
    public String orderNumber;
    public Boolean isCancellable;
    public Boolean isEditable;
    public Boolean isTimeslotEditable;
    public Boolean isSameDay;
    public List<Item> items = new ArrayList<>();
    public String pickupSlotDate;
    public String pickupSlotStartTime;
    public String orderStatus;
    public String cAndCStatus;
    public String sthStatus;
    public String spoStatus;
    public Integer pickupLocation;
    public String carDescription;
    public Integer storeId;
    public StoreAddress storeAddress;
    public ShippingInfo shippingInfo;
    public String customerName;
    public BillingAddress billingAddress;
    public String ccInfo;
    public String orderSubtotal;
    public String cAndCSubtotal;
    public String cAndCEstimatedTax;
    public String cAndCEstimatedTotal;
    public String cAndCPromotions;
    public String spoSubtotal;
    public String spoEstimatedTax;
    public String spoPromotions;
    public String spoEstimatedTotal;
    public String sthSubtotal;
    public String sthEstimatedTax;
    public String sthPromotions;
    public String estimatedShipping;
    public String sthEstimatedTotal;
    public String orderSavings;
    public String teamMemberDiscount;
    public String fees;
    public String feePromotions;
    public String orderLevelPromotions;
    public String promoSubTotal;
    public String estimatedTax;
    public Float numberOfItems;
    public String orderTotal;
    public String totalSavings;
    public String totalDeposit;
    public String submittedDate;
    public Boolean isActive;
    public Integer orderTypeId;
    public PickupSlot pickupSlot;
    public String subPreference;
    public String transactionId;
    public Boolean isHomeDelivery;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Boolean getCancellable() {
        return isCancellable;
    }

    public void setCancellable(Boolean cancellable) {
        isCancellable = cancellable;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setEditable(Boolean editable) {
        isEditable = editable;
    }

    public Boolean getIsTimeslotEditable() {
        return isTimeslotEditable;
    }

    public void setTimeslotEditable(Boolean timeslotEditable) {
        isTimeslotEditable = timeslotEditable;
    }

    public Boolean getSameDay() {
        return isSameDay;
    }

    public void setSameDay(Boolean sameDay) {
        isSameDay = sameDay;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getPickupSlotDate() {
        return pickupSlotDate;
    }

    public void setPickupSlotDate(String pickupSlotDate) {
        this.pickupSlotDate = pickupSlotDate;
    }

    public String getPickupSlotStartTime() {
        return pickupSlotStartTime;
    }

    public void setPickupSlotStartTime(String pickupSlotStartTime) {
        this.pickupSlotStartTime = pickupSlotStartTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getcAndCStatus() {
        return cAndCStatus;
    }

    public void setcAndCStatus(String cAndCStatus) {
        this.cAndCStatus = cAndCStatus;
    }

    public String getSthStatus() {
        return sthStatus;
    }

    public void setSthStatus(String sthStatus) {
        this.sthStatus = sthStatus;
    }

    public String getSpoStatus() {
        return spoStatus;
    }

    public void setSpoStatus(String spoStatus) {
        this.spoStatus = spoStatus;
    }

    public Integer getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Integer pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public StoreAddress getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(StoreAddress storeAddress) {
        this.storeAddress = storeAddress;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getCcInfo() {
        return ccInfo;
    }

    public void setCcInfo(String ccInfo) {
        this.ccInfo = ccInfo;
    }

    public String getOrderSubtotal() {
        return orderSubtotal;
    }

    public void setOrderSubtotal(String orderSubtotal) {
        this.orderSubtotal = orderSubtotal;
    }

    public String getcAndCSubtotal() {
        return cAndCSubtotal;
    }

    public void setcAndCSubtotal(String cAndCSubtotal) {
        this.cAndCSubtotal = cAndCSubtotal;
    }

    public String getcAndCEstimatedTax() {
        return cAndCEstimatedTax;
    }

    public void setcAndCEstimatedTax(String cAndCEstimatedTax) {
        this.cAndCEstimatedTax = cAndCEstimatedTax;
    }

    public String getcAndCEstimatedTotal() {
        return cAndCEstimatedTotal;
    }

    public void setcAndCEstimatedTotal(String cAndCEstimatedTotal) {
        this.cAndCEstimatedTotal = cAndCEstimatedTotal;
    }

    public String getcAndCPromotions() {
        return cAndCPromotions;
    }

    public void setcAndCPromotions(String cAndCPromotions) {
        this.cAndCPromotions = cAndCPromotions;
    }

    public String getSpoSubtotal() {
        return spoSubtotal;
    }

    public void setSpoSubtotal(String spoSubtotal) {
        this.spoSubtotal = spoSubtotal;
    }

    public String getSpoEstimatedTax() {
        return spoEstimatedTax;
    }

    public void setSpoEstimatedTax(String spoEstimatedTax) {
        this.spoEstimatedTax = spoEstimatedTax;
    }

    public String getSpoPromotions() {
        return spoPromotions;
    }

    public void setSpoPromotions(String spoPromotions) {
        this.spoPromotions = spoPromotions;
    }

    public String getSpoEstimatedTotal() {
        return spoEstimatedTotal;
    }

    public void setSpoEstimatedTotal(String spoEstimatedTotal) {
        this.spoEstimatedTotal = spoEstimatedTotal;
    }

    public String getSthSubtotal() {
        return sthSubtotal;
    }

    public void setSthSubtotal(String sthSubtotal) {
        this.sthSubtotal = sthSubtotal;
    }

    public String getSthEstimatedTax() {
        return sthEstimatedTax;
    }

    public void setSthEstimatedTax(String sthEstimatedTax) {
        this.sthEstimatedTax = sthEstimatedTax;
    }

    public String getSthPromotions() {
        return sthPromotions;
    }

    public void setSthPromotions(String sthPromotions) {
        this.sthPromotions = sthPromotions;
    }

    public String getEstimatedShipping() {
        return estimatedShipping;
    }

    public void setEstimatedShipping(String estimatedShipping) {
        this.estimatedShipping = estimatedShipping;
    }

    public String getSthEstimatedTotal() {
        return sthEstimatedTotal;
    }

    public void setSthEstimatedTotal(String sthEstimatedTotal) {
        this.sthEstimatedTotal = sthEstimatedTotal;
    }

    public String getOrderSavings() {
        return orderSavings;
    }

    public void setOrderSavings(String orderSavings) {
        this.orderSavings = orderSavings;
    }

    public String getTeamMemberDiscount() {
        return teamMemberDiscount;
    }

    public void setTeamMemberDiscount(String teamMemberDiscount) {
        this.teamMemberDiscount = teamMemberDiscount;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getFeePromotions() {
        return feePromotions;
    }

    public void setFeePromotions(String feePromotions) {
        this.feePromotions = feePromotions;
    }

    public String getOrderLevelPromotions() {
        return orderLevelPromotions;
    }

    public void setOrderLevelPromotions(String orderLevelPromotions) {
        this.orderLevelPromotions = orderLevelPromotions;
    }

    public String getPromoSubTotal() {
        return promoSubTotal;
    }

    public void setPromoSubTotal(String promoSubTotal) {
        this.promoSubTotal = promoSubTotal;
    }

    public String getEstimatedTax() {
        return estimatedTax;
    }

    public void setEstimatedTax(String estimatedTax) {
        this.estimatedTax = estimatedTax;
    }

    public Float getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Float numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getTotalSavings() {
        return totalSavings;
    }

    public void setTotalSavings(String totalSavings) {
        this.totalSavings = totalSavings;
    }

    public String getTotalDeposit() {
        return totalDeposit;
    }

    public void setTotalDeposit(String totalDeposit) {
        this.totalDeposit = totalDeposit;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(Integer orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public PickupSlot getPickupSlot() {
        return pickupSlot;
    }

    public void setPickupSlot(PickupSlot pickupSlot) {
        this.pickupSlot = pickupSlot;
    }

    public String getSubPreference() {
        return subPreference;
    }

    public void setSubPreference(String subPreference) {
        this.subPreference = subPreference;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Boolean getHomeDelivery() {
        return isHomeDelivery;
    }

    public void setHomeDelivery(Boolean homeDelivery) {
        isHomeDelivery = homeDelivery;
    }
}
