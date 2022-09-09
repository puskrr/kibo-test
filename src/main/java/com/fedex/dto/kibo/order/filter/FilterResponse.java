package com.fedex.dto.kibo.order.filter;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilterResponse {

	@JsonProperty("startIndex")
	private int startIndex;

	@JsonProperty("pageCount")
	private int pageCount;

	@JsonProperty("pageSize")
	private int pageSize;

	@JsonProperty("totalCount")
	private int totalCount;

	@JsonProperty("items")
	private List<ItemsItem> items;

	public int getStartIndex(){
		return startIndex;
	}

	public int getPageCount(){
		return pageCount;
	}

	public int getPageSize(){
		return pageSize;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public List<ItemsItem> getItems(){
		return items;
	}
}