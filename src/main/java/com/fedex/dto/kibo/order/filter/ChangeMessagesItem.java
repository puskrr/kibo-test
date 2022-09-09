package com.fedex.dto.kibo.order.filter;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangeMessagesItem{

	@JsonProperty("identifier")
	private String identifier;

	@JsonProperty("newValue")
	private String newValue;

	@JsonProperty("metadata")
	private List<MetadataItem> metadata;

	@JsonProperty("subject")
	private String subject;

	@JsonProperty("verb")
	private String verb;

	@JsonProperty("message")
	private String message;

	@JsonProperty("subjectType")
	private String subjectType;

	@JsonProperty("success")
	private boolean success;

	@JsonProperty("appId")
	private String appId;

	@JsonProperty("correlationId")
	private String correlationId;

	@JsonProperty("appKey")
	private String appKey;

	@JsonProperty("id")
	private String id;

	@JsonProperty("oldValue")
	private String oldValue;

	@JsonProperty("createDate")
	private String createDate;

	public String getIdentifier(){
		return identifier;
	}

	public String getNewValue(){
		return newValue;
	}

	public List<MetadataItem> getMetadata(){
		return metadata;
	}

	public String getSubject(){
		return subject;
	}

	public String getVerb(){
		return verb;
	}

	public String getMessage(){
		return message;
	}

	public String getSubjectType(){
		return subjectType;
	}

	public boolean isSuccess(){
		return success;
	}

	public String getAppId(){
		return appId;
	}

	public String getCorrelationId(){
		return correlationId;
	}

	public String getAppKey(){
		return appKey;
	}

	public String getId(){
		return id;
	}

	public String getOldValue(){
		return oldValue;
	}

	public String getCreateDate(){
		return createDate;
	}
}