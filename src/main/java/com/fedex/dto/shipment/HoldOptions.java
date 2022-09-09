package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HoldOptions{

	@JsonProperty("holdAtLocation")
	private boolean holdAtLocation;

	public boolean isHoldAtLocation(){
		return holdAtLocation;
	}
}