package com.fedex.dto.kibo.customer.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommerceSummary{

	@JsonProperty("visitsCount")
	private int visitsCount;

	@JsonProperty("totalOrderAmount")
	private TotalOrderAmount totalOrderAmount;

	@JsonProperty("orderCount")
	private int orderCount;

	@JsonProperty("wishlistCount")
	private int wishlistCount;

	public int getVisitsCount(){
		return visitsCount;
	}

	public TotalOrderAmount getTotalOrderAmount(){
		return totalOrderAmount;
	}

	public int getOrderCount(){
		return orderCount;
	}

	public int getWishlistCount(){
		return wishlistCount;
	}
}