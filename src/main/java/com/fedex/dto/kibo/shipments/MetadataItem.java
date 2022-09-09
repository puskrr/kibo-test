package com.fedex.dto.kibo.shipments;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MetadataItem{

	@JsonProperty("changeReason")
	private String changeReason;

	@JsonProperty("amount")
	private int amount;

	@JsonProperty("orderNumber")
	private int orderNumber;

	@JsonProperty("orderId")
	private String orderId;

	@JsonProperty("childShipmentNumbers")
	private List<Integer> childShipmentNumbers;

	@JsonProperty("shipmentNumber")
	private int shipmentNumber;

	@JsonProperty("fulfillmentLocationCode")
	private String fulfillmentLocationCode;

	@JsonProperty("shipmentStatus")
	private String shipmentStatus;

	@JsonProperty("shipmentType")
	private String shipmentType;

	public String getChangeReason(){
		return changeReason;
	}

	public int getAmount(){
		return amount;
	}

	public int getOrderNumber(){
		return orderNumber;
	}

	public String getOrderId(){
		return orderId;
	}

	public List<Integer> getChildShipmentNumbers(){
		return childShipmentNumbers;
	}

	public int getShipmentNumber(){
		return shipmentNumber;
	}

	public String getFulfillmentLocationCode(){
		return fulfillmentLocationCode;
	}

	public String getShipmentStatus(){
		return shipmentStatus;
	}

	public String getShipmentType(){
		return shipmentType;
	}
}