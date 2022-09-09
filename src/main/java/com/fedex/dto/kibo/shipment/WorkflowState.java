package com.fedex.dto.kibo.shipment;

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

	@JsonProperty("taskList")
	private List<TaskListItem> taskList;

	@JsonProperty("activeTaskName")
	private String activeTaskName;

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

	public List<TaskListItem> getTaskList(){
		return taskList;
	}

	public String getActiveTaskName(){
		return activeTaskName;
	}
}