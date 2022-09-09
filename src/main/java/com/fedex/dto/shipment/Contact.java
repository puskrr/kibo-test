package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact{

	@JsonProperty("personName")
	private String personName;

	@JsonProperty("emailAddress")
	private String emailAddress;

	@JsonProperty("phoneNumber")
	private String phoneNumber;

	@JsonProperty("phoneExtension")
	private String phoneExtension;

	@JsonProperty("companyName")
	private String companyName;

	public String getPersonName(){
		return personName;
	}

	public String getEmailAddress(){
		return emailAddress;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public String getPhoneExtension(){
		return phoneExtension;
	}

	public String getCompanyName(){
		return companyName;
	}
}