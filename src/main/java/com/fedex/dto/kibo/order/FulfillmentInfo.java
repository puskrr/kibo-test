package com.fedex.dto.kibo.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FulfillmentInfo{

	@JsonProperty("fulfillmentContact")
	private FulfillmentContact fulfillmentContact;

	@JsonProperty("shippingMethodCode")
	private String shippingMethodCode;

	@JsonProperty("shippingMethodName")
	private String shippingMethodName;

	public FulfillmentContact getFulfillmentContact(){
		return fulfillmentContact;
	}

	public String getShippingMethodCode(){
		return shippingMethodCode;
	}

	public String getShippingMethodName(){
		return shippingMethodName;
	}
}