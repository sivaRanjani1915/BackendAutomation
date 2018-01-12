package com.services.baseLayerUtils;

import com.services.ApiConfig;
import com.services.responses.order.activeOrderInfo.ActiveOrder;
import com.services.responses.order.activeOrderInfo.ActiveOrderInfo;
import com.services.responses.order.editableOrders.EditableOrder;
import com.services.responses.order.isEditable.IsEditableResponseDetail;
import com.services.responses.order.orderHistorySummaries.OrderSummary;

import static com.services.RestAssuredConfigurations.*;
import static com.services.responses.order.activeOrderInfo.ActiveOrderInfoResponse.activeOrderInfoResponse;
import static com.services.responses.order.editableOrders.EditableOrders.allEditableOrders;
import static com.services.responses.order.isEditable.IsEditableResponses.isEditableResponse;
import static com.services.responses.order.orderHistoryDetails.OrderHistoryDetailsResponse.orderHistoryDetailsResponse;
import static com.services.responses.order.orderHistorySummaries.OrderSummariesDetail.orderSummariesDetail;

public class OrderBaseUtils {


    //TODO: find better solution for convertOrderBaseToNavWebAppSvc();
    public static String convertOrderBaseToNavWebAppSvc(String BASE_PATH) {
        return (BASE_PATH.replace(ApiConfig.ORDER_BASE_SVC, ApiConfig.NAV_WEB_APP_SVC));
    }


    public static String getValidOrderId(String orderId) {
        if (isNullOrOptional(orderId)) {

            if (cartResponse != null) { // get From Cart Response
                orderId = cartResponse.getCartInfo().getOrderNumber();

            } else if (orderHistoryDetailsResponse != null) { // Get From OrderHistoryDetails
                orderId = orderHistoryDetailsResponse.getOrderHistoryDetailsInfo().getOrderNumber();

            } else if (orderSummariesDetail != null) { // Get From OrderSummariesDetail Response
                for (OrderSummary orderSummary : orderSummariesDetail.getOrderSummaries()) {
                    orderId = orderSummary.getId();
                    if (orderSummary.getIsActive() && orderSummary.getIsEditable()) {
                        break;
                    }
                }

            } else if (isEditableResponse != null) { // Get from IsEditableResponse
                for (IsEditableResponseDetail isEditable : isEditableResponse.getIsEditableResponses()) {
                    orderId = isEditable.getId();
                    if (isEditable.getIsTimeslotEditable() && isEditable.getIsChangeable() && isEditable.getIsEditable())
                        break;
                }

            } else if (activeOrderInfoResponse != null) {
                for (ActiveOrderInfo activeOrderInfo : activeOrderInfoResponse.getActiveOrderInfo()) {
                    ActiveOrder activeOrder = activeOrderInfo.getActiveOrder();
                    orderId = activeOrder.getOrderId();
                    if (activeOrder.getIsEditable()) {
                        break;
                    }
                }
            } else if (allEditableOrders != null) {
                for (EditableOrder editableOrder : allEditableOrders.getEditableOrders()) {
                    orderId = editableOrder.getId();
                }
            }
        }
        return orderId;
    }

    public static String getValidAccountId(String accountId) {

        if (isNullOrOptional(accountId)) {
            if (accessTokenPojo != null) {
                accountId = accessTokenPojo.getDigitalId();
            } else if (cartResponse != null) {
                accountId = String.valueOf(cartResponse.getCartInfo().getCustomer().getAccountID());
            }
        }

        return accountId;
    }

    public static String getValidCartId(String cartId) {
        if (orderHistoryDetailsResponse != null) {
            cartId = orderHistoryDetailsResponse.getOrderHistoryDetailsInfo().getTransactionId();
        }
        return cartId;
    }

}
