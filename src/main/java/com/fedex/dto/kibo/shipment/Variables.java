package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Variables{

	@JsonProperty("canceled")
	private Canceled canceled;

	@JsonProperty("initiator")
	private Initiator initiator;

	@JsonProperty("back")
	private Back back;

	@JsonProperty("currentState")
	private CurrentState currentState;

	@JsonProperty("shipmentAccepted")
	private ShipmentAccepted shipmentAccepted;

	@JsonProperty("stockLevel")
	private StockLevel stockLevel;

	public Canceled getCanceled(){
		return canceled;
	}

	public Initiator getInitiator(){
		return initiator;
	}

	public Back getBack(){
		return back;
	}

	public CurrentState getCurrentState(){
		return currentState;
	}

	public ShipmentAccepted getShipmentAccepted(){
		return shipmentAccepted;
	}

	public StockLevel getStockLevel(){
		return stockLevel;
	}
}