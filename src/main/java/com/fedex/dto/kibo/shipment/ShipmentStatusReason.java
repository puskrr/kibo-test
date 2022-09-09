package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentStatusReason{

	@JsonProperty("reasonCode")
	private String reasonCode;

	@JsonProperty("moreInfo")
	private String moreInfo;

	public String getReasonCode(){
		return reasonCode;
	}

	public String getMoreInfo(){
		return moreInfo;
	}
}