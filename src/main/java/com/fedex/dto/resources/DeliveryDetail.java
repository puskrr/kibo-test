package com.fedex.dto.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryDetail{

	@JsonProperty("instructions")
	private String instructions;

	@JsonProperty("location")
	private Location location;

	public String getInstructions(){
		return instructions;
	}

	public Location getLocation(){
		return location;
	}
}