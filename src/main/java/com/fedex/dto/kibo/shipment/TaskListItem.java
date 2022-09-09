package com.fedex.dto.kibo.shipment;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskListItem{

	@JsonProperty("_links")
	private Links links;

	@JsonProperty("subject")
	private String subject;

	@JsonProperty("inputs")
	private List<InputsItem> inputs;

	@JsonProperty("name")
	private String name;

	@JsonProperty("active")
	private boolean active;

	@JsonProperty("completed")
	private boolean completed;

	@JsonProperty("description")
	private String description;

	@JsonProperty("skippable")
	private boolean skippable;

	@JsonProperty("taskId")
	private String taskId;

	@JsonProperty("completedDate")
	private String completedDate;

	public Links getLinks(){
		return links;
	}

	public String getSubject(){
		return subject;
	}

	public List<InputsItem> getInputs(){
		return inputs;
	}

	public String getName(){
		return name;
	}

	public boolean isActive(){
		return active;
	}

	public boolean isCompleted(){
		return completed;
	}

	public String getDescription(){
		return description;
	}

	public boolean isSkippable(){
		return skippable;
	}

	public String getTaskId(){
		return taskId;
	}

	public String getCompletedDate(){
		return completedDate;
	}
}