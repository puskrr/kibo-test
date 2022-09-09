package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Page{

	@JsonProperty("number")
	private int number;

	@JsonProperty("size")
	private int size;

	@JsonProperty("totalPages")
	private int totalPages;

	@JsonProperty("totalElements")
	private int totalElements;

	public int getNumber(){
		return number;
	}

	public int getSize(){
		return size;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public int getTotalElements(){
		return totalElements;
	}
}