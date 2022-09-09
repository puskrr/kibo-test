package com.fedex.dto.shipment;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Service{

	@JsonProperty("serviceType")
	private String serviceType;

	@JsonProperty("signatureService")
	private String signatureService;

	@JsonProperty("restrictions")
	private Restrictions restrictions;

	@JsonProperty("specialServices")
	private List<Object> specialServices;

	public String getServiceType(){
		return serviceType;
	}

	public String getSignatureService(){
		return signatureService;
	}

	public Restrictions getRestrictions(){
		return restrictions;
	}

	public List<Object> getSpecialServices(){
		return specialServices;
	}
}