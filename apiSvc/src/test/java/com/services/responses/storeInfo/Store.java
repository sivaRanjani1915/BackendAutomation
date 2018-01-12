package com.services.responses.storeInfo;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public Integer UnitId;
    public Integer MilesFrom;
    public String Address;
    public String City;
    public String State;
    public String Zip;
    public String UnitType;
    public String OpenDate;
    public String PhoneNumber;
    public String Name;
    public Boolean DriveThru;
    public Boolean Clinic;
    public String PharmDailyOpen;
    public String PharmDailyClose;
    public String PharmSatOpen;
    public String PharmSatClose;
    public String PharmSunOpen;
    public String PharmSunClose;
    public String PharmHolidayOpen;
    public String PharmHolidayClose;
    public String PharmTimezone;
    public String PharmAddress;
    public String PharmPhone;
    public String StoreDirName;
    public String StoreDirEmpId;
    public Float Latitude;
    public Float Longitude;
    public String StoreHours;
    public String PreOrderServiceAllow;
    public String PreOrderPhone;
    public String PreOrderDriveThru;
    public String CurbsideAllow;
    public String CurbsidePhone;
    public String CurbsideDriveThru;
    public String CurbsideWeekdayOpen;
    public String CurbsideWeekdayClose;
    public String CurbsideSatOpen;
    public String CurbsideSatClose;
    public String CurbsideSunOpen;
    public String CurbsideSunClose;
    public String CurbsideHolidayOpen;
    public String CurbsideHolidayClose;
    public String CurbsideInstoreAllow;
    public String PreOrderInstoreAllow;
    public String PreOrderWeekdayOpen;
    public String PreOrderWeekdayClose;
    public String PreOrderSatOpen;
    public String PreOrderSatClose;
    public String PreOrderSunOpen;
    public String PreOrderSunClose;
    public String PreOrderHolidayOpen;
    public String PreOrderHolidayClose;
    public List<Tenant> Tenants = new ArrayList<>();
    public String TimeZone;
    public String DaylightSavings;
    public String Vpos;
    public String VisibleDate;
    public String CNCPickupDescription;
    public String SPOPickupDescription;
    public Integer Latitude_Rad;
    public Integer Longitude_Rad;
    public MarketAndRegion MarketAndRegion;

    public void setLongitude_Rad(Integer longitude_Rad) {
        Longitude_Rad = longitude_Rad;
    }

    public Integer getUnitId() {
        return UnitId;
    }

    public void setUnitId(Integer unitId) {
        this.UnitId = unitId;
    }

    public Integer getMilesFrom() {
        return MilesFrom;
    }

    public void setMilesFrom(Integer milesFrom) {
        this.MilesFrom = milesFrom;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        this.State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        this.Zip = zip;
    }

    public String getUnitType() {
        return UnitType;
    }

    public void setUnitType(String unitType) {
        this.UnitType = unitType;
    }

    public String getOpenDate() {
        return OpenDate;
    }

    public void setOpenDate(String openDate) {
        this.OpenDate = openDate;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Boolean getDriveThru() {
        return DriveThru;
    }

    public void setDriveThru(Boolean driveThru) {
        this.DriveThru = driveThru;
    }

    public Boolean getClinic() {
        return Clinic;
    }

    public void setClinic(Boolean clinic) {
        this.Clinic = clinic;
    }

    public String getPharmDailyOpen() {
        return PharmDailyOpen;
    }

    public void setPharmDailyOpen(String pharmDailyOpen) {
        this.PharmDailyOpen = pharmDailyOpen;
    }

    public String getPharmDailyClose() {
        return PharmDailyClose;
    }

    public void setPharmDailyClose(String pharmDailyClose) {
        this.PharmDailyClose = pharmDailyClose;
    }

    public String getPharmSatOpen() {
        return PharmSatOpen;
    }

    public void setPharmSatOpen(String pharmSatOpen) {
        this.PharmSatOpen = pharmSatOpen;
    }

    public String getPharmSatClose() {
        return PharmSatClose;
    }

    public void setPharmSatClose(String pharmSatClose) {
        this.PharmSatClose = pharmSatClose;
    }

    public String getPharmSunOpen() {
        return PharmSunOpen;
    }

    public void setPharmSunOpen(String pharmSunOpen) {
        this.PharmSunOpen = pharmSunOpen;
    }

    public String getPharmSunClose() {
        return PharmSunClose;
    }

    public void setPharmSunClose(String pharmSunClose) {
        this.PharmSunClose = pharmSunClose;
    }

    public String getPharmHolidayOpen() {
        return PharmHolidayOpen;
    }

    public void setPharmHolidayOpen(String pharmHolidayOpen) {
        this.PharmHolidayOpen = pharmHolidayOpen;
    }

    public String getPharmHolidayClose() {
        return PharmHolidayClose;
    }

    public void setPharmHolidayClose(String pharmHolidayClose) {
        this.PharmHolidayClose = pharmHolidayClose;
    }

    public String getPharmTimezone() {
        return PharmTimezone;
    }

    public void setPharmTimezone(String pharmTimezone) {
        this.PharmTimezone = pharmTimezone;
    }

    public String getPharmAddress() {
        return PharmAddress;
    }

    public void setPharmAddress(String pharmAddress) {
        this.PharmAddress = pharmAddress;
    }

    public String getPharmPhone() {
        return PharmPhone;
    }

    public void setPharmPhone(String pharmPhone) {
        this.PharmPhone = pharmPhone;
    }

    public String getStoreDirName() {
        return StoreDirName;
    }

    public void setStoreDirName(String StoreDirName) {
        this.StoreDirName = StoreDirName;
    }

    public String getStoreDirEmpId() {
        return StoreDirEmpId;
    }

    public void setStoreDirEmpId(String StoreDirEmpId) {
        this.StoreDirEmpId = StoreDirEmpId;
    }

    public Float getLatitude() {
        return Latitude;
    }

    public void setLatitude(Float Latitude) {
        this.Latitude = Latitude;
    }

    public Float getLongitude() {
        return Longitude;
    }

    public void setLongitude(Float Longitude) {
        this.Longitude = Longitude;
    }

    public String getStoreHours() {
        return StoreHours;
    }

    public void setStoreHours(String StoreHours) {
        this.StoreHours = StoreHours;
    }

    public String getPreOrderServiceAllow() {
        return PreOrderServiceAllow;
    }

    public void setPreOrderServiceAllow(String PreOrderServiceAllow) {
        this.PreOrderServiceAllow = PreOrderServiceAllow;
    }

    public String getPreOrderPhone() {
        return PreOrderPhone;
    }

    public void setPreOrderPhone(String PreOrderPhone) {
        this.PreOrderPhone = PreOrderPhone;
    }

    public String getPreOrderDriveThru() {
        return PreOrderDriveThru;
    }

    public void setPreOrderDriveThru(String PreOrderDriveThru) {
        this.PreOrderDriveThru = PreOrderDriveThru;
    }

    public String getCurbsideAllow() {
        return CurbsideAllow;
    }

    public void setCurbsideAllow(String CurbsideAllow) {
        this.CurbsideAllow = CurbsideAllow;
    }

    public String getCurbsidePhone() {
        return CurbsidePhone;
    }

    public void setCurbsidePhone(String CurbsidePhone) {
        this.CurbsidePhone = CurbsidePhone;
    }

    public String getCurbsideDriveThru() {
        return CurbsideDriveThru;
    }

    public void setCurbsideDriveThru(String CurbsideDriveThru) {
        this.CurbsideDriveThru = CurbsideDriveThru;
    }

    public String getCurbsideWeekdayOpen() {
        return CurbsideWeekdayOpen;
    }

    public void setCurbsideWeekdayOpen(String CurbsideWeekdayOpen) {
        this.CurbsideWeekdayOpen = CurbsideWeekdayOpen;
    }

    public String getCurbsideWeekdayClose() {
        return CurbsideWeekdayClose;
    }

    public void setCurbsideWeekdayClose(String CurbsideWeekdayClose) {
        this.CurbsideWeekdayClose = CurbsideWeekdayClose;
    }

    public String getCurbsideSatOpen() {
        return CurbsideSatOpen;
    }

    public void setCurbsideSatOpen(String CurbsideSatOpen) {
        this.CurbsideSatOpen = CurbsideSatOpen;
    }

    public String getCurbsideSatClose() {
        return CurbsideSatClose;
    }

    public void setCurbsideSatClose(String CurbsideSatClose) {
        this.CurbsideSatClose = CurbsideSatClose;
    }

    public String getCurbsideSunOpen() {
        return CurbsideSunOpen;
    }

    public void setCurbsideSunOpen(String CurbsideSunOpen) {
        this.CurbsideSunOpen = CurbsideSunOpen;
    }

    public String getCurbsideSunClose() {
        return CurbsideSunClose;
    }

    public void setCurbsideSunClose(String CurbsideSunClose) {
        this.CurbsideSunClose = CurbsideSunClose;
    }

    public String getCurbsideHolidayOpen() {
        return CurbsideHolidayOpen;
    }

    public void setCurbsideHolidayOpen(String CurbsideHolidayOpen) {
        this.CurbsideHolidayOpen = CurbsideHolidayOpen;
    }

    public String getCurbsideHolidayClose() {
        return CurbsideHolidayClose;
    }

    public void setCurbsideHolidayClose(String CurbsideHolidayClose) {
        this.CurbsideHolidayClose = CurbsideHolidayClose;
    }

    public String getCurbsideInstoreAllow() {
        return CurbsideInstoreAllow;
    }

    public void setCurbsideInstoreAllow(String CurbsideInstoreAllow) {
        this.CurbsideInstoreAllow = CurbsideInstoreAllow;
    }

    public String getPreOrderInstoreAllow() {
        return PreOrderInstoreAllow;
    }

    public void setPreOrderInstoreAllow(String PreOrderInstoreAllow) {
        this.PreOrderInstoreAllow = PreOrderInstoreAllow;
    }

    public String getPreOrderWeekdayOpen() {
        return PreOrderWeekdayOpen;
    }

    public void setPreOrderWeekdayOpen(String PreOrderWeekdayOpen) {
        this.PreOrderWeekdayOpen = PreOrderWeekdayOpen;
    }

    public String getPreOrderWeekdayClose() {
        return PreOrderWeekdayClose;
    }

    public void setPreOrderWeekdayClose(String PreOrderWeekdayClose) {
        this.PreOrderWeekdayClose = PreOrderWeekdayClose;
    }

    public String getPreOrderSatOpen() {
        return PreOrderSatOpen;
    }

    public void setPreOrderSatOpen(String PreOrderSatOpen) {
        this.PreOrderSatOpen = PreOrderSatOpen;
    }

    public String getPreOrderSatClose() {
        return PreOrderSatClose;
    }

    public void setPreOrderSatClose(String PreOrderSatClose) {
        this.PreOrderSatClose = PreOrderSatClose;
    }

    public String getPreOrderSunOpen() {
        return PreOrderSunOpen;
    }

    public void setPreOrderSunOpen(String PreOrderSunOpen) {
        this.PreOrderSunOpen = PreOrderSunOpen;
    }

    public String getPreOrderSunClose() {
        return PreOrderSunClose;
    }

    public void setPreOrderSunClose(String PreOrderSunClose) {
        this.PreOrderSunClose = PreOrderSunClose;
    }

    public String getPreOrderHolidayOpen() {
        return PreOrderHolidayOpen;
    }

    public void setPreOrderHolidayOpen(String PreOrderHolidayOpen) {
        this.PreOrderHolidayOpen = PreOrderHolidayOpen;
    }

    public String getPreOrderHolidayClose() {
        return PreOrderHolidayClose;
    }

    public void setPreOrderHolidayClose(String PreOrderHolidayClose) {
        this.PreOrderHolidayClose = PreOrderHolidayClose;
    }

    public List<Tenant> getTenants() {
        return Tenants;
    }

    public Tenant getTenant(int index) {
        return Tenants.get(index);
    }

    public void setTenants(List<Tenant> Tenants) {
        this.Tenants = Tenants;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public String getDaylightSavings() {
        return DaylightSavings;
    }

    public void setDaylightSavings(String DaylightSavings) {
        this.DaylightSavings = DaylightSavings;
    }

    public String getVpos() {
        return Vpos;
    }

    public void setVpos(String Vpos) {
        this.Vpos = Vpos;
    }

    public String getVisibleDate() {
        return VisibleDate;
    }

    public void setVisibleDate(String VisibleDate) {
        this.VisibleDate = VisibleDate;
    }

    public String getCNCPickupDescription() {
        return CNCPickupDescription;
    }

    public void setCNCPickupDescription(String CNCPickupDescription) {
        this.CNCPickupDescription = CNCPickupDescription;
    }

    public String getSPOPickupDescription() {
        return SPOPickupDescription;
    }

    public void setSPOPickupDescription(String SPOPickupDescription) {
        this.SPOPickupDescription = SPOPickupDescription;
    }

    public Integer getLatitude_Rad() {
        return Latitude_Rad;
    }

    public void setLatitude_Rad(Integer latitude_Rad) {
        Latitude_Rad = latitude_Rad;
    }

    public Integer getLongitude_Rad() {
        return Longitude_Rad;
    }

    public MarketAndRegion getMarketAndRegion() {
        return MarketAndRegion;
    }

    public void setMarketAndRegion(MarketAndRegion marketAndRegion) {
        this.MarketAndRegion = marketAndRegion;
    }
}
