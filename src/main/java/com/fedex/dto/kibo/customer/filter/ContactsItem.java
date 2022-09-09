package com.fedex.dto.kibo.customer.filter;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactsItem{

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("accountId")
	private int accountId;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("types")
	private List<TypesItem> types;

	@JsonProperty("address")
	private Address address;

	@JsonProperty("lastNameOrSurname")
	private String lastNameOrSurname;

	@JsonProperty("id")
	private int id;

	@JsonProperty("email")
	private String email;

	@JsonProperty("phoneNumbers")
	private PhoneNumbers phoneNumbers;

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public int getAccountId(){
		return accountId;
	}

	public String getFirstName(){
		return firstName;
	}

	public List<TypesItem> getTypes(){
		return types;
	}

	public Address getAddress(){
		return address;
	}

	public String getLastNameOrSurname(){
		return lastNameOrSurname;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public PhoneNumbers getPhoneNumbers(){
		return phoneNumbers;
	}
}