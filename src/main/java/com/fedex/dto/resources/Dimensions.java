package com.fedex.dto.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dimensions{

	@JsonProperty("length")
	private int length;

	@JsonProperty("width")
	private int width;

	@JsonProperty("units")
	private String units;

	@JsonProperty("height")
	private int height;

	public int getLength(){
		return length;
	}

	public int getWidth(){
		return width;
	}

	public String getUnits(){
		return units;
	}

	public int getHeight(){
		return height;
	}
}