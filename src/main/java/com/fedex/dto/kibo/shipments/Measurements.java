package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Measurements{

	@JsonProperty("length")
	private Length length;

	@JsonProperty("width")
	private Width width;

	@JsonProperty("weight")
	private Weight weight;

	@JsonProperty("height")
	private Height height;

	public Length getLength(){
		return length;
	}

	public Width getWidth(){
		return width;
	}

	public Weight getWeight(){
		return weight;
	}

	public Height getHeight(){
		return height;
	}
}