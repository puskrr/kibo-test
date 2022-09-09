package com.fedex.dto.kibo.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BillingInfo{

	@JsonProperty("isSameBillingShippingAddress")
	private boolean isSameBillingShippingAddress;

	@JsonProperty("billingContact")
	private BillingContact billingContact;

	@JsonProperty("isRecurring")
	private boolean isRecurring;

	@JsonProperty("paymentType")
	private String paymentType;

	@JsonProperty("card")
	private Card card;

	public boolean isIsSameBillingShippingAddress(){
		return isSameBillingShippingAddress;
	}

	public BillingContact getBillingContact(){
		return billingContact;
	}

	public boolean isIsRecurring(){
		return isRecurring;
	}

	public String getPaymentType(){
		return paymentType;
	}

	public Card getCard(){
		return card;
	}
}