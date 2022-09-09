package com.fedex.dto.kibo.customer.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalOrderAmount{

	@JsonProperty("amount")
	private int amount;

	public int getAmount(){
		return amount;
	}
}