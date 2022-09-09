package com.fedex.dto.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SupportContact{

	@JsonProperty("emailAddress")
	private String emailAddress;

	@JsonProperty("phoneNumber")
	private String phoneNumber;

	@JsonProperty("url")
	private String url;

	public String getEmailAddress(){
		return emailAddress;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public String getUrl(){
		return url;
	}
}