package com.fedex.dto.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weight{

	@JsonProperty("units")
	private String units;

	@JsonProperty("value")
	private int value;

	public String getUnits(){
		return units;
	}

	public int getValue(){
		return value;
	}
}