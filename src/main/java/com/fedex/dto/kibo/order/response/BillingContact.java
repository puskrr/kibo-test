package com.fedex.dto.kibo.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingContact{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("lastNameOrSurname")
	private String lastNameOrSurname;

	@JsonProperty("middleNameOrInitial")
	private String middleNameOrInitial;

	@JsonProperty("email")
	private String email;

	@JsonProperty("phoneNumbers")
	private PhoneNumbers phoneNumbers;

	public String getFirstName(){
		return firstName;
	}

	public Address getAddress(){
		return address;
	}

	public String getLastNameOrSurname(){
		return lastNameOrSurname;
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