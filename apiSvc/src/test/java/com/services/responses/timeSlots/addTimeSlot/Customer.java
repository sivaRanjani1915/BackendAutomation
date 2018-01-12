package com.services.responses.timeSlots.addTimeSlot;

public class Customer {

	public String id;
	public Integer accountID;
	public Integer eGuestID;
	public Object mperksID;
	public String firstName;
	public String lastName;
	public Object areaCode;
	public Object phoneNumber;
	public String email;
	public Object teamMemberID;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}

	public Integer geteGuestID() {
		return eGuestID;
	}

	public void seteGuestID(Integer eGuestID) {
		this.eGuestID = eGuestID;
	}

	public Object getMperksID() {
		return mperksID;
	}

	public void setMperksID(Object mperksID) {
		this.mperksID = mperksID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Object getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Object areaCode) {
		this.areaCode = areaCode;
	}

	public Object getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Object phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Object getTeamMemberID() {
		return teamMemberID;
	}

	public void setTeamMemberID(Object teamMemberID) {
		this.teamMemberID = teamMemberID;
	}
}
