package com.fedex.dto.kibo.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InteractionsItem{

	@JsonProperty("gatewayAVSCodes")
	private String gatewayAVSCodes;

	@JsonProperty("gatewayCVV2Codes")
	private String gatewayCVV2Codes;

	@JsonProperty("amount")
	private int amount;

	@JsonProperty("paymentEntryStatus")
	private String paymentEntryStatus;

	@JsonProperty("isManual")
	private boolean isManual;

	@JsonProperty("gatewayResponseCode")
	private String gatewayResponseCode;

	@JsonProperty("isRecurring")
	private boolean isRecurring;

	@JsonProperty("gatewayAuthCode")
	private String gatewayAuthCode;

	@JsonProperty("gatewayResponseText")
	private String gatewayResponseText;

	@JsonProperty("interactionDate")
	private String interactionDate;

	@JsonProperty("gatewayTransactionId")
	private String gatewayTransactionId;

	@JsonProperty("interactionType")
	private String interactionType;

	@JsonProperty("currencyCode")
	private String currencyCode;

	@JsonProperty("status")
	private String status;

	public String getGatewayAVSCodes(){
		return gatewayAVSCodes;
	}

	public String getGatewayCVV2Codes(){
		return gatewayCVV2Codes;
	}

	public int getAmount(){
		return amount;
	}

	public String getPaymentEntryStatus(){
		return paymentEntryStatus;
	}

	public boolean isIsManual(){
		return isManual;
	}

	public String getGatewayResponseCode(){
		return gatewayResponseCode;
	}

	public boolean isIsRecurring(){
		return isRecurring;
	}

	public String getGatewayAuthCode(){
		return gatewayAuthCode;
	}

	public String getGatewayResponseText(){
		return gatewayResponseText;
	}

	public String getInteractionDate(){
		return interactionDate;
	}

	public String getGatewayTransactionId(){
		return gatewayTransactionId;
	}

	public String getInteractionType(){
		return interactionType;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public String getStatus(){
		return status;
	}
}