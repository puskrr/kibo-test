package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Reassign{

	@JsonProperty("method")
	private String method;

	@JsonProperty("href")
	private String href;

	public String getMethod(){
		return method;
	}

	public String getHref(){
		return href;
	}
}