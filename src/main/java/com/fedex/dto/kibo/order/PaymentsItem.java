package com.fedex.dto.kibo.order;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentsItem{

	@JsonProperty("amountCredited")
	private int amountCredited;

	@JsonProperty("billingInfo")
	private BillingInfo billingInfo;

	@JsonProperty("amountCollected")
	private int amountCollected;

	@JsonProperty("isRecurring")
	private boolean isRecurring;

	@JsonProperty("amountRequested")
	private int amountRequested;

	@JsonProperty("paymentWorkflow")
	private String paymentWorkflow;

	@JsonProperty("paymentType")
	private String paymentType;

	@JsonProperty("status")
	private String status;

	@JsonProperty("interactions")
	private List<InteractionsItem> interactions;

	public int getAmountCredited(){
		return amountCredited;
	}

	public BillingInfo getBillingInfo(){
		return billingInfo;
	}

	public int getAmountCollected(){
		return amountCollected;
	}

	public boolean isIsRecurring(){
		return isRecurring;
	}

	public int getAmountRequested(){
		return amountRequested;
	}

	public String getPaymentWorkflow(){
		return paymentWorkflow;
	}

	public String getPaymentType(){
		return paymentType;
	}

	public String getStatus(){
		return status;
	}

	public List<InteractionsItem> getInteractions(){
		return interactions;
	}
}