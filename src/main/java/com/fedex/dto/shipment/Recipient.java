package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Recipient{

	@JsonProperty("displayImage")
	private DisplayImage displayImage;

	@JsonProperty("displayName")
	private String displayName;

	@JsonProperty("contact")
	private Contact contact;

	public DisplayImage getDisplayImage(){
		return displayImage;
	}

	public String getDisplayName(){
		return displayName;
	}

	public Contact getContact(){
		return contact;
	}
}