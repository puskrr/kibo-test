package com.fedex.dto.kibo.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price{

	@JsonProperty("price")
	private int price;

	public int getPrice(){
		return price;
	}
}