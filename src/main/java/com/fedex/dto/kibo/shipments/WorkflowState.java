package com.fedex.dto.kibo.shipments;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkflowState{

	@JsonProperty("shipmentState")
	private String shipmentState;

	@JsonProperty("auditInfo")
	private AuditInfo auditInfo;

	@JsonProperty("processInstanceId")
	private String processInstanceId;

	@JsonProperty("variables")
	private Variables variables;

	@JsonProperty("activeTaskName")
	private String activeTaskName;

	@JsonProperty("taskList")
	private List<TaskListItem> taskList;

	public String getShipmentState(){
		return shipmentState;
	}

	public AuditInfo getAuditInfo(){
		return auditInfo;
	}

	public String getProcessInstanceId(){
		return processInstanceId;
	}

	public Variables getVariables(){
		return variables;
	}

	public String getActiveTaskName(){
		return activeTaskName;
	}

	public List<TaskListItem> getTaskList(){
		return taskList;
	}
}