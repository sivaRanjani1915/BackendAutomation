package com.services.responses.order.isEditable;

public class IsEditableResponseDetail {

    public String id;
    public Boolean isEditable;
    public Boolean isTimeslotEditable;
    public Boolean isChangeable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Boolean editable) {
        isEditable = editable;
    }

    public Boolean getIsTimeslotEditable() {
        return isTimeslotEditable;
    }

    public void setIsTimeslotEditable(Boolean timeslotEditable) {
        isTimeslotEditable = timeslotEditable;
    }

    public Boolean getIsChangeable() {
        return isChangeable;
    }

    public void setIsChangeable(Boolean changeable) {
        isChangeable = changeable;
    }
}
