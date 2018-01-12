package com.services.responses.timeSlots.addTimeSlot;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	public String id;
	public String cartId;
	public Integer collisionDetectionVersion;
	public String createdDate;
	public String updatedDate;
	public Object submittedDate;
	public Object orderNumber;
	public Integer storeId;
	public Integer totalNumberOfItems;
	public Customer customer;
	public Prices prices;
	public List<FulfillmentGroup> fulfillmentGroups = new ArrayList<>();
	public List<Object> offers = new ArrayList<>();
	public Payment payment;
	public Object customerComment;
	public String ueCalcState;
	public Integer lineItemCount;
	public Boolean hasAlcohol;
	public Boolean isTemporary;
	public Object isHomeDelivery;
	public Boolean cartHomeDeliveryEligible;
	public Object homeDeliveryInfo;
	public Boolean productsHomeDeliveryEligible;
	public Object zipCodeHomeDeliveryEligible;
	public List<Object> pickupSlotHold = new ArrayList<>();
	public Boolean isQuickTrip;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Integer getCollisionDetectionVersion() {
		return collisionDetectionVersion;
	}

	public void setCollisionDetectionVersion(Integer collisionDetectionVersion) {
		this.collisionDetectionVersion = collisionDetectionVersion;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Object getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(Object submittedDate) {
		this.submittedDate = submittedDate;
	}

	public Object getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Object orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	public void setTotalNumberOfItems(Integer totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Prices getPrices() {
		return prices;
	}

	public void setPrices(Prices prices) {
		this.prices = prices;
	}

	public List<FulfillmentGroup> getFulfillmentGroups() {
		return fulfillmentGroups;
	}

	public void setFulfillmentGroups(List<FulfillmentGroup> fulfillmentGroups) {
		this.fulfillmentGroups = fulfillmentGroups;
	}

	public List<Object> getOffers() {
		return offers;
	}

	public void setOffers(List<Object> offers) {
		this.offers = offers;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Object getCustomerComment() {
		return customerComment;
	}

	public void setCustomerComment(Object customerComment) {
		this.customerComment = customerComment;
	}

	public String getUeCalcState() {
		return ueCalcState;
	}

	public void setUeCalcState(String ueCalcState) {
		this.ueCalcState = ueCalcState;
	}

	public Integer getLineItemCount() {
		return lineItemCount;
	}

	public void setLineItemCount(Integer lineItemCount) {
		this.lineItemCount = lineItemCount;
	}

	public Boolean getHasAlcohol() {
		return hasAlcohol;
	}

	public void setHasAlcohol(Boolean hasAlcohol) {
		this.hasAlcohol = hasAlcohol;
	}

	public Boolean getTemporary() {
		return isTemporary;
	}

	public void setTemporary(Boolean temporary) {
		isTemporary = temporary;
	}

	public Object getIsHomeDelivery() {
		return isHomeDelivery;
	}

	public void setIsHomeDelivery(Object isHomeDelivery) {
		this.isHomeDelivery = isHomeDelivery;
	}

	public Boolean getCartHomeDeliveryEligible() {
		return cartHomeDeliveryEligible;
	}

	public void setCartHomeDeliveryEligible(Boolean cartHomeDeliveryEligible) {
		this.cartHomeDeliveryEligible = cartHomeDeliveryEligible;
	}

	public Object getHomeDeliveryInfo() {
		return homeDeliveryInfo;
	}

	public void setHomeDeliveryInfo(Object homeDeliveryInfo) {
		this.homeDeliveryInfo = homeDeliveryInfo;
	}

	public Boolean getProductsHomeDeliveryEligible() {
		return productsHomeDeliveryEligible;
	}

	public void setProductsHomeDeliveryEligible(Boolean productsHomeDeliveryEligible) {
		this.productsHomeDeliveryEligible = productsHomeDeliveryEligible;
	}

	public Object getZipCodeHomeDeliveryEligible() {
		return zipCodeHomeDeliveryEligible;
	}

	public void setZipCodeHomeDeliveryEligible(Object zipCodeHomeDeliveryEligible) {
		this.zipCodeHomeDeliveryEligible = zipCodeHomeDeliveryEligible;
	}

	public List<Object> getPickupSlotHold() {
		return pickupSlotHold;
	}

	public void setPickupSlotHold(List<Object> pickupSlotHold) {
		this.pickupSlotHold = pickupSlotHold;
	}

	public Boolean getQuickTrip() {
		return isQuickTrip;
	}

	public void setQuickTrip(Boolean quickTrip) {
		isQuickTrip = quickTrip;
	}
}
