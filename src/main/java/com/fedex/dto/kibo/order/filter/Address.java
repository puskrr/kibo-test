package com.fedex.dto.kibo.order.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{

	@JsonProperty("postalOrZipCode")
	private String postalOrZipCode;

	@JsonProperty("isValidated")
	private boolean isValidated;

	@JsonProperty("stateOrProvince")
	private String stateOrProvince;

	@JsonProperty("address2")
	private String address2;

	@JsonProperty("address1")
	private String address1;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("addressType")
	private String addressType;

	@JsonProperty("cityOrTown")
	private String cityOrTown;

	@JsonProperty("address3")
	private String address3;

	@JsonProperty("address4")
	private String address4;

	public String getPostalOrZipCode(){
		return postalOrZipCode;
	}

	public boolean isIsValidated(){
		return isValidated;
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

	public String getCountryCode(){
		return countryCode;
	}

	public String getAddressType(){
		return addressType;
	}

	public String getCityOrTown(){
		return cityOrTown;
	}

	public String getAddress3(){
		return address3;
	}

	public String getAddress4(){
		return address4;
	}
}