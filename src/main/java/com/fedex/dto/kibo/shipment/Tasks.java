package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tasks{

	@JsonProperty("href")
	private String href;

	public String getHref(){
		return href;
	}
}