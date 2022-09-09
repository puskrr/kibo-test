package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OptionsItem{

	@JsonProperty("stringValue")
	private String stringValue;

	@JsonProperty("shopperEnteredValue")
	private String shopperEnteredValue;

	@JsonProperty("name")
	private String name;

	@JsonProperty("value")
	private String value;

	@JsonProperty("attributeFQN")
	private String attributeFQN;

	public String getStringValue(){
		return stringValue;
	}

	public String getShopperEnteredValue(){
		return shopperEnteredValue;
	}

	public String getName(){
		return name;
	}

	public String getValue(){
		return value;
	}

	public String getAttributeFQN(){
		return attributeFQN;
	}
}