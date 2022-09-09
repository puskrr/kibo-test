package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisplayImage{

	@JsonProperty("small")
	private String small;

	@JsonProperty("large")
	private String large;

	@JsonProperty("medium")
	private String medium;

	public String getSmall(){
		return small;
	}

	public String getLarge(){
		return large;
	}

	public String getMedium(){
		return medium;
	}
}