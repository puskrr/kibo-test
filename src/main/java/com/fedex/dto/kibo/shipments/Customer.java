package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer{

	@JsonProperty("customerContact")
	private CustomerContact customerContact;

	public CustomerContact getCustomerContact(){
		return customerContact;
	}
}