package com.fedex.dto.kibo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerCreationRequest {

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("emailAddress")
	private String emailAddress;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("lastNameOrSurname")
	private String lastNameOrSurname;

	@JsonProperty("externalId")
	private String externalId;

	@JsonProperty("phoneNumbers")
	private PhoneNumbers phoneNumbers;

	public String getFirstName(){
		return firstName;
	}

	public String getEmailAddress(){
		return emailAddress;
	}

	public Address getAddress(){
		return address;
	}

	public String getLastNameOrSurname(){
		return lastNameOrSurname;
	}

	public String getExternalId(){
		return externalId;
	}

	public PhoneNumbers getPhoneNumbers(){
		return phoneNumbers;
	}
}