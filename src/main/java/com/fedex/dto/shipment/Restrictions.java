package com.fedex.dto.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Restrictions{

	@JsonProperty("noHAL")
	private boolean noHAL;

	@JsonProperty("noRecipientRedirect")
	private boolean noRecipientRedirect;

	@JsonProperty("noRemoteSignature")
	private boolean noRemoteSignature;

	public boolean isNoHAL(){
		return noHAL;
	}

	public boolean isNoRecipientRedirect(){
		return noRecipientRedirect;
	}

	public boolean isNoRemoteSignature(){
		return noRemoteSignature;
	}
}