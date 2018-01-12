package com.automation.utils;

public class QueryParamsMapBuilder extends BaseQueryMapBuilder {

    public QueryParamsMapBuilder() {
        super();
    }

    public enum Sort {
        ASC("6"),
        DESC("7");

        public String sortCode;

        Sort(String sortCode) {
            this.sortCode = sortCode;
        }
    }

    public QueryParamsMapBuilder addStore(String storeId) {
        putString("storeId", storeId);
        return this;
    }

    public QueryParamsMapBuilder add_q_Upc(String upc) {
        putString("q.upc", upc);
        return this;
    }

    public QueryParamsMapBuilder addUpc(String upc) {
        putString("upc", upc);
        return this;
    }

    public QueryParamsMapBuilder addTierId(String tierId) {
        putString("TierId", tierId);
        return this;
    }

    public QueryParamsMapBuilder addSort(Sort sort) {
        putString("sort", sort.sortCode);
        return this;
    }

    public QueryParamsMapBuilder addSort(String sort) {
        putString("sort", sort);
        return this;
    }

    public QueryParamsMapBuilder addIsClickAndCollect(Boolean isClickAndCollect) {
        putBoolean("isClickAndCollect", isClickAndCollect);
        return this;
    }

    /**
     * @param forEdit , True means calculate the startLaterThan parameter and pass it to the fulfillment base service call
     */
    public QueryParamsMapBuilder forEdit(Boolean forEdit) {
        putBoolean("forEdit", forEdit);
        return this;
    }

    /**
     * @param includeFees , Include linked section with fee information for the slot types
     */
    public QueryParamsMapBuilder includeFees(Boolean includeFees) {
        putBoolean("includeFees", includeFees);
        return this;
    }

    public QueryParamsMapBuilder sameDayMode(int sameDayMode) {
        putInt("sameDayMode", sameDayMode);
        return this;
    }

    /**
     * @param scheduleTypeId , This is the schedule type (which may be a composite of multiple schedule types):
     *                         1=full Cart, 2=SPO, 3=Full Cart and SPO, 4=Quick Trip
     * NOTE: scheduleType 3 is a composite which merges the full Cart and SPO schedules to give a
     *                       schedule that would be available if both types of items are being bought
     */
    public QueryParamsMapBuilder addScheduleTypeId(String scheduleTypeId) {
        putString("scheduleTypeId", scheduleTypeId);
        return this;
    }

    public QueryParamsMapBuilder addLatitude(Object latitude) {
        putString("latitude", latitude);
        return this;
    }

    public QueryParamsMapBuilder addLongitude(Object longitude) {
        putString("longitude", longitude);
        return this;
    }

    /**
     * @param mileRadius , number of miles around the lat/long.
     */
    public QueryParamsMapBuilder addMileRadius(String mileRadius) {
        putString("miles", mileRadius);
        return this;
    }

    /**
     * @param numOfReturns , number of store records to return, sorted lowest to highest distance.
     */
    public QueryParamsMapBuilder addNumOfReturns(String numOfReturns) {
        putString("numToReturn", numOfReturns);
        return this;
    }

    /**
     * @param accountId , signed in customer's accountId
     */
    public QueryParamsMapBuilder addAccountId(String accountId) {
        putString("accountId", accountId);
        return this;
    }

    public QueryParamsMapBuilder addBillingZipCode(String billingZipCode) {
        putString("billingZipCode", billingZipCode);
        return this;
    }

    public QueryParamsMapBuilder addChangeFromDate(String changeFromDate) {
        putString("changeFromDate", changeFromDate);
        return this;
    }

    /**
     * @param active , determine to view either active orders or not
     */
    public QueryParamsMapBuilder addActive(String active) {
        putString("active", active);
        return this;
    }

    public QueryParamsMapBuilder addMultipleFlag(Boolean multipleFlag) {
        putBoolean("multipleFlag", multipleFlag);
        return this;
    }

    public QueryParamsMapBuilder addDataStore(String dataStore) {
        putString("dataStore", dataStore);
        return this;
    }

    public QueryParamsMapBuilder addDepth(String depth) {
        putString("depth", depth);
        return this;
    }

    // ... Add additional QueryParamsMapBuilder ...

}
