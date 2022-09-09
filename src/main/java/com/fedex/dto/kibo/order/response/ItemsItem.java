package com.fedex.dto.kibo.order.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("weightedOrderShippingTax")
	private int weightedOrderShippingTax;

	@JsonProperty("weightedOrderTax")
	private int weightedOrderTax;

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("total")
	private int total;

	@JsonProperty("shippingDiscounts")
	private List<Object> shippingDiscounts;

	@JsonProperty("weightedOrderDiscount")
	private int weightedOrderDiscount;

	@JsonProperty("adjustedLineItemSubtotal")
	private int adjustedLineItemSubtotal;

	@JsonProperty("weightedOrderShippingManualAdjustment")
	private int weightedOrderShippingManualAdjustment;

	@JsonProperty("weightedOrderDuty")
	private int weightedOrderDuty;

	@JsonProperty("id")
	private String id;

	@JsonProperty("shippingAmountBeforeDiscountsAndAdjustments")
	private int shippingAmountBeforeDiscountsAndAdjustments;

	@JsonProperty("unitPrice")
	private UnitPrice unitPrice;

	@JsonProperty("product")
	private Product product;

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("productDiscounts")
	private List<Object> productDiscounts;

	@JsonProperty("feeTotal")
	private int feeTotal;

	@JsonProperty("fulfillmentMethod")
	private String fulfillmentMethod;

	@JsonProperty("lineId")
	private int lineId;

	@JsonProperty("weightedOrderHandlingFee")
	private int weightedOrderHandlingFee;

	@JsonProperty("totalWithWeightedShippingAndHandling")
	private int totalWithWeightedShippingAndHandling;

	@JsonProperty("shippingTaxTotal")
	private int shippingTaxTotal;

	@JsonProperty("isAssemblyRequired")
	private boolean isAssemblyRequired;

	@JsonProperty("totalWithoutWeightedShippingAndHandling")
	private int totalWithoutWeightedShippingAndHandling;

	@JsonProperty("discountedTotal")
	private int discountedTotal;

	@JsonProperty("shippingTotal")
	private int shippingTotal;

	@JsonProperty("discountTotal")
	private int discountTotal;

	@JsonProperty("subtotal")
	private int subtotal;

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

	public int getWeightedOrderShippingTax(){
		return weightedOrderShippingTax;
	}

	public int getWeightedOrderTax(){
		return weightedOrderTax;
	}

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public int getTotal(){
		return total;
	}

	public List<Object> getShippingDiscounts(){
		return shippingDiscounts;
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

	public String getId(){
		return id;
	}

	public int getShippingAmountBeforeDiscountsAndAdjustments(){
		return shippingAmountBeforeDiscountsAndAdjustments;
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

	public int getFeeTotal(){
		return feeTotal;
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

	public int getShippingTaxTotal(){
		return shippingTaxTotal;
	}

	public boolean isIsAssemblyRequired(){
		return isAssemblyRequired;
	}

	public int getTotalWithoutWeightedShippingAndHandling(){
		return totalWithoutWeightedShippingAndHandling;
	}

	public int getDiscountedTotal(){
		return discountedTotal;
	}

	public int getShippingTotal(){
		return shippingTotal;
	}

	public int getDiscountTotal(){
		return discountTotal;
	}

	public int getSubtotal(){
		return subtotal;
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