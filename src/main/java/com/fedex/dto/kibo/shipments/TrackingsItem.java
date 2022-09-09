package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrackingsItem{

	@JsonProperty("number")
	private String number;

	@JsonProperty("url")
	private String url;

	public String getNumber(){
		return number;
	}

	public String getUrl(){
		return url;
	}
}