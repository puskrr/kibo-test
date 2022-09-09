package com.fedex.dto.kibo.customer.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumbers{

	@JsonProperty("home")
	private String home;

	public String getHome(){
		return home;
	}
}