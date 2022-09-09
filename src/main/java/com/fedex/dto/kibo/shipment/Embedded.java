package com.fedex.dto.kibo.shipment;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Embedded{

	@JsonProperty("shipments")
	private List<ShipmentsItem> shipments;

	public List<ShipmentsItem> getShipments(){
		return shipments;
	}
}