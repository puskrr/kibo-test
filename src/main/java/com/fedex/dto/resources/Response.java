package com.fedex.dto.resources;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("shipper")
	private Shipper shipper;

	@JsonProperty("externalReferences")
	private ExternalReferences externalReferences;

	@JsonProperty("totalDeclaredValue")
	private TotalDeclaredValue totalDeclaredValue;

	@JsonProperty("packages")
	private List<PackagesItem> packages;

	@JsonProperty("visibilityReleases")
	private VisibilityReleases visibilityReleases;

	@JsonProperty("deliveryDetail")
	private DeliveryDetail deliveryDetail;

	@JsonProperty("pickupDetail")
	private PickupDetail pickupDetail;

	@JsonProperty("displayImage")
	private DisplayImage displayImage;

	@JsonProperty("contentDescription")
	private String contentDescription;

	@JsonProperty("service")
	private Service service;

	@JsonProperty("recipient")
	private Recipient recipient;

	@JsonProperty("category")
	private String category;

	@JsonProperty("notifications")
	private Notifications notifications;

	public Shipper getShipper(){
		return shipper;
	}

	public ExternalReferences getExternalReferences(){
		return externalReferences;
	}

	public TotalDeclaredValue getTotalDeclaredValue(){
		return totalDeclaredValue;
	}

	public List<PackagesItem> getPackages(){
		return packages;
	}

	public VisibilityReleases getVisibilityReleases(){
		return visibilityReleases;
	}

	public DeliveryDetail getDeliveryDetail(){
		return deliveryDetail;
	}

	public PickupDetail getPickupDetail(){
		return pickupDetail;
	}

	public DisplayImage getDisplayImage(){
		return displayImage;
	}

	public String getContentDescription(){
		return contentDescription;
	}

	public Service getService(){
		return service;
	}

	public Recipient getRecipient(){
		return recipient;
	}

	public String getCategory(){
		return category;
	}

	public Notifications getNotifications(){
		return notifications;
	}
}