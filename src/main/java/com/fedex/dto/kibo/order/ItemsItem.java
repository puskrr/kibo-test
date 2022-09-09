package com.fedex.dto.kibo.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("unitPrice")
	private UnitPrice unitPrice;

	@JsonProperty("product")
	private Product product;

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("feeTotal")
	private int feeTotal;

	@JsonProperty("fulfillmentMethod")
	private String fulfillmentMethod;

	@JsonProperty("lineId")
	private int lineId;

	@JsonProperty("shippingTaxTotal")
	private int shippingTaxTotal;

	@JsonProperty("discountedTotal")
	private int discountedTotal;

	@JsonProperty("shippingTotal")
	private int shippingTotal;

	@JsonProperty("total")
	private int total;

	@JsonProperty("discountTotal")
	private int discountTotal;

	@JsonProperty("subtotal")
	private int subtotal;

	@JsonProperty("taxableTotal")
	private int taxableTotal;

	public UnitPrice getUnitPrice(){
		return unitPrice;
	}

	public Product getProduct(){
		return product;
	}

	public int getQuantity(){
		return quantity;
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

	public int getShippingTaxTotal(){
		return shippingTaxTotal;
	}

	public int getDiscountedTotal(){
		return discountedTotal;
	}

	public int getShippingTotal(){
		return shippingTotal;
	}

	public int getTotal(){
		return total;
	}

	public int getDiscountTotal(){
		return discountTotal;
	}

	public int getSubtotal(){
		return subtotal;
	}

	public int getTaxableTotal(){
		return taxableTotal;
	}
}