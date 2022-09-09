package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Back{

	@JsonProperty("updateDate")
	private String updateDate;

	@JsonProperty("name")
	private String name;

	@JsonProperty("oldValue")
	private String oldValue;

	@JsonProperty("value")
	private String value;

	public String getUpdateDate(){
		return updateDate;
	}

	public String getName(){
		return name;
	}

	public String getOldValue(){
		return oldValue;
	}

	public String getValue(){
		return value;
	}
}