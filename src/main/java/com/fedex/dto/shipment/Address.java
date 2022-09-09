package com.fedex.dto.shipment;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{

	@JsonProperty("city")
	private String city;

	@JsonProperty("countryCode")
	private String countryCode;

	@JsonProperty("streetLines")
	private List<String> streetLines;

	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("county")
	private String county;

	@JsonProperty("stateOrProvinceCode")
	private String stateOrProvinceCode;

	public String getCity(){
		return city;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public List<String> getStreetLines(){
		return streetLines;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public String getCounty(){
		return county;
	}

	public String getStateOrProvinceCode(){
		return stateOrProvinceCode;
	}
}