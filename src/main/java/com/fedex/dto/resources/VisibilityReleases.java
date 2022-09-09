package com.fedex.dto.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VisibilityReleases{

	@JsonProperty("showShipmentDisplayName")
	private boolean showShipmentDisplayName;

	@JsonProperty("showShipperDisplayImage")
	private boolean showShipperDisplayImage;

	@JsonProperty("releaseTimestamp")
	private long releaseTimestamp;

	@JsonProperty("showShipmentDisplayImage")
	private boolean showShipmentDisplayImage;

	@JsonProperty("showPickupLocation")
	private boolean showPickupLocation;

	@JsonProperty("showShipperDisplayName")
	private boolean showShipperDisplayName;

	public boolean isShowShipmentDisplayName(){
		return showShipmentDisplayName;
	}

	public boolean isShowShipperDisplayImage(){
		return showShipperDisplayImage;
	}

	public long getReleaseTimestamp(){
		return releaseTimestamp;
	}

	public boolean isShowShipmentDisplayImage(){
		return showShipmentDisplayImage;
	}

	public boolean isShowPickupLocation(){
		return showPickupLocation;
	}

	public boolean isShowShipperDisplayName(){
		return showShipperDisplayName;
	}
}