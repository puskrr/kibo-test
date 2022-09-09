package com.fedex.dto.kibo.customer.filter;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("notes")
	private List<Object> notes;

	@JsonProperty("taxExempt")
	private boolean taxExempt;

	@JsonProperty("customerSet")
	private String customerSet;

	@JsonProperty("commerceSummary")
	private CommerceSummary commerceSummary;

	@JsonProperty("accountType")
	private String accountType;

	@JsonProperty("externalId")
	private String externalId;

	@JsonProperty("isActive")
	private boolean isActive;

	@JsonProperty("acceptsMarketing")
	private boolean acceptsMarketing;

	@JsonProperty("segments")
	private List<Object> segments;

	@JsonProperty("customerSinceDate")
	private String customerSinceDate;

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("emailAddress")
	private String emailAddress;

	@JsonProperty("isAnonymous")
	private boolean isAnonymous;

	@JsonProperty("isLocked")
	private boolean isLocked;

	@JsonProperty("attributes")
	private List<Object> attributes;

	@JsonProperty("id")
	private int id;

	@JsonProperty("contacts")
	private List<Object> contacts;

	@JsonProperty("hasExternalPassword")
	private boolean hasExternalPassword;

	public String getLastName(){
		return lastName;
	}

	public List<Object> getNotes(){
		return notes;
	}

	public boolean isTaxExempt(){
		return taxExempt;
	}

	public String getCustomerSet(){
		return customerSet;
	}

	public CommerceSummary getCommerceSummary(){
		return commerceSummary;
	}

	public String getAccountType(){
		return accountType;
	}

	public String getExternalId(){
		return externalId;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public boolean isAcceptsMarketing(){
		return acceptsMarketing;
	}

	public List<Object> getSegments(){
		return segments;
	}

	public String getCustomerSinceDate(){
		return customerSinceDate;
	}

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getEmailAddress(){
		return emailAddress;
	}

	public boolean isIsAnonymous(){
		return isAnonymous;
	}

	public boolean isIsLocked(){
		return isLocked;
	}

	public List<Object> getAttributes(){
		return attributes;
	}

	public int getId(){
		return id;
	}

	public List<Object> getContacts(){
		return contacts;
	}

	public boolean isHasExternalPassword(){
		return hasExternalPassword;
	}
}