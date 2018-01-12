package com.services.responses.navWebApp.cartResponse;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Meta {

    public Pagination pagination;
    public List<Error> errors = new ArrayList<>();
    @JsonIgnore
    public String removedItems;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public Error getError(int index) {
        return errors.get(index);
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

}
