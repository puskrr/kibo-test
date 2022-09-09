package com.fedex.dto.kibo.order.filter;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentsItem{

	@JsonProperty("availableActions")
	private List<String> availableActions;

	@JsonProperty("amountCredited")
	private int amountCredited;

	@JsonProperty("orderId")
	private String orderId;

	@JsonProperty("amountCollected")
	private int amountCollected;

	@JsonProperty("isRecurring")
	private boolean isRecurring;

	@JsonProperty("subPayments")
	private List<Object> subPayments;

	@JsonProperty("paymentType")
	private String paymentType;

	@JsonProperty("interactions")
	private List<InteractionsItem> interactions;

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("billingInfo")
	private BillingInfo billingInfo;

	@JsonProperty("changeMessages")
	private List<Object> changeMessages;

	@JsonProperty("paymentServiceTransactionId")
	private String paymentServiceTransactionId;

	@JsonProperty("id")
	private String id;

	@JsonProperty("amountRequested")
	private int amountRequested;

	@JsonProperty("paymentWorkflow")
	private String paymentWorkflow;

	@JsonProperty("status")
	private String status;

	public List<String> getAvailableActions(){
		return availableActions;
	}

	public int getAmountCredited(){
		return amountCredited;
	}

	public String getOrderId(){
		return orderId;
	}

	public int getAmountCollected(){
		return amountCollected;
	}

	public boolean isIsRecurring(){
		return isRecurring;
	}

	public List<Object> getSubPayments(){
		return subPayments;
	}

	public String getPaymentType(){
		return paymentType;
	}

	public List<InteractionsItem> getInteractions(){
		return interactions;
	}

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public BillingInfo getBillingInfo(){
		return billingInfo;
	}

	public List<Object> getChangeMessages(){
		return changeMessages;
	}

	public String getPaymentServiceTransactionId(){
		return paymentServiceTransactionId;
	}

	public String getId(){
		return id;
	}

	public int getAmountRequested(){
		return amountRequested;
	}

	public String getPaymentWorkflow(){
		return paymentWorkflow;
	}

	public String getStatus(){
		return status;
	}
}