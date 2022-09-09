package com.fedex.dto.kibo.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnitPrice{

	@JsonProperty("listAmount")
	private int listAmount;

	@JsonProperty("extendedAmount")
	private int extendedAmount;

	public int getListAmount(){
		return listAmount;
	}

	public int getExtendedAmount(){
		return extendedAmount;
	}
}