package com.fedex.dto.resources;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PackagesItem{

	@JsonProperty("weight")
	private Weight weight;

	@JsonProperty("items")
	private List<ItemsItem> items;

	@JsonProperty("dimensions")
	private Dimensions dimensions;

	public Weight getWeight(){
		return weight;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	public Dimensions getDimensions(){
		return dimensions;
	}
}