package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("displayImage")
	private DisplayImage displayImage;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	@JsonProperty("sku")
	private String sku;

	public int getQuantity(){
		return quantity;
	}

	public DisplayImage getDisplayImage(){
		return displayImage;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public String getSku(){
		return sku;
	}
}