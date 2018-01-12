package com.automation.steps;

import com.automation.steps.serenity.OrderBaseSvcStepSerenity;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

import java.util.Map;

public class OrderBaseSvcStepDefinition {

    private OrderBaseSvcStepSerenity orderBaseSvcStepSerenity = new OrderBaseSvcStepSerenity();

    /**
     * @param orderId , optional orderId param
     */
    @Then("get Order by Order Id '(.*)'")
    public void getOrderByOrderId(String orderId) {
        orderBaseSvcStepSerenity.getOrderByOrderId(orderId);
    }

    /**
     * @param orderId , optional orderId param
     */
    @Then("is Order Editable By Order Id '(.*)'")
    public void isOrderEditable(String orderId) {
        orderBaseSvcStepSerenity.isOrderEditable(orderId);
    }

    /**
     * @param orderId , optional orderId param
     */
    @Then("is Order cancellable By Order Id '(.*)'")
    public void isOrderCancellable(String orderId) {
        orderBaseSvcStepSerenity.isOrderCancellable(orderId);
    }

    /**
     * @param orderId , optional orderId param
     */
    @Then("cancel order '(.*)' by Order Id")
    public void cancelOrderByOrderId(String orderId) {
        orderBaseSvcStepSerenity.cancelOrderByOrderId(orderId);
    }

    /**
     * @param orderId , optional orderId param
     */
    @Then("get Order History Details by OrderId '(.*)'")
    public void getOrderHistoryDetailsByOrderId(String orderId) {
        orderBaseSvcStepSerenity.getOrderHistoryDetailsByOrderId(orderId);
    }

    /**
     * @param accountId , optional accountId param
     * @param isActive  ,  optional isActive param
     */
    @Then("get active '(.*)' Order Summary by AccountId '(.*)'")
    public void getOrderSummaryByAccountId(String isActive, String accountId) {
        orderBaseSvcStepSerenity.getOrderSummaryByAccountId(isActive, accountId);
    }

    /**
     * @param orderId , optional orderId param
     * @param table   ,
     *                | dateIndex | slotIndex |
     */
    @Then("Update editable order id '(.*)' pickup time")
    public void updateEditableOrderIdPickupTime(String orderId, DataTable table) {
        String dateIndex = null, slotIndex = null;
        orderBaseSvcStepSerenity.getAvailableTimeSlotsBasedOnOrderId();

        for (Map<String, String> map : table.asMaps(String.class, String.class)) {
            dateIndex = map.get("dateIndex");
            slotIndex = map.get("slotIndex");
        }
        orderBaseSvcStepSerenity.updateEditableOrderIdPickupTime(orderId, dateIndex, slotIndex);
    }

    /**
     * @param accountId , optional accountId
     */
    @Then("get all Active Orders Info By Account Id '(.*)'")
    public void getActiveOrderInfoByAccountId(String accountId) {
        orderBaseSvcStepSerenity.getActiveOrderInfoByAccountId(accountId);
    }

    /**
     * @param accountId , optional accountId
     */
    @Then("get all Editable Orders By Account Id '(.*)'")
    public void getAllEditableOrderByAccountId(String accountId) {
        orderBaseSvcStepSerenity.getAllEditableOrderByAccountId(accountId);
    }

}