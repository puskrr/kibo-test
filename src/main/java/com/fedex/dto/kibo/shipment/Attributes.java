package com.fedex.dto.kibo.shipment;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes{

	@JsonProperty("metadata")
	private List<MetadataItem> metadata;

	public List<MetadataItem> getMetadata(){
		return metadata;
	}
}