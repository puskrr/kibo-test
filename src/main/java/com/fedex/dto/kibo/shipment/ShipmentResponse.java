package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentResponse {

	@JsonProperty("_embedded")
	private Embedded embedded;

	@JsonProperty("_links")
	private Links links;

	@JsonProperty("page")
	private Page page;

	public Embedded getEmbedded(){
		return embedded;
	}

	public Links getLinks(){
		return links;
	}

	public Page getPage(){
		return page;
	}
}