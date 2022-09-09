package com.fedex.dto.kibo.shipments;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PackagesItem{

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("carrier")
	private String carrier;

	@JsonProperty("returnTrackingNumbers")
	private List<Object> returnTrackingNumbers;

	@JsonProperty("trackings")
	private List<TrackingsItem> trackings;

	@JsonProperty("stringBarcode")
	private String stringBarcode;

	@JsonProperty("packingSlipItemDetails")
	private List<Object> packingSlipItemDetails;

	@JsonProperty("packageId")
	private String packageId;

	@JsonProperty("trackingNumbers")
	private List<String> trackingNumbers;

	@JsonProperty("measurements")
	private Measurements measurements;

	@JsonProperty("shippingMethodCode")
	private String shippingMethodCode;

	@JsonProperty("shippingMethodName")
	private String shippingMethodName;

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public String getCarrier(){
		return carrier;
	}

	public List<Object> getReturnTrackingNumbers(){
		return returnTrackingNumbers;
	}

	public List<TrackingsItem> getTrackings(){
		return trackings;
	}

	public String getStringBarcode(){
		return stringBarcode;
	}

	public List<Object> getPackingSlipItemDetails(){
		return packingSlipItemDetails;
	}

	public String getPackageId(){
		return packageId;
	}

	public List<String> getTrackingNumbers(){
		return trackingNumbers;
	}

	public Measurements getMeasurements(){
		return measurements;
	}

	public String getShippingMethodCode(){
		return shippingMethodCode;
	}

	public String getShippingMethodName(){
		return shippingMethodName;
	}
}