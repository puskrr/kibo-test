package com.fedex.dto.kibo.order.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stock{

	@JsonProperty("manageStock")
	private boolean manageStock;

	@JsonProperty("aggregateInventory")
	private int aggregateInventory;

	@JsonProperty("stockAvailable")
	private int stockAvailable;

	@JsonProperty("isOnBackOrder")
	private boolean isOnBackOrder;

	public boolean isManageStock(){
		return manageStock;
	}

	public int getAggregateInventory(){
		return aggregateInventory;
	}

	public int getStockAvailable(){
		return stockAvailable;
	}

	public boolean isIsOnBackOrder(){
		return isOnBackOrder;
	}
}