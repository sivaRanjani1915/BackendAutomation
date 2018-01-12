package com.services.responses.navWebApp.accounts;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Account {

    @JsonProperty("id")
    private long id;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("birthDate")
    private String birthDate;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("zip")
    private String zip;

    @JsonProperty("storeId")
    private int storeId;

    @JsonProperty("accountStatus")
    private String accountStatus;

    @JsonProperty("mPerksId")
    private float mPerksId;

    @JsonProperty("mPerksShopperId")
    private String mPerksShopperId;

    @JsonProperty("mPerksPhone")
    private long mPerksPhone;

    @JsonProperty("mPerkStatus")
    private String mPerkStatus;

    @JsonProperty("eGuestId")
    private long eGuestId;

    @JsonProperty("eGuestStatus")
    private String eGuestStatus;

    @JsonProperty("employeeId")
    private long employeeId;

    @JsonProperty("employeeStoreId")
    private long employeeStoreId;

    @JsonProperty("employeeStatus")
    private String employeeStatus;

    @JsonProperty("ePanelId")
    private int ePanelId;

    @JsonProperty("ePanelStatus")
    private String ePanelStatus;

    @JsonProperty("createdDate")
    private Date createdDate;

    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("updatedDate")
    private Date updatedDate;

    @JsonProperty("updatedBy")
    private String updatedBy;

    @JsonProperty("vehicleInformation")
    private String vehicleInformation;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Account() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public float getMPerksId() {
        return mPerksId;
    }

    public void setMPerksId(float mPerksId) {
        this.mPerksId = mPerksId;
    }

    public long getMPerksPhone() {
        return mPerksPhone;
    }

    public void setMPerksPhone(long mPerksPhone) {
        this.mPerksPhone = mPerksPhone;
    }

    public String getMPerkStatus() {
        return mPerkStatus;
    }

    public void setMPerkStatus(String mPerkStatus) {
        this.mPerkStatus = mPerkStatus;
    }

    public long getEGuestId() {
        return eGuestId;
    }

    public void setEGuestId(long eGuestId) {
        this.eGuestId = eGuestId;
    }

    public String getEGuestStatus() {
        return eGuestStatus;
    }

    public void setEGuestStatus(String eGuestStatus) {
        this.eGuestStatus = eGuestStatus;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getEmployeeStoreId() {
        return employeeStoreId;
    }

    public void setEmployeeStoreId(long employeeStoreId) {
        this.employeeStoreId = employeeStoreId;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public int getEPanelId() {
        return ePanelId;
    }

    public void setEPanelId(int ePanelId) {
        this.ePanelId = ePanelId;
    }

    public String getEPanelStatus() {
        return ePanelStatus;
    }

    public void setEPanelStatus(String ePanelStatus) {
        this.ePanelStatus = ePanelStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getmPerksShopperId() {
        return mPerksShopperId;
    }

    public void setmPerksShopperId(String mPerksShopperId) {
        this.mPerksShopperId = mPerksShopperId;
    }

    public String getMPerksShopperId() {
        return mPerksShopperId;
    }

    public void setMPerksShopperId(String mPerksShopperId) {
        this.mPerksShopperId = mPerksShopperId;
    }

    public String getVehicleInformation() {
        return vehicleInformation;
    }

    public void setVehicleInformation(String vehicleInformation) {
        this.vehicleInformation = vehicleInformation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
