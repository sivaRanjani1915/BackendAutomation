package com.automation.steps;

import com.automation.steps.serenity.TimeSlotReservationStepSerenity;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class TimeSlotReservationStepDefinition {

    private TimeSlotReservationStepSerenity timeSlotReservationStepSerenity = new TimeSlotReservationStepSerenity();

    /**
     * @param table , | storeId | slotType |
     */
    @When("user gets all available time slots by storeId, slotType")
    public void userGetsAllAvailableTimeSlots(DataTable table) {
        String storeId = null, slotType = null;

        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            storeId = map.get("storeId");
            slotType = map.get("slotType");
        }

        timeSlotReservationStepSerenity.userGetsAllAvailableTimeSlots(storeId, slotType);

    }

    /**
     * @param storeId  ,
     * @param slotType , 1 = Full Cart, 2 = SPO, 3 = 1+2, 4 = sameDay
     */
    @When("user gets all available time slots by storeId '(.*)', slotType '(.*)'")
    public void userGetsAllAvailableTimeSlots(String storeId, String slotType) {
        timeSlotReservationStepSerenity.userGetsAllAvailableTimeSlots(storeId, slotType);
    }

    /**
     *  It will then reserve the FIRST available pickup slot.
     *
     * @param placeHold , for Guest Token, 'placeHold' MUST == false
     */
    @Then("add pickup slot, placeHold '(.*)'")
    public void addPickUpSlot(Boolean placeHold) {
        timeSlotReservationStepSerenity.addPickUpSlot(placeHold);
    }

    /**
     *  Give the date and slot index you desire. Else leave empty.
     *  It will then reserve the FIRST available pickup slot.
     *
     * @param table ,
     *              | dateIndex | slotIndex | placeHold |
     */
    @Then("add pickup slot:")
    public void addPickUpSlot(DataTable table) {
        String dateIndex = null, slotIndex = null, placeHold = null;

        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            dateIndex = map.get("dateIndex");
            slotIndex = map.get("slotIndex");
            placeHold = map.get("placeHold");
        }
        timeSlotReservationStepSerenity.addPickUpSlot(dateIndex, slotIndex, placeHold);
    }

    @Then("remove pickup slot")
    public void removePickupSlot() {
        timeSlotReservationStepSerenity.removePickupSlot();
    }

}
