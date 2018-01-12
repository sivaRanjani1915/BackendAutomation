package com.services.responses.timeSlots.addTimeSlot;

import java.util.ArrayList;
import java.util.List;

public class Meta {

	public Pagination pagination;
	public List<Object> errors = new ArrayList<>();

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public List<Object> getErrors() {
		return errors;
	}

	public void setErrors(List<Object> errors) {
		this.errors = errors;
	}
}
