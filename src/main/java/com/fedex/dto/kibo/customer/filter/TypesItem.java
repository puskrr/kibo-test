package com.fedex.dto.kibo.customer.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TypesItem{

	@JsonProperty("isPrimary")
	private boolean isPrimary;

	@JsonProperty("name")
	private String name;

	public boolean isIsPrimary(){
		return isPrimary;
	}

	public String getName(){
		return name;
	}
}