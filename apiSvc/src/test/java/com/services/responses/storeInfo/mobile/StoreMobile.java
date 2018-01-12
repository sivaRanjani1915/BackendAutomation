package com.services.responses.storeInfo.mobile;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class StoreMobile {

    private int unitid;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private Float latitude;
    private Float longitude;
    private String storeHours;
    private String storeName;
    private Float milesFrom;
    private String storeShortName;
    private String storePhoneNumber;
    private String pharmacyPhone;

    @JsonProperty("isPharmacy")
    private Boolean isPharmacy;

    private List<PharmacyHours> pharmacyHours;

    public int getUnitid() {
        return unitid;
    }

    public void setUnitid(int unitid) {
        this.unitid = unitid;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getStoreHours() {
        return storeHours;
    }

    public void setStoreHours(String storeHours) {
        this.storeHours = storeHours;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Float getMilesFrom() {
        return milesFrom;
    }

    public void setMilesFrom(Float milesFrom) {
        this.milesFrom = milesFrom;
    }

    public String getStoreShortName() {
        return storeShortName;
    }

    public void setStoreShortName(String storeShortName) {
        this.storeShortName = storeShortName;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }

    public String getPharmacyPhone() {
        return pharmacyPhone;
    }

    public void setPharmacyPhone(String pharmacyPhone) {
        this.pharmacyPhone = pharmacyPhone;
    }

    @JsonProperty("isPharmacy")
    public Boolean getPharmacy() {
        return isPharmacy;
    }

    @JsonProperty("isPharmacy")
    public void setPharmacy(Boolean isPharmacy) {
        this.isPharmacy = isPharmacy;
    }

    public List<PharmacyHours> getPharmacyHours() {
        return pharmacyHours;
    }

    public void setPharmacyHours(List<PharmacyHours> pharmacyHours) {
        this.pharmacyHours = pharmacyHours;
    }
}
