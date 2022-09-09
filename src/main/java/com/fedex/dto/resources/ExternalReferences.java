package com.fedex.dto.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalReferences{

	@JsonProperty("other")
	private String other;

	@JsonProperty("invoiceNumber")
	private String invoiceNumber;

	@JsonProperty("deptNumber")
	private String deptNumber;

	@JsonProperty("rmaNumber")
	private String rmaNumber;

	@JsonProperty("poNumber")
	private String poNumber;

	@JsonProperty("url")
	private String url;

	public String getOther(){
		return other;
	}

	public String getInvoiceNumber(){
		return invoiceNumber;
	}

	public String getDeptNumber(){
		return deptNumber;
	}

	public String getRmaNumber(){
		return rmaNumber;
	}

	public String getPoNumber(){
		return poNumber;
	}

	public String getUrl(){
		return url;
	}
}