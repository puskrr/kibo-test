package com.fedex.dto.kibo.shipments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links{

	@JsonProperty("next")
	private Next next;

	@JsonProperty("last")
	private Last last;

	@JsonProperty("self")
	private Self self;

	@JsonProperty("first")
	private First first;

	@JsonProperty("cancel")
	private Cancel cancel;

	@JsonProperty("reassignItems")
	private ReassignItems reassignItems;

	@JsonProperty("fulfill")
	private Fulfill fulfill;

	@JsonProperty("reassign")
	private Reassign reassign;

	@JsonProperty("shipments")
	private Shipments shipments;

	@JsonProperty("backorderItems")
	private BackorderItems backorderItems;

	@JsonProperty("backorder")
	private Backorder backorder;

	@JsonProperty("rejectItems")
	private RejectItems rejectItems;

	@JsonProperty("workflowInstanceImage")
	private WorkflowInstanceImage workflowInstanceImage;

	@JsonProperty("reject")
	private Reject reject;

	@JsonProperty("cancelItems")
	private CancelItems cancelItems;

	@JsonProperty("tasks")
	private Tasks tasks;

	@JsonProperty("execute")
	private Execute execute;

	public Next getNext(){
		return next;
	}

	public Last getLast(){
		return last;
	}

	public Self getSelf(){
		return self;
	}

	public First getFirst(){
		return first;
	}

	public Cancel getCancel(){
		return cancel;
	}

	public ReassignItems getReassignItems(){
		return reassignItems;
	}

	public Fulfill getFulfill(){
		return fulfill;
	}

	public Reassign getReassign(){
		return reassign;
	}

	public Shipments getShipments(){
		return shipments;
	}

	public BackorderItems getBackorderItems(){
		return backorderItems;
	}

	public Backorder getBackorder(){
		return backorder;
	}

	public RejectItems getRejectItems(){
		return rejectItems;
	}

	public WorkflowInstanceImage getWorkflowInstanceImage(){
		return workflowInstanceImage;
	}

	public Reject getReject(){
		return reject;
	}

	public CancelItems getCancelItems(){
		return cancelItems;
	}

	public Tasks getTasks(){
		return tasks;
	}

	public Execute getExecute(){
		return execute;
	}
}