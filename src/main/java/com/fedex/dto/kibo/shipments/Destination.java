package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Destination{

	@JsonProperty("destinationContact")
	private DestinationContact destinationContact;

	@JsonProperty("isDestinationCommercial")
	private boolean isDestinationCommercial;

	public DestinationContact getDestinationContact(){
		return destinationContact;
	}

	public boolean isIsDestinationCommercial(){
		return isDestinationCommercial;
	}
}