package com.fedex.dto.shipment;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Notifications{

	@JsonProperty("sms")
	private List<SmsItem> sms;

	@JsonProperty("email")
	private List<EmailItem> email;

	public List<SmsItem> getSms(){
		return sms;
	}

	public List<EmailItem> getEmail(){
		return email;
	}
}