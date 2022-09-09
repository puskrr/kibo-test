package com.fedex.dto.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Shipper{

	@JsonProperty("supportContact")
	private SupportContact supportContact;

	@JsonProperty("displayImage")
	private DisplayImage displayImage;

	@JsonProperty("displayName")
	private String displayName;

	@JsonProperty("contact")
	private Contact contact;

	@JsonProperty("accountNumber")
	private String accountNumber;

	public SupportContact getSupportContact(){
		return supportContact;
	}

	public DisplayImage getDisplayImage(){
		return displayImage;
	}

	public String getDisplayName(){
		return displayName;
	}

	public Contact getContact(){
		return contact;
	}

	public String getAccountNumber(){
		return accountNumber;
	}
}