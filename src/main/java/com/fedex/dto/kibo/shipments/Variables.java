package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Variables{

	@JsonProperty("initiator")
	private Initiator initiator;

	@JsonProperty("currentState")
	private CurrentState currentState;

	@JsonProperty("canceled")
	private Canceled canceled;

	@JsonProperty("back")
	private Back back;

	@JsonProperty("shipmentAccepted")
	private ShipmentAccepted shipmentAccepted;

	@JsonProperty("stockLevel")
	private StockLevel stockLevel;

	public Initiator getInitiator(){
		return initiator;
	}

	public CurrentState getCurrentState(){
		return currentState;
	}

	public Canceled getCanceled(){
		return canceled;
	}

	public Back getBack(){
		return back;
	}

	public ShipmentAccepted getShipmentAccepted(){
		return shipmentAccepted;
	}

	public StockLevel getStockLevel(){
		return stockLevel;
	}
}