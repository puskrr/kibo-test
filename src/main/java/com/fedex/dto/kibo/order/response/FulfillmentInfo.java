package com.fedex.dto.kibo.order.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FulfillmentInfo{

	@JsonProperty("fulfillmentContact")
	private FulfillmentContact fulfillmentContact;

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("shippingMethodCode")
	private String shippingMethodCode;

	@JsonProperty("shippingMethodName")
	private String shippingMethodName;

	public FulfillmentContact getFulfillmentContact(){
		return fulfillmentContact;
	}

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public String getShippingMethodCode(){
		return shippingMethodCode;
	}

	public String getShippingMethodName(){
		return shippingMethodName;
	}
}