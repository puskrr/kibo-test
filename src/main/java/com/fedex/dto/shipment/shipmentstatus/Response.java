package com.fedex.dto.shipment.shipmentstatus;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("statusEvents")
	private List<StatusEventsItem> statusEvents;

	public List<StatusEventsItem> getStatusEvents(){
		return statusEvents;
	}
}