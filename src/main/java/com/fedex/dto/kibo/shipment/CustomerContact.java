package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerContact{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("shortFullName")
	private String shortFullName;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("lastNameOrSurname")
	private String lastNameOrSurname;

	@JsonProperty("fullName")
	private String fullName;

	@JsonProperty("middleNameOrInitial")
	private String middleNameOrInitial;

	@JsonProperty("email")
	private String email;

	@JsonProperty("phoneNumbers")
	private PhoneNumbers phoneNumbers;

	public String getFirstName(){
		return firstName;
	}

	public String getShortFullName(){
		return shortFullName;
	}

	public Address getAddress(){
		return address;
	}

	public String getLastNameOrSurname(){
		return lastNameOrSurname;
	}

	public String getFullName(){
		return fullName;
	}

	public String getMiddleNameOrInitial(){
		return middleNameOrInitial;
	}

	public String getEmail(){
		return email;
	}

	public PhoneNumbers getPhoneNumbers(){
		return phoneNumbers;
	}
}