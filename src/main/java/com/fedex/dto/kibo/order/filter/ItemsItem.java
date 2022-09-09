package com.fedex.dto.kibo.order.filter;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("orderNumber")
	private int orderNumber;

	@JsonProperty("notes")
	private List<Object> notes;

	@JsonProperty("amountRemainingForPayment")
	private int amountRemainingForPayment;

	@JsonProperty("taxTotal")
	private int taxTotal;

	@JsonProperty("returnStatus")
	private String returnStatus;

	@JsonProperty("isDraft")
	private boolean isDraft;

	@JsonProperty("discountedSubtotal")
	private int discountedSubtotal;

	@JsonProperty("type")
	private String type;

	@JsonProperty("submittedDate")
	private String submittedDate;

	@JsonProperty("acceptedDate")
	private String acceptedDate;

	@JsonProperty("fulfillmentStatus")
	private String fulfillmentStatus;

	@JsonProperty("isHistoricalImport")
	private boolean isHistoricalImport;

	@JsonProperty("extendedProperties")
	private List<Object> extendedProperties;

	@JsonProperty("shippingDiscounts")
	private List<Object> shippingDiscounts;

	@JsonProperty("digitalPackages")
	private List<Object> digitalPackages;

	@JsonProperty("amountRefunded")
	private int amountRefunded;

	@JsonProperty("id")
	private String id;

	@JsonProperty("couponCodes")
	private List<Object> couponCodes;

	@JsonProperty("ipAddress")
	private String ipAddress;

	@JsonProperty("orderDiscounts")
	private List<Object> orderDiscounts;

	@JsonProperty("packages")
	private List<Object> packages;

	@JsonProperty("version")
	private String version;

	@JsonProperty("isPartialOrder")
	private boolean isPartialOrder;

	@JsonProperty("discountedTotal")
	private int discountedTotal;

	@JsonProperty("handlingTaxTotal")
	private int handlingTaxTotal;

	@JsonProperty("billingInfo")
	private BillingInfo billingInfo;

	@JsonProperty("customerAccountId")
	private int customerAccountId;

	@JsonProperty("handlingDiscounts")
	private List<Object> handlingDiscounts;

	@JsonProperty("subtotal")
	private int subtotal;

	@JsonProperty("invalidCoupons")
	private List<Object> invalidCoupons;

	@JsonProperty("isOptInForSms")
	private boolean isOptInForSms;

	@JsonProperty("isEligibleForReturns")
	private boolean isEligibleForReturns;

	@JsonProperty("items")
	private List<ItemsItem> items;

	@JsonProperty("status")
	private String status;

	@JsonProperty("hasDraft")
	private boolean hasDraft;

	@JsonProperty("totalCollected")
	private int totalCollected;

	@JsonProperty("isFulfillable")
	private boolean isFulfillable;

	@JsonProperty("payments")
	private List<PaymentsItem> payments;

	@JsonProperty("continuityOrderOrdinal")
	private int continuityOrderOrdinal;

	@JsonProperty("refunds")
	private List<Object> refunds;

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("total")
	private int total;

	@JsonProperty("validationResults")
	private List<Object> validationResults;

	@JsonProperty("credits")
	private List<Object> credits;

	@JsonProperty("fulfillmentInfo")
	private FulfillmentInfo fulfillmentInfo;

	@JsonProperty("email")
	private String email;

	@JsonProperty("paymentStatus")
	private String paymentStatus;

	@JsonProperty("shippingAmountBeforeDiscountsAndAdjustments")
	private int shippingAmountBeforeDiscountsAndAdjustments;

	@JsonProperty("isUnified")
	private boolean isUnified;

	@JsonProperty("channelCode")
	private String channelCode;

	@JsonProperty("itemTaxTotal")
	private int itemTaxTotal;

	@JsonProperty("handlingTotal")
	private int handlingTotal;

	@JsonProperty("isImport")
	private boolean isImport;

	@JsonProperty("handlingAmount")
	private int handlingAmount;

	@JsonProperty("feeTotal")
	private int feeTotal;

	@JsonProperty("isTaxExempt")
	private boolean isTaxExempt;

	@JsonProperty("lineItemSubtotalWithOrderAdjustments")
	private int lineItemSubtotalWithOrderAdjustments;

	@JsonProperty("shippingSubTotal")
	private int shippingSubTotal;

	@JsonProperty("externalId")
	private String externalId;

	@JsonProperty("shippingTaxTotal")
	private int shippingTaxTotal;

	@JsonProperty("shippingTotal")
	private int shippingTotal;

	@JsonProperty("changeMessages")
	private List<ChangeMessagesItem> changeMessages;

	@JsonProperty("discountTotal")
	private int discountTotal;

	@JsonProperty("customerInteractionType")
	private String customerInteractionType;

	@JsonProperty("readyToCapture")
	private boolean readyToCapture;

	@JsonProperty("tenantId")
	private int tenantId;

	@JsonProperty("siteId")
	private int siteId;

	@JsonProperty("attributes")
	private List<Object> attributes;

	@JsonProperty("pickups")
	private List<Object> pickups;

	@JsonProperty("amountAvailableForRefund")
	private int amountAvailableForRefund;

	@JsonProperty("currencyCode")
	private String currencyCode;

	@JsonProperty("weightedOrderShippingTax")
	private int weightedOrderShippingTax;

	@JsonProperty("weightedOrderTax")
	private int weightedOrderTax;

	@JsonProperty("weightedOrderDiscount")
	private int weightedOrderDiscount;

	@JsonProperty("adjustedLineItemSubtotal")
	private int adjustedLineItemSubtotal;

	@JsonProperty("weightedOrderShippingManualAdjustment")
	private int weightedOrderShippingManualAdjustment;

	@JsonProperty("weightedOrderDuty")
	private int weightedOrderDuty;

	@JsonProperty("unitPrice")
	private UnitPrice unitPrice;

	@JsonProperty("product")
	private Product product;

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("productDiscounts")
	private List<Object> productDiscounts;

	@JsonProperty("fulfillmentMethod")
	private String fulfillmentMethod;

	@JsonProperty("lineId")
	private int lineId;

	@JsonProperty("weightedOrderHandlingFee")
	private int weightedOrderHandlingFee;

	@JsonProperty("totalWithWeightedShippingAndHandling")
	private int totalWithWeightedShippingAndHandling;

	@JsonProperty("isAssemblyRequired")
	private boolean isAssemblyRequired;

	@JsonProperty("totalWithoutWeightedShippingAndHandling")
	private int totalWithoutWeightedShippingAndHandling;

	@JsonProperty("extendedTotal")
	private int extendedTotal;

	@JsonProperty("weightedOrderHandlingAdjustment")
	private int weightedOrderHandlingAdjustment;

	@JsonProperty("weightedOrderShipping")
	private int weightedOrderShipping;

	@JsonProperty("taxableTotal")
	private int taxableTotal;

	@JsonProperty("weightedOrderAdjustment")
	private int weightedOrderAdjustment;

	public int getOrderNumber(){
		return orderNumber;
	}

	public List<Object> getNotes(){
		return notes;
	}

	public int getAmountRemainingForPayment(){
		return amountRemainingForPayment;
	}

	public int getTaxTotal(){
		return taxTotal;
	}

	public String getReturnStatus(){
		return returnStatus;
	}

	public boolean isIsDraft(){
		return isDraft;
	}

	public int getDiscountedSubtotal(){
		return discountedSubtotal;
	}

	public String getType(){
		return type;
	}

	public String getSubmittedDate(){
		return submittedDate;
	}

	public String getAcceptedDate(){
		return acceptedDate;
	}

	public String getFulfillmentStatus(){
		return fulfillmentStatus;
	}

	public boolean isIsHistoricalImport(){
		return isHistoricalImport;
	}

	public List<Object> getExtendedProperties(){
		return extendedProperties;
	}

	public List<Object> getShippingDiscounts(){
		return shippingDiscounts;
	}

	public List<Object> getDigitalPackages(){
		return digitalPackages;
	}

	public int getAmountRefunded(){
		return amountRefunded;
	}

	public String getId(){
		return id;
	}

	public List<Object> getCouponCodes(){
		return couponCodes;
	}

	public String getIpAddress(){
		return ipAddress;
	}

	public List<Object> getOrderDiscounts(){
		return orderDiscounts;
	}

	public List<Object> getPackages(){
		return packages;
	}

	public String getVersion(){
		return version;
	}

	public boolean isIsPartialOrder(){
		return isPartialOrder;
	}

	public int getDiscountedTotal(){
		return discountedTotal;
	}

	public int getHandlingTaxTotal(){
		return handlingTaxTotal;
	}

	public BillingInfo getBillingInfo(){
		return billingInfo;
	}

	public int getCustomerAccountId(){
		return customerAccountId;
	}

	public List<Object> getHandlingDiscounts(){
		return handlingDiscounts;
	}

	public int getSubtotal(){
		return subtotal;
	}

	public List<Object> getInvalidCoupons(){
		return invalidCoupons;
	}

	public boolean isIsOptInForSms(){
		return isOptInForSms;
	}

	public boolean isIsEligibleForReturns(){
		return isEligibleForReturns;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	public String getStatus(){
		return status;
	}

	public boolean isHasDraft(){
		return hasDraft;
	}

	public int getTotalCollected(){
		return totalCollected;
	}

	public boolean isIsFulfillable(){
		return isFulfillable;
	}

	public List<PaymentsItem> getPayments(){
		return payments;
	}

	public int getContinuityOrderOrdinal(){
		return continuityOrderOrdinal;
	}

	public List<Object> getRefunds(){
		return refunds;
	}

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public int getTotal(){
		return total;
	}

	public List<Object> getValidationResults(){
		return validationResults;
	}

	public List<Object> getCredits(){
		return credits;
	}

	public FulfillmentInfo getFulfillmentInfo(){
		return fulfillmentInfo;
	}

	public String getEmail(){
		return email;
	}

	public String getPaymentStatus(){
		return paymentStatus;
	}

	public int getShippingAmountBeforeDiscountsAndAdjustments(){
		return shippingAmountBeforeDiscountsAndAdjustments;
	}

	public boolean isIsUnified(){
		return isUnified;
	}

	public String getChannelCode(){
		return channelCode;
	}

	public int getItemTaxTotal(){
		return itemTaxTotal;
	}

	public int getHandlingTotal(){
		return handlingTotal;
	}

	public boolean isIsImport(){
		return isImport;
	}

	public int getHandlingAmount(){
		return handlingAmount;
	}

	public int getFeeTotal(){
		return feeTotal;
	}

	public boolean isIsTaxExempt(){
		return isTaxExempt;
	}

	public int getLineItemSubtotalWithOrderAdjustments(){
		return lineItemSubtotalWithOrderAdjustments;
	}

	public int getShippingSubTotal(){
		return shippingSubTotal;
	}

	public String getExternalId(){
		return externalId;
	}

	public int getShippingTaxTotal(){
		return shippingTaxTotal;
	}

	public int getShippingTotal(){
		return shippingTotal;
	}

	public List<ChangeMessagesItem> getChangeMessages(){
		return changeMessages;
	}

	public int getDiscountTotal(){
		return discountTotal;
	}

	public String getCustomerInteractionType(){
		return customerInteractionType;
	}

	public boolean isReadyToCapture(){
		return readyToCapture;
	}

	public int getTenantId(){
		return tenantId;
	}

	public int getSiteId(){
		return siteId;
	}

	public List<Object> getAttributes(){
		return attributes;
	}

	public List<Object> getPickups(){
		return pickups;
	}

	public int getAmountAvailableForRefund(){
		return amountAvailableForRefund;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public int getWeightedOrderShippingTax(){
		return weightedOrderShippingTax;
	}

	public int getWeightedOrderTax(){
		return weightedOrderTax;
	}

	public int getWeightedOrderDiscount(){
		return weightedOrderDiscount;
	}

	public int getAdjustedLineItemSubtotal(){
		return adjustedLineItemSubtotal;
	}

	public int getWeightedOrderShippingManualAdjustment(){
		return weightedOrderShippingManualAdjustment;
	}

	public int getWeightedOrderDuty(){
		return weightedOrderDuty;
	}

	public UnitPrice getUnitPrice(){
		return unitPrice;
	}

	public Product getProduct(){
		return product;
	}

	public int getQuantity(){
		return quantity;
	}

	public List<Object> getProductDiscounts(){
		return productDiscounts;
	}

	public String getFulfillmentMethod(){
		return fulfillmentMethod;
	}

	public int getLineId(){
		return lineId;
	}

	public int getWeightedOrderHandlingFee(){
		return weightedOrderHandlingFee;
	}

	public int getTotalWithWeightedShippingAndHandling(){
		return totalWithWeightedShippingAndHandling;
	}

	public boolean isIsAssemblyRequired(){
		return isAssemblyRequired;
	}

	public int getTotalWithoutWeightedShippingAndHandling(){
		return totalWithoutWeightedShippingAndHandling;
	}

	public int getExtendedTotal(){
		return extendedTotal;
	}

	public int getWeightedOrderHandlingAdjustment(){
		return weightedOrderHandlingAdjustment;
	}

	public int getWeightedOrderShipping(){
		return weightedOrderShipping;
	}

	public int getTaxableTotal(){
		return taxableTotal;
	}

	public int getWeightedOrderAdjustment(){
		return weightedOrderAdjustment;
	}
}