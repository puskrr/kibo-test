package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusEventsItem{

	@JsonProperty("eventCode")
	private String eventCode;

	@JsonProperty("eventDesc")
	private String eventDesc;

	@JsonProperty("statusDesc")
	private String statusDesc;

	@JsonProperty("city")
	private String city;

	@JsonProperty("state")
	private String state;

	@JsonProperty("timestamp")
	private long timestamp;

	@JsonProperty("statusCode")
	private String statusCode;

	public String getEventCode(){
		return eventCode;
	}

	public String getEventDesc(){
		return eventDesc;
	}

	public String getStatusDesc(){
		return statusDesc;
	}

	public String getCity(){
		return city;
	}

	public String getState(){
		return state;
	}

	public long getTimestamp(){
		return timestamp;
	}

	public String getStatusCode(){
		return statusCode;
	}
}