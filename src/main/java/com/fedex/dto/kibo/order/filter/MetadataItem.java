package com.fedex.dto.kibo.order.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetadataItem{

	@JsonProperty("newValue")
	private String newValue;

	@JsonProperty("oldValue")
	private String oldValue;

	public String getNewValue(){
		return newValue;
	}

	public String getOldValue(){
		return oldValue;
	}
}