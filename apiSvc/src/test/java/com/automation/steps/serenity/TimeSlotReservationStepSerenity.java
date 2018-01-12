package com.automation.steps.serenity;

import com.services.ApiConfig;
import com.services.request.navWebApp.timeSlots.add.AddPickupSlot;
import com.services.request.navWebApp.timeSlots.add.AddPickupSlotRequests;
import com.services.request.navWebApp.timeSlots.add.PickupSlot;
import com.services.request.navWebApp.timeSlots.remove.RemovePickupSlotBaseRequest;
import com.services.request.navWebApp.timeSlots.remove.RemovePickupSlotRequest;
import com.services.responses.navWebApp.cartResponse.CartResponse;
import com.services.responses.timeSlots.getReservationSlots.GetSlotReservationResponse;
import com.services.responses.timeSlots.getReservationSlots.PickupDay;
import com.services.responses.timeSlots.getReservationSlots.ReservationSlot;
import com.automation.utils.HeadersQueryMapBuilder;
import com.automation.utils.QueryParamsMapBuilder;
import net.serenitybdd.rest.SerenityRest;

import java.util.List;

import static com.services.RestAssuredConfigurations.*;

public class TimeSlotReservationStepSerenity extends SerenityRest {

    private String BASE_PATH = ApiConfig.MEIJER_SERVICES_URL + getBaseLayerURL(ApiConfig.NAV_WEB_APP_SVC) + getTestEnvironment();

//    private GetSlotReservationResponse getSlotReservationResponse;

    public void userGetsAllAvailableTimeSlots(String storeId, String slotType) {
        GetSlotReservationResponse.getSlotReservationResponse = null;

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.TIME_SLOTS_ACCEPT);

        queryParamsMapBuilder = new QueryParamsMapBuilder()
                .sameDayMode(1)
//                .forEdit(true)
                .includeFees(true)
                .addStore(storeId)
                .addScheduleTypeId(slotType);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .queryParams(queryParamsMapBuilder.build());

        String getReservationSlotsURL = BASE_PATH + ApiConfig.GET_RESERVATION_SLOTS_ENDPOINT;

        response = executeGetMethod(request, getReservationSlotsURL);
        printResponse(response);

        GetSlotReservationResponse.getSlotReservationResponse = response.as(GetSlotReservationResponse.class);

        assertThis("userGetsAllAvailableTimeSlots()", 200, response.getStatusCode());

    }

    public void addPickUpSlot(String dateIndex, String slotIndex, String placeHold) {
        int dateInt = 0, slotInt = 2;
        boolean isHold = Boolean.valueOf(placeHold);
        String pickupDate = null, startTime = null, cartId;

        if (isNullOrOptional(placeHold)) {
            isHold = false;
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.ADD_PICKUP_SLOT_CONTENT_TYPE);

        if (!isNullOrOptional(dateIndex)) {
            dateInt = Integer.valueOf(dateIndex);
        }

        if (!isNullOrOptional(slotIndex)) {
            slotInt = Integer.valueOf(slotIndex);
        }

        List<PickupDay> getAvailableDays = GetSlotReservationResponse.getSlotReservationResponse
                .getSchedule(0).getPickupDays();
        if (dateInt > getAvailableDays.size()) {
            dateInt = (getAvailableDays.size() - 1);
        }
        for (int j = dateInt; j < getAvailableDays.size(); j++) {
            List<ReservationSlot> getAvailableSlots = GetSlotReservationResponse.getSlotReservationResponse
                    .getSchedule(0).getPickupDay(j).getReservationSlots();
            if (getAvailableSlots.size() < 2) {
                continue;
            }
            if (slotInt > getAvailableSlots.size()) {
                slotInt = (getAvailableSlots.size() - 1);
            }
            for (int i = slotInt; i < getAvailableSlots.size(); i++) {
                ReservationSlot slot = getAvailableSlots.get(i);
                startTime = slot.getStartTime();
                if (slot.getIsAvailable() && slot.getIsHoldable()) {
                    break;
                }
            }
            pickupDate = GetSlotReservationResponse.getSlotReservationResponse.getSchedule(0).getPickupDay(j).getDate();
            break;
        }


        PickupSlot addThisSlot = new PickupSlot(pickupDate, startTime);

//        id = cartResponse.getCart(0).getId();
        cartId = cartResponse.getCart(0).getCartId();

        AddPickupSlot addPickupSlot = new AddPickupSlot(null, cartId, addThisSlot, isHold);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new AddPickupSlotRequests(addPickupSlot));

        String addPickUpSlotURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.ADD_PICKUP_TIME_ENDPOINT;

        response = executePostMethod(request, addPickUpSlotURL);
        printResponse(response);

        response.as(CartResponse.class);

        assertThis("addPickUpSlot()", 200, response.getStatusCode());

    }

    public void addPickUpSlot(Boolean placeHold) {
        String pickupDate = null, startTime = null, id, cartId;

        if (isNullOrOptional(placeHold)) {
            placeHold = false;
        }

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.ADD_PICKUP_SLOT_CONTENT_TYPE);


        List<PickupDay> getAvailableDays = GetSlotReservationResponse.getSlotReservationResponse.getSchedule(0).getPickupDays();

        for (int j = 0; j < getAvailableDays.size(); j++) {
            List<ReservationSlot> getAvailableSlots = GetSlotReservationResponse.getSlotReservationResponse.getSchedule(0).getPickupDay(j).getReservationSlots();
            if (getAvailableSlots.size() < 2) {
                continue;
            }
            for (int i = 1; i < getAvailableSlots.size(); i++) {
                ReservationSlot slot = getAvailableSlots.get(i);
                startTime = slot.getStartTime();
                if (slot.getIsAvailable() && slot.getIsHoldable()) {
                    break;
                }
            }
            pickupDate = GetSlotReservationResponse.getSlotReservationResponse.getSchedule(0).getPickupDay(j).getDate();
            break;
        }


        PickupSlot addThisSlot = new PickupSlot(pickupDate, startTime);

        id = cartResponse.getCart(0).getId();
        cartId = cartResponse.getCart(0).getCartId();

        AddPickupSlot addPickupSlot = new AddPickupSlot(id, cartId, addThisSlot, placeHold);

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new AddPickupSlotRequests(addPickupSlot));

        String addPickUpSlotURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.ADD_PICKUP_TIME_ENDPOINT;

        response = executePostMethod(request, addPickUpSlotURL);
        printResponse(response);

        response.as(CartResponse.class);

        assertThis("addPickUpSlot()", 200, response.getStatusCode());

    }

    public void removePickupSlot() {

        headersQueryMapBuilder = new HeadersQueryMapBuilder()
                .addAuthorization(getToken())
                .addAccept(ApiConfig.CART_ACCEPT)
                .addContentType(ApiConfig.REMOVE_PICKUP_SLOT_CONTENT_TYPE);

        RemovePickupSlotRequest removePickupSlot = new RemovePickupSlotRequest(
                "1", cartResponse.getCart(0).getCartId());

        request = givenConfig()
                .headers(headersQueryMapBuilder.build())
                .body(new RemovePickupSlotBaseRequest(removePickupSlot));

        String removePickUpSlotURL = BASE_PATH + ApiConfig.CART_SVC_CALL + ApiConfig.REMOVE_PICKUP_TIME_ENDPOINT;

        response = executePostMethod(request, removePickUpSlotURL);
        printResponse(response);

        response.as(CartResponse.class);

        assertThis("removePickupSlot()", 200, response.getStatusCode());

    }

}
