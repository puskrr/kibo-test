package com.fedex.dto.kibo.order;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderCreationRequest {

	@JsonProperty("isImport")
	private boolean isImport;

	@JsonProperty("feeTotal")
	private int feeTotal;

	@JsonProperty("isTaxExempt")
	private boolean isTaxExempt;

	@JsonProperty("payments")
	private List<PaymentsItem> payments;

	@JsonProperty("taxTotal")
	private int taxTotal;

	@JsonProperty("externalId")
	private String externalId;

	@JsonProperty("submittedDate")
	private String submittedDate;

	@JsonProperty("type")
	private String type;

	@JsonProperty("isHistoricalImport")
	private boolean isHistoricalImport;

	@JsonProperty("shippingTotal")
	private int shippingTotal;

	@JsonProperty("billingInfo")
	private BillingInfo billingInfo;

	@JsonProperty("total")
	private int total;

	@JsonProperty("customerAccountId")
	private int customerAccountId;

	@JsonProperty("subtotal")
	private int subtotal;

	@JsonProperty("amountAvailableForRefund")
	private int amountAvailableForRefund;

	@JsonProperty("fulfillmentInfo")
	private FulfillmentInfo fulfillmentInfo;

	@JsonProperty("items")
	private List<ItemsItem> items;

	@JsonProperty("currencyCode")
	private String currencyCode;

	@JsonProperty("status")
	private String status;

	@JsonProperty("isUnified")
	private boolean isUnified;

	public boolean isIsImport(){
		return isImport;
	}

	public int getFeeTotal(){
		return feeTotal;
	}

	public boolean isIsTaxExempt(){
		return isTaxExempt;
	}

	public List<PaymentsItem> getPayments(){
		return payments;
	}

	public int getTaxTotal(){
		return taxTotal;
	}

	public String getExternalId(){
		return externalId;
	}

	public String getSubmittedDate(){
		return submittedDate;
	}

	public String getType(){
		return type;
	}

	public boolean isIsHistoricalImport(){
		return isHistoricalImport;
	}

	public int getShippingTotal(){
		return shippingTotal;
	}

	public BillingInfo getBillingInfo(){
		return billingInfo;
	}

	public int getTotal(){
		return total;
	}

	public int getCustomerAccountId(){
		return customerAccountId;
	}

	public int getSubtotal(){
		return subtotal;
	}

	public int getAmountAvailableForRefund(){
		return amountAvailableForRefund;
	}

	public FulfillmentInfo getFulfillmentInfo(){
		return fulfillmentInfo;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public String getStatus(){
		return status;
	}

	public boolean isIsUnified(){
		return isUnified;
	}
}