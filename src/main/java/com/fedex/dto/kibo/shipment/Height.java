package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Height{

	@JsonProperty("unit")
	private String unit;

	public String getUnit(){
		return unit;
	}
}