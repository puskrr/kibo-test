package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{

	@JsonProperty("isValidated")
	private boolean isValidated;

	@JsonProperty("postalOrZipCode")
	private String postalOrZipCode;

	@JsonProperty("address3")
	private String address3;

	@JsonProperty("stateOrProvince")
	private String stateOrProvince;

	@JsonProperty("address2")
	private String address2;

	@JsonProperty("address1")
	private String address1;

	@JsonProperty("addressType")
	private String addressType;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("address4")
	private String address4;

	@JsonProperty("cityOrTown")
	private String cityOrTown;

	public boolean isIsValidated(){
		return isValidated;
	}

	public String getPostalOrZipCode(){
		return postalOrZipCode;
	}

	public String getAddress3(){
		return address3;
	}

	public String getStateOrProvince(){
		return stateOrProvince;
	}

	public String getAddress2(){
		return address2;
	}

	public String getAddress1(){
		return address1;
	}

	public String getAddressType(){
		return addressType;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public String getAddress4(){
		return address4;
	}

	public String getCityOrTown(){
		return cityOrTown;
	}
}