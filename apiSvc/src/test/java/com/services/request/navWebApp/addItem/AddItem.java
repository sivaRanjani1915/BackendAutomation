package com.services.request.navWebApp.addItem;

public class AddItem {

    public String id;
    public Integer fulfillmentGroupTypeId;
    public String itemId;
    public String upc;
    public Integer unitId;
    public String itemDescription;
    public String itemQuantity;
    public String price;
    public Boolean priorDayProduction;
    public Boolean selectedByAltUoM;
    public String selectedAltWeightEach;
    public String altUom;

    public AddItem(String id, Integer fulfillmentGroupTypeId, String itemId, String upc, Integer storeId,
                   String itemDescription, String itemQuantity, String price, Boolean priorDayProduction,
                   Boolean selectedByALtUom, String selectedAltWeightEach, String altUoM) {

        this.id = id;
        this.fulfillmentGroupTypeId = fulfillmentGroupTypeId;
        this.itemId = itemId;
        this.upc = upc;
        this.unitId = storeId;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.price = price;
        this.priorDayProduction = priorDayProduction;
        this.selectedByAltUoM = selectedByALtUom;
        this.selectedAltWeightEach = selectedAltWeightEach;
        this.altUom = altUoM;
    }

}
