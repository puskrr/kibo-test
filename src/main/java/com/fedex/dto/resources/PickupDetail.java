package com.fedex.dto.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PickupDetail{

	@JsonProperty("instructions")
	private String instructions;

	@JsonProperty("readyTime")
	private long readyTime;

	@JsonProperty("localTimeZone")
	private String localTimeZone;

	@JsonProperty("location")
	private Location location;

	public String getInstructions(){
		return instructions;
	}

	public long getReadyTime(){
		return readyTime;
	}

	public String getLocalTimeZone(){
		return localTimeZone;
	}

	public Location getLocation(){
		return location;
	}
}