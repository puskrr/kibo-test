package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer{

	@JsonProperty("customerContact")
	private CustomerContact customerContact;

	public CustomerContact getCustomerContact(){
		return customerContact;
	}
}