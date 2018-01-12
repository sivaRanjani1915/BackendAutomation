package com.services.responses.timeSlots.addTimeSlot;

import java.util.ArrayList;
import java.util.List;

public class FulfillmentGroup {

	public String id;
	public Integer fulfillmentGroupTypeId;
	public Integer totalNumberOfItems;
	public Integer totalLineItems;
	public Prices_ prices;
	public List<Fee> fees = new ArrayList<>();
	public List<Item> items = new ArrayList<>();
	public Integer substitutionPreferenceId;
	public PickupSlot pickupSlot;
	public Integer pickupLocation;
	public Object vehicleDescription;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getFulfillmentGroupTypeId() {
		return fulfillmentGroupTypeId;
	}

	public void setFulfillmentGroupTypeId(Integer fulfillmentGroupTypeId) {
		this.fulfillmentGroupTypeId = fulfillmentGroupTypeId;
	}

	public Integer getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	public void setTotalNumberOfItems(Integer totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}

	public Integer getTotalLineItems() {
		return totalLineItems;
	}

	public void setTotalLineItems(Integer totalLineItems) {
		this.totalLineItems = totalLineItems;
	}

	public Prices_ getPrices() {
		return prices;
	}

	public void setPrices(Prices_ prices) {
		this.prices = prices;
	}

	public List<Fee> getFees() {
		return fees;
	}

	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Integer getSubstitutionPreferenceId() {
		return substitutionPreferenceId;
	}

	public void setSubstitutionPreferenceId(Integer substitutionPreferenceId) {
		this.substitutionPreferenceId = substitutionPreferenceId;
	}

	public PickupSlot getPickupSlot() {
		return pickupSlot;
	}

	public void setPickupSlot(PickupSlot pickupSlot) {
		this.pickupSlot = pickupSlot;
	}

	public Integer getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(Integer pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public Object getVehicleDescription() {
		return vehicleDescription;
	}

	public void setVehicleDescription(Object vehicleDescription) {
		this.vehicleDescription = vehicleDescription;
	}
}
