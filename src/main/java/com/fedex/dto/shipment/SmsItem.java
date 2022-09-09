package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmsItem{

	@JsonProperty("notifyOnShipment")
	private boolean notifyOnShipment;

	@JsonProperty("notifyOnDelivery")
	private boolean notifyOnDelivery;

	@JsonProperty("recipientType")
	private String recipientType;

	@JsonProperty("phoneNumber")
	private String phoneNumber;

	@JsonProperty("recipientOptInTimestamp")
	private long recipientOptInTimestamp;

	@JsonProperty("notifyOnInTransit")
	private boolean notifyOnInTransit;

	@JsonProperty("notifyOnException")
	private boolean notifyOnException;

	@JsonProperty("locale")
	private String locale;

	@JsonProperty("notifyOnNextStop")
	private boolean notifyOnNextStop;

	public boolean isNotifyOnShipment(){
		return notifyOnShipment;
	}

	public boolean isNotifyOnDelivery(){
		return notifyOnDelivery;
	}

	public String getRecipientType(){
		return recipientType;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public long getRecipientOptInTimestamp(){
		return recipientOptInTimestamp;
	}

	public boolean isNotifyOnInTransit(){
		return notifyOnInTransit;
	}

	public boolean isNotifyOnException(){
		return notifyOnException;
	}

	public String getLocale(){
		return locale;
	}

	public boolean isNotifyOnNextStop(){
		return notifyOnNextStop;
	}
}