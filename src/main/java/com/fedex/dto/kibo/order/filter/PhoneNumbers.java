package com.fedex.dto.kibo.order.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumbers{

	@JsonProperty("mobile")
	private String mobile;

	@JsonProperty("home")
	private String home;

	@JsonProperty("work")
	private String work;

	public String getMobile(){
		return mobile;
	}

	public String getHome(){
		return home;
	}

	public String getWork(){
		return work;
	}
}