package com.fedex.dto.kibo.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangeMessagesItem{

	@JsonProperty("createdDate")
	private String createdDate;

	@JsonProperty("appId")
	private String appId;

	@JsonProperty("appKey")
	private String appKey;

	@JsonProperty("correlationId")
	private String correlationId;

	@JsonProperty("changeMessageId")
	private String changeMessageId;

	@JsonProperty("message")
	private String message;

	@JsonProperty("userId")
	private String userId;

	@JsonProperty("newValue")
	private String newValue;

	@JsonProperty("subject")
	private String subject;

	@JsonProperty("oldValue")
	private String oldValue;

	@JsonProperty("userDisplayName")
	private String userDisplayName;

	@JsonProperty("attributes")
	private Attributes attributes;

	@JsonProperty("metadata")
	private String metadata;

	public String getCreatedDate(){
		return createdDate;
	}

	public String getAppId(){
		return appId;
	}

	public String getAppKey(){
		return appKey;
	}

	public String getCorrelationId(){
		return correlationId;
	}

	public String getChangeMessageId(){
		return changeMessageId;
	}

	public String getMessage(){
		return message;
	}

	public String getUserId(){
		return userId;
	}

	public String getNewValue(){
		return newValue;
	}

	public String getSubject(){
		return subject;
	}

	public String getOldValue(){
		return oldValue;
	}

	public String getUserDisplayName(){
		return userDisplayName;
	}

	public Attributes getAttributes(){
		return attributes;
	}

	public String getMetadata(){
		return metadata;
	}
}