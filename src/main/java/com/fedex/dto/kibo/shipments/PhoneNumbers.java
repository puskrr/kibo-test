package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumbers{

	@JsonProperty("work")
	private String work;

	@JsonProperty("mobile")
	private String mobile;

	@JsonProperty("home")
	private String home;

	public String getWork(){
		return work;
	}

	public String getMobile(){
		return mobile;
	}

	public String getHome(){
		return home;
	}
}