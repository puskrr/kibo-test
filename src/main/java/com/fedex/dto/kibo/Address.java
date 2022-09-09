package com.fedex.dto.kibo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address{

	@JsonProperty("postalOrZipCode")
	private String postalOrZipCode;

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

	public String getPostalOrZipCode(){
		return postalOrZipCode;
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
}