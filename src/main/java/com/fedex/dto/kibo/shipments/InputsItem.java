package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputsItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("type")
	private String type;

	public String getName(){
		return name;
	}

	public String getType(){
		return type;
	}
}