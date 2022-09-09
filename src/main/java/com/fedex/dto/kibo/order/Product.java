package com.fedex.dto.kibo.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product{

	@JsonProperty("productCode")
	private String productCode;

	@JsonProperty("price")
	private Price price;

	@JsonProperty("imageUrl")
	private String imageUrl;

	@JsonProperty("name")
	private String name;

	@JsonProperty("isTaxable")
	private boolean isTaxable;

	@JsonProperty("description")
	private String description;

	public String getProductCode(){
		return productCode;
	}

	public Price getPrice(){
		return price;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public String getName(){
		return name;
	}

	public boolean isIsTaxable(){
		return isTaxable;
	}

	public String getDescription(){
		return description;
	}
}