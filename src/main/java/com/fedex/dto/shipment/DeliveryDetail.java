package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryDetail{

	@JsonProperty("instructions")
	private String instructions;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("holdOptions")
	private HoldOptions holdOptions;

	public String getInstructions(){
		return instructions;
	}

	public Location getLocation(){
		return location;
	}

	public HoldOptions getHoldOptions(){
		return holdOptions;
	}
}