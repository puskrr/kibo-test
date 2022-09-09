package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{

	@JsonProperty("hoursOfOperationEnd")
	private long hoursOfOperationEnd;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("residential")
	private boolean residential;

	@JsonProperty("hoursOfOperationStart")
	private long hoursOfOperationStart;

	public long getHoursOfOperationEnd(){
		return hoursOfOperationEnd;
	}

	public Address getAddress(){
		return address;
	}

	public boolean isResidential(){
		return residential;
	}

	public long getHoursOfOperationStart(){
		return hoursOfOperationStart;
	}
}