package com.services.responses.order.editableOrders;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class EditableOrders {

    public static EditableOrders allEditableOrders;

    @JsonProperty("editableorders")
    private List<EditableOrder> editableOrders = new ArrayList<EditableOrder>();

    public List<EditableOrder> getEditableOrders() {
        return editableOrders;
    }

    public void setEditableOrders(List<EditableOrder> editableOrders) {
        this.editableOrders = editableOrders;
    }
}
