package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weight{

	@JsonProperty("unit")
	private String unit;

	public String getUnit(){
		return unit;
	}
}