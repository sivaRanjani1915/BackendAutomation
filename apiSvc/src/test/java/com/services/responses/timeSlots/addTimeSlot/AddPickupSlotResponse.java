package com.services.responses.timeSlots.addTimeSlot;

import java.util.ArrayList;
import java.util.List;

public class AddPickupSlotResponse {
	public Meta meta;
	public List<Cart> carts = new ArrayList<>();

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
}
