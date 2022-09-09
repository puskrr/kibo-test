package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TotalDeclaredValue{

	@JsonProperty("amount")
	private int amount;

	@JsonProperty("currencyCode")
	private String currencyCode;

	public int getAmount(){
		return amount;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}
}