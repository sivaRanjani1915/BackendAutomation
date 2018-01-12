package com.automation.steps.serenity;

import com.services.ApiConfig;
import com.services.baseLayerUtils.OrderBaseUtils;
import com.services.request.order.cancelOrder.CancelOrderRequestDetail;
import com.services.request.order.cancelOrder.CancelOrderRequests;
import com.services.request.order.isCancellable.IsCancellableRequestDetail;
import com.services.request.order.isCancellable.IsCancellableRequests;
import com.services.request.order.isEditable.IsEditableRequestDetail;
import com.services.request.order.isEditable.IsEditableRequests;
import com.services.request.order.setPickupSlot.SetPickupSlotRequests;
import com.services.request.order.setPickupSlot.Setpickupslot;
import com.services.responses.order.activeOrderInfo.ActiveOrderInfoResponse;
import com.services.responses.order.cancelOrder.CancelOrderResponseDetail;
import com.services.responses.order.cancelOrder.CancelOrderResponses;
import com.services.responses.order.editableOrders.EditableOrders;
import com.services.responses.order.isCancellable.IsCancellableResponses;
import com.services.responses.order.isEditable.IsEditableResponseDetail;
import com.services.responses.order.isEditable.IsEditableResponses;
import com.services.responses.order.orderHistoryDetails.OrderHistoryDetail;
import com.services.responses.order.orderHistoryDetails.OrderHistoryDetailsResponse;
import com.services.responses.order.orderHistorySummaries.OrderSummariesDetail;
import com.services.responses.timeSlots.getReservationSlots.GetSlotReservationResponse;
import com.services.responses.timeSlots.getReservationSlots.ReservationSlot;
import com.services.responses.timeSlots.getReservationSlots.Schedule;
import com.automation.utils.HeadersQueryMapBuilder;
import com.automation.utils.PathParamsMapBuilder;
import com.automation.utils.QueryParamsMapBuilder;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

import static com.services.RestAssuredConfigurations.*;

public class OrderBaseSvcStepSerenity extends SerenityRest {

    private TimeSlotReservationStepSerenity timeSlotReservationStepSerenity = new TimeSlotReservationStepSerenity();

    private String BASE_PATH = ApiConfig.MEIJER_SERVICES_URL + getBaseLayerURL(ApiConfig.ORDER_BASE_SVC) + getTestEnvironment();


    public void getOrderByOrderId(String orderId) {

        if (isNullOrOptional(orderId)) {
            orderId = cartResponse.getCartInfo().getOrderNumber();
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.ORDER_ACCEPT);

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addOrderId(orderId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String getOrderURL = BASE_PATH + ApiConfig.ORDERS_SVC_CALL + ApiConfig.ORDER_ID_ENDPOINT;

        response = executeGetMethod(request, getOrderURL);
        printResponse(response);

        assertThis("getOrderByOrderId()", 200, response.getStatusCode());

    }

    public void isOrderEditable(String orderId) {
        IsEditableResponses.isEditableResponse = null;

        orderId = OrderBaseUtils.getValidOrderId(orderId);

        IsEditableRequestDetail isEditableRequestDetail = new IsEditableRequestDetail("1", orderId);

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.ORDER_IS_EDITABLE_CONTENT_TYPE)
                .addContentType(ApiConfig.ORDER_IS_EDITABLE_ACCEPT);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new IsEditableRequests(isEditableRequestDetail));

        String isOrderEditableURL = BASE_PATH + ApiConfig.ORDERS_SVC_CALL + ApiConfig.ORDER_IS_EDITABLE_ENDPOINT;

        response = executePostMethod(request, isOrderEditableURL);
        printResponse(response);

        assertThis("isOrderEditable()", 200, response.getStatusCode());

        IsEditableResponses.isEditableResponse = response.as(IsEditableResponses.class);

        IsEditableResponseDetail isEditableResponseDetail = null;

        if (IsEditableResponses.isEditableResponse != null) {
            isEditableResponseDetail = IsEditableResponses.isEditableResponse.getIsEditableResponseInfo();
            if (isEditableResponseDetail != null) {
                isEditableResponseDetail.getIsEditable();
            }
        }
    }

    public void isOrderCancellable(String orderId) {
        IsCancellableResponses.isCancellableResponse = null;

        orderId = OrderBaseUtils.getValidOrderId(orderId);

        IsCancellableRequestDetail isCancellableRequestDetail = new IsCancellableRequestDetail(orderId, 1);

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.ORDER_IS_CANCELLABLE_ACCEPT)
                .addContentType(ApiConfig.ORDER_IS_CANCELLABLE_CONTENT_TYPE);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new IsCancellableRequests(isCancellableRequestDetail));

        String isOrderCancellableURL = BASE_PATH + ApiConfig.ORDERS_SVC_CALL + ApiConfig.ORDER_IS_CANCELLABLE_ENDPOINT;

        response = executePostMethod(request, isOrderCancellableURL);
        printResponse(response);

        IsCancellableResponses.isCancellableResponse = response.as(IsCancellableResponses.class);

        assertThis("isOrderCancellable()", 200, response.getStatusCode());

    }

    public void cancelOrderByOrderId(String orderId) {
        CancelOrderResponses.cancelOrderResponse = null;

//        if (isNullOrOptional(orderId)) {
//            orderId = cartResponse.getCartInfo().getOrderNumber();
//        }
        orderId = OrderBaseUtils.getValidOrderId(orderId);

        CancelOrderRequestDetail cancelOrderRequestDetail = new CancelOrderRequestDetail("", orderId);

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CANCEL_ORDER_ACCEPT)
                .addContentType(ApiConfig.CANCEL_ORDER_CONTENT_TYPE);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new CancelOrderRequests(cancelOrderRequestDetail));

        String cancelOrderURL = OrderBaseUtils.convertOrderBaseToNavWebAppSvc(BASE_PATH)
                + ApiConfig.ORDERS_SVC_CALL + ApiConfig.CANCEL_ORDER_ENDPOINT;

        response = executePostMethod(request, cancelOrderURL);
        printResponse(response);

        assertThis("cancelOrderByOrderId()", 200, response.getStatusCode());

        String results = "FAIL";
        CancelOrderResponses.cancelOrderResponse = response.as(CancelOrderResponses.class);

        CancelOrderResponseDetail cancelOrderResponseDetail = CancelOrderResponses.cancelOrderResponse.getCancelOrderResponseInfo();
        if (cancelOrderResponseDetail != null) {
            results = cancelOrderResponseDetail.getCancelResult();
        }
//        assertThis("cancelOrderByOrderId()", "SUCCESS", results);
    }

    public void getOrderHistoryDetailsByOrderId(String orderId) {
        OrderHistoryDetailsResponse.orderHistoryDetailsResponse = null;

        orderId = OrderBaseUtils.getValidOrderId(orderId);

        headersQueryMapBuilder = new HeadersQueryMapBuilder().addAuthorization(getToken())
                .addAccept(ApiConfig.ORDER_HISTORY_DETAIL_ACCEPT)
                .addContentType(ApiConfig.ORDER_HISTORY_DETAIL_CONTENT_TYPE);

        queryParamsMapBuilder = new QueryParamsMapBuilder().addStore("158").addBillingZipCode("45209");

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addOrderId(orderId);

        request = givenConfig().headers(headersQueryMapBuilder.build())
                .queryParams(queryParamsMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String getOrderDetailsURL = OrderBaseUtils.convertOrderBaseToNavWebAppSvc(BASE_PATH) + ApiConfig.ORDER_SVC_CALL
                + ApiConfig.ORDER_HISTORY_DETAIL_ENDPOINT + ApiConfig.ORDER_ID_ENDPOINT;

        response = executeGetMethod(request, getOrderDetailsURL);
        printResponse(response);

        OrderHistoryDetailsResponse.orderHistoryDetailsResponse = response.as(OrderHistoryDetailsResponse.class);

        assertThis("getOrderHistoryDetailsByOrderId()", 200, response.getStatusCode());

    }

    public void getOrderSummaryByAccountId(String isActive, String accountId) {
        OrderSummariesDetail.orderSummariesDetail = null;

        accountId = OrderBaseUtils.getValidAccountId(accountId);

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.ORDER_HISTORY_SUMMARY_ACCEPT);

        queryParamsMapBuilder = new QueryParamsMapBuilder()
                .addSort("-overallcreate")
                .addChangeFromDate("01/01/2015");

        if (!isNullOrOptional(isActive)) {
            queryParamsMapBuilder.addActive(isActive);
        }

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addAccountId(accountId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .queryParams(queryParamsMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String getOrderSummaryURL = OrderBaseUtils.convertOrderBaseToNavWebAppSvc(BASE_PATH) + ApiConfig.ORDER_SVC_CALL
                + ApiConfig.ORDER_HISTORY_SUMMARY_ENDPOINT + ApiConfig.ACCOUNT_ID_ENDPOINT;

        response = executeGetMethod(request, getOrderSummaryURL);
        printResponse(response);

        OrderSummariesDetail.orderSummariesDetail = response.as(OrderSummariesDetail.class);

        assertThis("getOrderSummaryByAccountId()", 200, response.getStatusCode());

    }

    public void getAvailableTimeSlotsBasedOnOrderId() {
        if (OrderHistoryDetailsResponse.orderHistoryDetailsResponse != null) {
            OrderHistoryDetail orderHistoryDetail = OrderHistoryDetailsResponse.orderHistoryDetailsResponse.getOrderHistoryDetailsInfo();
            if (orderHistoryDetail != null) {
                if (orderHistoryDetail.getIsEditable() && orderHistoryDetail.getIsTimeslotEditable()) {
                    int storeId = orderHistoryDetail.getStoreId();
                    String slotType = "1";

                    timeSlotReservationStepSerenity.userGetsAllAvailableTimeSlots(String.valueOf(storeId), slotType);
                } else
                    assertFail("getAvailableTimeSlotsBasedOnOrderId()", "orderHistoryDetail.getIsEditable() != True");
            } else
                assertFail("getAvailableTimeSlotsBasedOnOrderId()", "orderHistoryDetail != null");
        } else
            assertFail("getAvailableTimeSlotsBasedOnOrderId()", "OrderHistoryDetailsResponse.orderHistoryDetailsResponse != null");
    }

    public void updateEditableOrderIdPickupTime(String orderId, String dateIndex, String slotIndex) {
        int dateInt = 0, slotInt = 2;
        String pickupDate = "invalid", startTime = "invalid", cartId = "invalid";

        orderId = OrderBaseUtils.getValidOrderId(orderId);
        cartId = OrderBaseUtils.getValidCartId(cartId);

        if (!isNullOrOptional(dateIndex)) {
            dateInt = Integer.valueOf(dateIndex);
        }

        if (!isNullOrOptional(slotIndex)) {
            slotInt = Integer.valueOf(slotIndex);
        }

        Schedule schedule = GetSlotReservationResponse.getSlotReservationResponse.getSchedule(0);

        if (dateInt > schedule.getPickupDays().size()) {
            dateInt = (schedule.getPickupDays().size() - 1);
        }

        for (int j = dateInt; j < schedule.getPickupDays().size(); j++) {
            List<ReservationSlot> availableSlots = schedule.getPickupDay(j).getReservationSlots();
            if (availableSlots.size() < 2) {
                continue;
            }
            if (slotInt > availableSlots.size()) {
                slotInt = (availableSlots.size() - 1);
            }
            for (int i = slotInt; i < availableSlots.size(); i++) {
                ReservationSlot slot = availableSlots.get(i);
                startTime = slot.getStartTime();
                if (slot.getIsAvailable() && slot.getIsHoldable()) {
                    break;
                }
            }
            pickupDate = schedule.getPickupDay(j).getDate();
            break;
        }
        Setpickupslot setpickupslot = new Setpickupslot(orderId, pickupDate, startTime, cartId);

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.ORDER_ACCEPT)
                .addContentType(ApiConfig.ORDER_SET_PICKUP_SLOT_CONTENT_TYPE);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new SetPickupSlotRequests(setpickupslot));

        String orderSetPickupSlotURL = OrderBaseUtils.convertOrderBaseToNavWebAppSvc(BASE_PATH)
                + ApiConfig.ORDERS_SVC_CALL + ApiConfig.ORDER_SET_PICKUP_SLOT_ENDPOINT;

        response = executePostMethod(request, orderSetPickupSlotURL);
        printResponse(response);

        assertThis("updateEditableOrderIdPickupTime()", 200, response.getStatusCode());

        // TODO: map updateEditableOrderIdPickupTime() response to Order.class object
    }

    public void getActiveOrderInfoByAccountId(String accountId) {
        ActiveOrderInfoResponse.activeOrderInfoResponse = null;

        accountId = OrderBaseUtils.getValidAccountId(accountId);

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.ACTIVE_ORDER_INF0_ACCEPT);

        queryParamsMapBuilder = new QueryParamsMapBuilder()
                .addMultipleFlag(true);

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addAccountId(accountId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .queryParams(queryParamsMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String getActiveOrderInfoURL = OrderBaseUtils.convertOrderBaseToNavWebAppSvc(BASE_PATH) + ApiConfig.ORDERS_SVC_CALL
                + ApiConfig.ACTIVE_ORDER_INFO_ENDPOINT + ApiConfig.ACCOUNT_ID_ENDPOINT;

        response = executeGetMethod(request, getActiveOrderInfoURL);
        printResponse(response);


        ActiveOrderInfoResponse.activeOrderInfoResponse = response.as(ActiveOrderInfoResponse.class);

        assertThis("getActiveOrderInfoByAccountId()", 200, response.getStatusCode());

    }

    public void getAllEditableOrderByAccountId(String accountId) {
        EditableOrders.allEditableOrders = null;

        accountId = OrderBaseUtils.getValidAccountId(accountId);

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.EDITABLE_ORDERS_ACCEPT);

        pathParamsMapBuilder = new PathParamsMapBuilder()
                .addAccountId(accountId);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .pathParams(pathParamsMapBuilder.build());

        String getAllEditableOrdersURL = OrderBaseUtils.convertOrderBaseToNavWebAppSvc(BASE_PATH) + ApiConfig.ORDERS_SVC_CALL
                + ApiConfig.EDITABLE_ORDERS_ENDPOINT + ApiConfig.ACCOUNT_ID_ENDPOINT;

        response = executeGetMethod(request, getAllEditableOrdersURL);
        printResponse(response);

        EditableOrders.allEditableOrders = response.as(EditableOrders.class);

        assertThis("getAllEditableOrderByAccountId()", 200, response.getStatusCode());
    }

}
