package com.fedex.dto.kibo.shipment;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ShipmentsItem{

	@JsonProperty("orderNumber")
	private int orderNumber;

	@JsonProperty("orderId")
	private String orderId;

	@JsonProperty("lineItemTaxTotal")
	private int lineItemTaxTotal;

	@JsonProperty("_links")
	private Links links;

	@JsonProperty("shipmentNotes")
	private List<Object> shipmentNotes;

	@JsonProperty("acceptedDate")
	private String acceptedDate;

	@JsonProperty("isExpress")
	private boolean isExpress;

	@JsonProperty("fulfillmentStatus")
	private String fulfillmentStatus;

	@JsonProperty("isHistoricalImport")
	private boolean isHistoricalImport;

	@JsonProperty("shippingMethodCode")
	private String shippingMethodCode;

	@JsonProperty("shippingTaxAdjustment")
	private int shippingTaxAdjustment;

	@JsonProperty("shippingAdjustment")
	private int shippingAdjustment;

	@JsonProperty("dutyAdjustment")
	private int dutyAdjustment;

	@JsonProperty("workflowProcessId")
	private String workflowProcessId;

	@JsonProperty("externalOrderId")
	private String externalOrderId;

	@JsonProperty("packages")
	private List<Object> packages;

	@JsonProperty("rejectedItems")
	private List<Object> rejectedItems;

	@JsonProperty("assignedLocationCode")
	private String assignedLocationCode;

	@JsonProperty("handlingTaxTotal")
	private int handlingTaxTotal;

	@JsonProperty("customerAccountId")
	private int customerAccountId;

	@JsonProperty("lineItemSubtotal")
	private int lineItemSubtotal;

	@JsonProperty("isOptInForSms")
	private boolean isOptInForSms;

	@JsonProperty("shipmentAdjustment")
	private int shipmentAdjustment;

	@JsonProperty("reassignedItems")
	private List<Object> reassignedItems;

	@JsonProperty("items")
	private List<ItemsItem> items;

	@JsonProperty("fulfillmentDate")
	private String fulfillmentDate;

	@JsonProperty("shopperNotes")
	private ShopperNotes shopperNotes;

	@JsonProperty("handlingTaxAdjustment")
	private int handlingTaxAdjustment;

	@JsonProperty("dutyTotal")
	private int dutyTotal;

	@JsonProperty("destination")
	private Destination destination;

	@JsonProperty("lineItemTotal")
	private int lineItemTotal;

	@JsonProperty("handlingSubtotal")
	private int handlingSubtotal;

	@JsonProperty("shipmentType")
	private String shipmentType;

	@JsonProperty("shippingSubtotal")
	private int shippingSubtotal;

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("isAutoAssigned")
	private boolean isAutoAssigned;

	@JsonProperty("total")
	private int total;

	@JsonProperty("orderSubmitDate")
	private String orderSubmitDate;

	@JsonProperty("shipmentNumber")
	private int shipmentNumber;

	@JsonProperty("fulfillmentLocationCode")
	private String fulfillmentLocationCode;

	@JsonProperty("email")
	private String email;

	@JsonProperty("handlingTotal")
	private int handlingTotal;

	@JsonProperty("transferredItems")
	private List<Object> transferredItems;

	@JsonProperty("handlingAdjustment")
	private int handlingAdjustment;

	@JsonProperty("shippingMethodName")
	private String shippingMethodName;

	@JsonProperty("shippingTaxTotal")
	private int shippingTaxTotal;

	@JsonProperty("shippingTotal")
	private int shippingTotal;

	@JsonProperty("lineItemTaxAdjustment")
	private int lineItemTaxAdjustment;

	@JsonProperty("changeMessages")
	private List<ChangeMessagesItem> changeMessages;

	@JsonProperty("workflowState")
	private WorkflowState workflowState;

	@JsonProperty("workflowProcessContainerId")
	private String workflowProcessContainerId;

	@JsonProperty("tenantId")
	private int tenantId;

	@JsonProperty("readyToCapture")
	private boolean readyToCapture;

	@JsonProperty("siteId")
	private int siteId;

	@JsonProperty("currencyCode")
	private String currencyCode;

	@JsonProperty("canceledItems")
	private List<Object> canceledItems;

	@JsonProperty("shipmentStatus")
	private String shipmentStatus;

	@JsonProperty("customer")
	private Customer customer;

	@JsonProperty("childShipmentNumbers")
	private List<Integer> childShipmentNumbers;

	@JsonProperty("transferShipmentNumbers")
	private List<Object> transferShipmentNumbers;

	@JsonProperty("parentShipmentNumber")
	private int parentShipmentNumber;

	@JsonProperty("originalShipmentNumber")
	private int originalShipmentNumber;

	@JsonProperty("shipmentStatusReason")
	private ShipmentStatusReason shipmentStatusReason;

	public int getOrderNumber(){
		return orderNumber;
	}

	public String getOrderId(){
		return orderId;
	}

	public int getLineItemTaxTotal(){
		return lineItemTaxTotal;
	}

	public Links getLinks(){
		return links;
	}

	public List<Object> getShipmentNotes(){
		return shipmentNotes;
	}

	public String getAcceptedDate(){
		return acceptedDate;
	}

	public boolean isIsExpress(){
		return isExpress;
	}

	public String getFulfillmentStatus(){
		return fulfillmentStatus;
	}

	public boolean isIsHistoricalImport(){
		return isHistoricalImport;
	}

	public String getShippingMethodCode(){
		return shippingMethodCode;
	}

	public int getShippingTaxAdjustment(){
		return shippingTaxAdjustment;
	}

	public int getShippingAdjustment(){
		return shippingAdjustment;
	}

	public int getDutyAdjustment(){
		return dutyAdjustment;
	}

	public String getWorkflowProcessId(){
		return workflowProcessId;
	}

	public String getExternalOrderId(){
		return externalOrderId;
	}

	public List<Object> getPackages(){
		return packages;
	}

	public List<Object> getRejectedItems(){
		return rejectedItems;
	}

	public String getAssignedLocationCode(){
		return assignedLocationCode;
	}

	public int getHandlingTaxTotal(){
		return handlingTaxTotal;
	}

	public int getCustomerAccountId(){
		return customerAccountId;
	}

	public int getLineItemSubtotal(){
		return lineItemSubtotal;
	}

	public boolean isIsOptInForSms(){
		return isOptInForSms;
	}

	public int getShipmentAdjustment(){
		return shipmentAdjustment;
	}

	public List<Object> getReassignedItems(){
		return reassignedItems;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	public String getFulfillmentDate(){
		return fulfillmentDate;
	}

	public ShopperNotes getShopperNotes(){
		return shopperNotes;
	}

	public int getHandlingTaxAdjustment(){
		return handlingTaxAdjustment;
	}

	public int getDutyTotal(){
		return dutyTotal;
	}

	public Destination getDestination(){
		return destination;
	}

	public int getLineItemTotal(){
		return lineItemTotal;
	}

	public int getHandlingSubtotal(){
		return handlingSubtotal;
	}

	public String getShipmentType(){
		return shipmentType;
	}

	public int getShippingSubtotal(){
		return shippingSubtotal;
	}

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public boolean isIsAutoAssigned(){
		return isAutoAssigned;
	}

	public int getTotal(){
		return total;
	}

	public String getOrderSubmitDate(){
		return orderSubmitDate;
	}

	public int getShipmentNumber(){
		return shipmentNumber;
	}

	public String getFulfillmentLocationCode(){
		return fulfillmentLocationCode;
	}

	public String getEmail(){
		return email;
	}

	public int getHandlingTotal(){
		return handlingTotal;
	}

	public List<Object> getTransferredItems(){
		return transferredItems;
	}

	public int getHandlingAdjustment(){
		return handlingAdjustment;
	}

	public String getShippingMethodName(){
		return shippingMethodName;
	}

	public int getShippingTaxTotal(){
		return shippingTaxTotal;
	}

	public int getShippingTotal(){
		return shippingTotal;
	}

	public int getLineItemTaxAdjustment(){
		return lineItemTaxAdjustment;
	}

	public List<ChangeMessagesItem> getChangeMessages(){
		return changeMessages;
	}

	public WorkflowState getWorkflowState(){
		return workflowState;
	}

	public String getWorkflowProcessContainerId(){
		return workflowProcessContainerId;
	}

	public int getTenantId(){
		return tenantId;
	}

	public boolean isReadyToCapture(){
		return readyToCapture;
	}

	public int getSiteId(){
		return siteId;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public List<Object> getCanceledItems(){
		return canceledItems;
	}

	public String getShipmentStatus(){
		return shipmentStatus;
	}

	public Customer getCustomer(){
		return customer;
	}

	public List<Integer> getChildShipmentNumbers(){
		return childShipmentNumbers;
	}

	public List<Object> getTransferShipmentNumbers(){
		return transferShipmentNumbers;
	}

	public int getParentShipmentNumber(){
		return parentShipmentNumber;
	}

	public int getOriginalShipmentNumber(){
		return originalShipmentNumber;
	}

	public ShipmentStatusReason getShipmentStatusReason(){
		return shipmentStatusReason;
	}
}