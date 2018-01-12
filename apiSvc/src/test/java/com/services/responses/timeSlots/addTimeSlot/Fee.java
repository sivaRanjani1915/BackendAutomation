package com.services.responses.timeSlots.addTimeSlot;

public class Fee {

	public String id;
	public Object feeId;
	public String addedTimeStamp;
	public String upc;
	public String upcType;
	public String productId;
	public String feeName;
	public String feeDescription;
	public Integer feeQuantity;
	public Integer unitId;
	public Object imageUrl;
	public Prices__ prices;
	public PriceRules priceRules;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getFeeId() {
		return feeId;
	}

	public void setFeeId(Object feeId) {
		this.feeId = feeId;
	}

	public String getAddedTimeStamp() {
		return addedTimeStamp;
	}

	public void setAddedTimeStamp(String addedTimeStamp) {
		this.addedTimeStamp = addedTimeStamp;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getUpcType() {
		return upcType;
	}

	public void setUpcType(String upcType) {
		this.upcType = upcType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getFeeName() {
		return feeName;
	}

	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

	public String getFeeDescription() {
		return feeDescription;
	}

	public void setFeeDescription(String feeDescription) {
		this.feeDescription = feeDescription;
	}

	public Integer getFeeQuantity() {
		return feeQuantity;
	}

	public void setFeeQuantity(Integer feeQuantity) {
		this.feeQuantity = feeQuantity;
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public Object getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(Object imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Prices__ getPrices() {
		return prices;
	}

	public void setPrices(Prices__ prices) {
		this.prices = prices;
	}

	public PriceRules getPriceRules() {
		return priceRules;
	}

	public void setPriceRules(PriceRules priceRules) {
		this.priceRules = priceRules;
	}
}
