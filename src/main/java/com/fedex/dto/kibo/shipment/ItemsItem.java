package com.fedex.dto.kibo.shipment;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("manageStock")
	private boolean manageStock;

	@JsonProperty("actualPrice")
	private int actualPrice;

	@JsonProperty("taxableLineItemCost")
	private int taxableLineItemCost;

	@JsonProperty("weightedShipmentAdjustment")
	private int weightedShipmentAdjustment;

	@JsonProperty("itemDiscount")
	private int itemDiscount;

	@JsonProperty("allowsBackOrder")
	private boolean allowsBackOrder;

	@JsonProperty("transferQuantity")
	private int transferQuantity;

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("shippingTax")
	private int shippingTax;

	@JsonProperty("weightedShippingAdjustment")
	private int weightedShippingAdjustment;

	@JsonProperty("shipping")
	private int shipping;

	@JsonProperty("weightedLineItemTaxAdjustment")
	private int weightedLineItemTaxAdjustment;

	@JsonProperty("imageUrl")
	private String imageUrl;

	@JsonProperty("weightedHandlingTaxAdjustment")
	private int weightedHandlingTaxAdjustment;

	@JsonProperty("options")
	private List<Object> options;

	@JsonProperty("lineItemCost")
	private int lineItemCost;

	@JsonProperty("creditValue")
	private int creditValue;

	@JsonProperty("weightedShippingTaxAdjustment")
	private int weightedShippingTaxAdjustment;

	@JsonProperty("taxableShipping")
	private int taxableShipping;

	@JsonProperty("handlingDiscount")
	private int handlingDiscount;

	@JsonProperty("unitPrice")
	private int unitPrice;

	@JsonProperty("allowsFutureAllocate")
	private boolean allowsFutureAllocate;

	@JsonProperty("quantity")
	private int quantity;

	@JsonProperty("handlingTax")
	private int handlingTax;

	@JsonProperty("weightedDutyAdjustment")
	private int weightedDutyAdjustment;

	@JsonProperty("lineId")
	private int lineId;

	@JsonProperty("upc")
	private String upc;

	@JsonProperty("isTaxable")
	private boolean isTaxable;

	@JsonProperty("isAssemblyRequired")
	private boolean isAssemblyRequired;

	@JsonProperty("goodsType")
	private String goodsType;

	@JsonProperty("originalOrderItemId")
	private String originalOrderItemId;

	@JsonProperty("productCode")
	private String productCode;

	@JsonProperty("name")
	private String name;

	@JsonProperty("taxableHandling")
	private int taxableHandling;

	@JsonProperty("duty")
	private int duty;

	@JsonProperty("weightedHandlingAdjustment")
	private int weightedHandlingAdjustment;

	@JsonProperty("itemTax")
	private int itemTax;

	@JsonProperty("handling")
	private int handling;

	@JsonProperty("shippingDiscount")
	private int shippingDiscount;

	@JsonProperty("isPackagedStandAlone")
	private boolean isPackagedStandAlone;

	@JsonProperty("readyForPickupQuantity")
	private int readyForPickupQuantity;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("trueTransferQuantity")
	private int trueTransferQuantity;

	@JsonProperty("weightUnit")
	private String weightUnit;

	@JsonProperty("variationProductCode")
	private String variationProductCode;

	public boolean isManageStock(){
		return manageStock;
	}

	public int getActualPrice(){
		return actualPrice;
	}

	public int getTaxableLineItemCost(){
		return taxableLineItemCost;
	}

	public int getWeightedShipmentAdjustment(){
		return weightedShipmentAdjustment;
	}

	public int getItemDiscount(){
		return itemDiscount;
	}

	public boolean isAllowsBackOrder(){
		return allowsBackOrder;
	}

	public int getTransferQuantity(){
		return transferQuantity;
	}

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public int getShippingTax(){
		return shippingTax;
	}

	public int getWeightedShippingAdjustment(){
		return weightedShippingAdjustment;
	}

	public int getShipping(){
		return shipping;
	}

	public int getWeightedLineItemTaxAdjustment(){
		return weightedLineItemTaxAdjustment;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public int getWeightedHandlingTaxAdjustment(){
		return weightedHandlingTaxAdjustment;
	}

	public List<Object> getOptions(){
		return options;
	}

	public int getLineItemCost(){
		return lineItemCost;
	}

	public int getCreditValue(){
		return creditValue;
	}

	public int getWeightedShippingTaxAdjustment(){
		return weightedShippingTaxAdjustment;
	}

	public int getTaxableShipping(){
		return taxableShipping;
	}

	public int getHandlingDiscount(){
		return handlingDiscount;
	}

	public int getUnitPrice(){
		return unitPrice;
	}

	public boolean isAllowsFutureAllocate(){
		return allowsFutureAllocate;
	}

	public int getQuantity(){
		return quantity;
	}

	public int getHandlingTax(){
		return handlingTax;
	}

	public int getWeightedDutyAdjustment(){
		return weightedDutyAdjustment;
	}

	public int getLineId(){
		return lineId;
	}

	public String getUpc(){
		return upc;
	}

	public boolean isIsTaxable(){
		return isTaxable;
	}

	public boolean isIsAssemblyRequired(){
		return isAssemblyRequired;
	}

	public String getGoodsType(){
		return goodsType;
	}

	public String getOriginalOrderItemId(){
		return originalOrderItemId;
	}

	public String getProductCode(){
		return productCode;
	}

	public String getName(){
		return name;
	}

	public int getTaxableHandling(){
		return taxableHandling;
	}

	public int getDuty(){
		return duty;
	}

	public int getWeightedHandlingAdjustment(){
		return weightedHandlingAdjustment;
	}

	public int getItemTax(){
		return itemTax;
	}

	public int getHandling(){
		return handling;
	}

	public int getShippingDiscount(){
		return shippingDiscount;
	}

	public boolean isIsPackagedStandAlone(){
		return isPackagedStandAlone;
	}

	public int getReadyForPickupQuantity(){
		return readyForPickupQuantity;
	}

	public int getWeight(){
		return weight;
	}

	public int getTrueTransferQuantity(){
		return trueTransferQuantity;
	}

	public String getWeightUnit(){
		return weightUnit;
	}

	public String getVariationProductCode(){
		return variationProductCode;
	}
}